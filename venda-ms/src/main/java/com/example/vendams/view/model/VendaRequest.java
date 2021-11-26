package com.example.vendams.view.model;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;

import com.example.vendams.shared.Produto;

public class VendaRequest {
    
    private LocalDate dataVenda;

    @DecimalMin(value = "0.01", message = "O Valor mínimo de uma venda é de R$0.01")
    private Double valorTotal;

    @NotEmpty(message = "A venda precisa de produtos para ser realizada!")
    private List<Produto> produtosVendidos;
    
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
