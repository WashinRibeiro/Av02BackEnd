package com.example.vendams.utility;

import java.util.Comparator;

import com.example.vendams.view.model.VendaResponse;

public class CompararVendaPorData implements Comparator<VendaResponse>{

    @Override
    public int compare(VendaResponse v1, VendaResponse v2) {
        int difHora = v1.getDataVenda().getYear() - v2.getDataVenda().getYear();

        if(difHora != 0) {
            return difHora;
        }

        int difMinuto = v1.getDataVenda().getMonthValue() - v2.getDataVenda().getMonthValue();

        if(difMinuto != 0) {
            return difMinuto;
        }

        int difSegundos = v1.getDataVenda().getDayOfMonth() - v2.getDataVenda().getDayOfMonth();

        return difSegundos;
    }
    
}
