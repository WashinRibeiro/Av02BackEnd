package com.example.vendams.shared;

import java.time.LocalDate;

public class PeriodoDeVendasDto {

    private LocalDate dataIncial;
    private LocalDate dataFinal;

    public LocalDate getDataIncial() {
        return dataIncial;
    }
    public void setDataIncial(LocalDate dataIncial) {
        this.dataIncial = dataIncial;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }
    
}
