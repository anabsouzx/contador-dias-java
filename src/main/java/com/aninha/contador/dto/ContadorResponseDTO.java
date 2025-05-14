package com.aninha.contador.dto;

public class ContadorResponseDTO {
    private int diasRestantes;
    private String dataHojeFormatada;
    private String dataFeriasFormatada;

    // construtor
    public ContadorResponseDTO(int diasRestantes, String dataHojeFormatada, String dataFeriasFormatada) {
        this.diasRestantes = diasRestantes;
        this.dataHojeFormatada = dataHojeFormatada;
        this.dataFeriasFormatada = dataFeriasFormatada;
    }

    // getters
    public int getDiasRestantes() { return diasRestantes; }
    public String getDataHojeFormatada() { return dataHojeFormatada; }
    public String getDataFeriasFormatada() { return dataFeriasFormatada; }
}