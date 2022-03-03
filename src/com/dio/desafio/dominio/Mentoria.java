package com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

    int cargaHoraria;
    LocalDate dataMentoria;


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }
    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }


}
