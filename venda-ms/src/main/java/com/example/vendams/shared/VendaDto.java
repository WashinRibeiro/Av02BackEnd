package com.example.vendams.shared;

import java.time.LocalDate;
import java.util.List;

public class VendaDto {
    private String id;
    private String codigo;
    private LocalDate dataVenda;
    private Double valorTotal;
    private List<Produto> produtosVendidos;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
