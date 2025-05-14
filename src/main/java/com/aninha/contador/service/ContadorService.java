package com.aninha.contador.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContadorService {
    // declaração de dias
    public LocalDate hoje = LocalDate.now();
    public LocalDate ferias = LocalDate.of(2025, 6, 18);

    // formataçao padrao brasileiro
    public DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public String hojeBR = hoje.format(formatoBR);
    public String feriasBR = ferias.format(formatoBR);

    // transformando em inteiros
    public int diaAtual = hoje.getDayOfYear();
    public int diaFinal = ferias.getDayOfYear();

    // fazendo a contagem
    public int contarDiasUteis() {
        int restante = 0;
        LocalDate dataAgora = this.hoje;

        while (dataAgora.isBefore(this.ferias)) {
            DayOfWeek diaSemana = dataAgora.getDayOfWeek();
            if (diaSemana != DayOfWeek.MONDAY && diaSemana != DayOfWeek.SATURDAY
                    && diaSemana != DayOfWeek.SUNDAY) {
                restante++;
            }

            dataAgora = dataAgora.plusDays(1);
        }
        return restante;
    }

}
