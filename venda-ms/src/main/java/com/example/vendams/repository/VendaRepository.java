package com.example.vendams.repository;

import java.time.LocalDate;
import java.util.List;

import com.example.vendams.model.Venda;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends MongoRepository<Venda, String> {
    
    @Query("{$and: [{'dataVenda': {$gte: ?0} }, {'dataVenda': {$lte: ?1} }] }   ")
    List<Venda> obterVendasPorPeriodo(LocalDate dataInicial, LocalDate dataFinal);

    
}
