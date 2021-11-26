package com.example.vendams.model;

import java.time.LocalDate;
import java.util.List;

import com.example.vendams.shared.Produto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("vendas")
public class Venda {
    
    @Id
    private String id;
    private LocalDate dataVenda;
    private Double valorTotal;
    private List<Produto> produtosVendidos;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public LocalDate getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public List<Produto> getProdutosVendidos() {
        return produtosVendidos;
    }
    public void setProdutosVendidos(List<Produto> produtosVendidos) {
        this.produtosVendidos = produtosVendidos;
    }

    
}
