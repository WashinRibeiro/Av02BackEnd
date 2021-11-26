package com.example.vendams.service;
import java.util.List;
import java.util.Optional;
import com.example.vendams.shared.PeriodoDeVendasDto;
import com.example.vendams.shared.VendaDto;

public interface VendaService {
    
    //GETS
    List<VendaDto> obterTodasVendas();
    Optional<VendaDto> obterVendaPorId(String id);
    Optional<List<VendaDto>> obterVendaPorPeriodo(PeriodoDeVendasDto periodo);

    //POSTS
    VendaDto cadastrarVenda(VendaDto dto);
   
    //PUTS
    VendaDto atualizarVenda(VendaDto venda);

    //DELETES
    void removerVenda(String id);
}
