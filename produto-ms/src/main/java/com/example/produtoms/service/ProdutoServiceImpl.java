package com.example.produtoms.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import com.example.produtoms.model.Produto;
import com.example.produtoms.repository.ProdutoRepository;
import com.example.produtoms.shared.ProdutoDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    private ProdutoRepository repository;

    private ModelMapper mapper = new ModelMapper();

    // Obter lista com todos os produtos
    @Override
    public List<ProdutoDto> obterTodosProdutos() {
        List<ProdutoDto> listaDto = repository.findAll().stream()
            .map(p -> mapper.map(p, ProdutoDto.class))
            .collect(Collectors.toList());

        return listaDto;
    }

    // Cadastrar um novo produto
    @Override
    public ProdutoDto cadastrarProduto(ProdutoDto dto) {
        Produto produtoNovo = mapper.map(dto, Produto.class);

        return mapper.map(repository.save(produtoNovo), ProdutoDto.class);
    }

    // Atualizar produto por ID
    @Override
    public ProdutoDto atualizarProdutoPorID(String id, ProdutoDto dto) {
        dto.setId(id);  

        Produto produtoAtualizado = mapper.map(dto, Produto.class);

        return mapper.map(repository.save(produtoAtualizado), ProdutoDto.class);
    }

    // Remover produto por ID
    @Override
    public void removerProdutoPorId(String id) {
        repository.deleteById(id);
    }

    // Obter produto por id
    @Override
    public Optional<ProdutoDto> obterProdutoPorId(String id) {
        Optional<Produto> optional = repository.findById(id);

        if(optional.isPresent()) {
            
            return Optional.of(mapper.map(optional.get(), ProdutoDto.class));
        }

        return Optional.empty();
    }

    // Obter lista de produtos com o mesmo nome
    @Override
    public Optional<List<ProdutoDto>> obterPorNomeEmComum(String nome) {
        List<Produto> produtosEncontrados = repository.obterPorNomeEmComum(nome);

        Optional<List<Produto>> optionalEncontrado = Optional.of(produtosEncontrados);

        if(optionalEncontrado.isPresent()) {
            List<ProdutoDto> listDtos = optionalEncontrado.get().stream()
                .map(produto -> mapper.map(produto, ProdutoDto.class))
                .collect(Collectors.toList());

            return Optional.of(listDtos);
        }

        return Optional.empty();
    }
    
}
