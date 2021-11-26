package com.example.vendams.clienteHTTP;

import java.util.ArrayList;
import java.util.List;

import com.example.vendams.shared.Produto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "produto-ms", fallback = ProdutoFeignClientFallback.class)
public interface ProdutoFeignClient {
    @GetMapping(path = "/api/produtos")
    List<Produto> obterProdutos();   
}

@Component
class ProdutoFeignClientFallback implements ProdutoFeignClient {

    @Override
    public List<Produto> obterProdutos() {
        return new ArrayList<>();
    }

}