package com.example.vendams.service;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.vendams.model.Venda;
import com.example.vendams.repository.VendaRepository;
import com.example.vendams.shared.PeriodoDeVendasDto;
import com.example.vendams.shared.VendaDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaServiceImpl implements VendaService {

    @Autowired
    private VendaRepository repository;

    private ModelMapper mapper = new ModelMapper();

    // Obtem uma lista com todas as vendas registrada
    @Override
    public List<VendaDto> obterTodasVendas() {
        List<VendaDto> dtos = repository.findAll().stream()
            .map(venda -> mapper.map(venda, VendaDto.class))
            .collect(Collectors.toList());

        return dtos;
    }
    
    @Override
    public VendaDto cadastrarVenda(VendaDto dto) {
        Venda venda = repository.save(mapper.map(dto, Venda.class));

        return mapper.map(venda, VendaDto.class);
    }

    // Atualizar um registro de venda
    @Override
    public VendaDto atualizarVenda(VendaDto venda) {
        Venda vendaAtualizada = repository.save(mapper.map(venda, Venda.class));

        return mapper.map(vendaAtualizada, VendaDto.class);
    }

    // Remove uma venda por meio de um id
    @Override
    public void removerVenda(String id) {
        repository.deleteById(id);
        
    }

    // Obtem uma única venda pelo seu Id
    @Override
    public Optional<VendaDto> obterVendaPorId(String id) {
        Optional<Venda> vendaEncontradaOptional = repository.findById(id);

        if(vendaEncontradaOptional.isPresent()) {
            VendaDto dto = mapper.map(vendaEncontradaOptional.get(), VendaDto.class);

            return Optional.of(dto);
        }

        return Optional.empty();
    }

    // Obtem uma lista de Vendas dentro de um período
    @Override
    public Optional<List<VendaDto>> obterVendaPorPeriodo(PeriodoDeVendasDto periodo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-mm-dd");
        LocalDate dataInicial = LocalDate.parse(periodo.getDataIncial().toString(),  formatter);
        LocalDate dataFinal = LocalDate.parse(periodo.getDataFinal().toString(),  formatter);

        List<Venda> listVendas = repository.obterVendasPorPeriodo(dataInicial, dataFinal);
        Optional<List<Venda>> optionalVendas = Optional.of(listVendas);

        if(optionalVendas.isPresent()) {
            List<VendaDto> listDtoVendas = optionalVendas.get().stream()
            .map(venda -> mapper.map(venda, VendaDto.class))
            .collect(Collectors.toList());

            return Optional.of(listDtoVendas);
        }

        return Optional.empty();
    }
    
}
