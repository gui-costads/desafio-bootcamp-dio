package com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{

     private int cargaHoraria;


    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


}
