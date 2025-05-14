package com.aninha.contador.controller;

import com.aninha.contador.dto.ContadorResponseDTO;
import com.aninha.contador.service.ContadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ContadorController {

    @GetMapping("/contagem")
    public ContadorResponseDTO obterContagem(){
        ContadorService contador = new ContadorService();

        int diasRestantes = contador.contarDiasUteis();
        String hojeFormatado = contador.hojeBR;
        String feriasFormatada = contador.feriasBR;

        return new ContadorResponseDTO(diasRestantes, hojeFormatado, feriasFormatada);
    }
}
