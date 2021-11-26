package com.example.vendams.clienteHTTP;

import java.util.ArrayList;
import java.util.List;

import com.example.vendams.view.model.VendaResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "venda-ms", fallback = VendaFeignClientFallback.class)
public interface VendaFeignClient {
    @GetMapping(path = "/api/vendas/")
    List<VendaResponse> obterVendas();   
}

@Component
class VendaFeignClientFallback implements VendaFeignClient {

    @Override
    public List<VendaResponse> obterVendas() {
        return new ArrayList<>();
    }

}