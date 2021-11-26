package com.example.produtoms.service;
import java.util.List;
import java.util.Optional;
import com.example.produtoms.shared.ProdutoDto;

public interface ProdutoService {
    //GETS

    List<ProdutoDto> obterTodosProdutos();
    Optional<ProdutoDto> obterProdutoPorId(String id);
    Optional<List<ProdutoDto>> obterPorNomeEmComum(String nome);

    //POSTS
    ProdutoDto cadastrarProduto(ProdutoDto dto);

    //PUTS
    ProdutoDto atualizarProdutoPorID(String id, ProdutoDto dto);

    //DELETES
    void removerProdutoPorId(String id);
}
