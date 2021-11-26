package com.example.vendams.view.model;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;

import com.example.vendams.shared.Produto;

public class VendaResponse {
    private String id;
    
    private LocalDate dataVenda;

    @DecimalMin(value = "0.01", message = "O Valor mínimo de uma venda é de R$0.01")
    private Double valorTotal;

    @NotEmpty(message = "A venda precisa de produtos para ser realizada!")
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
