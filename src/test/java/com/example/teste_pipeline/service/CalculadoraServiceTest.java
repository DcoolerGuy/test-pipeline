package com.example.teste_pipeline.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.server.ResponseStatusException;

class CalculadoraServiceTest {
    @Test
    @DisplayName("Deve retornar valor 5")
    void dividir(){
        CalculadoraService calculadoraService = new CalculadoraService();

        double a = 10;
        double b = 2;
        double esperado = 5;

        double resultado = calculadoraService.dividir(a, b);

        Assertions.assertEquals(resultado, esperado);
    }

    @Test
    @DisplayName("Deve retornar valor 5")
    void dividirComRetornoException(){
        CalculadoraService calculadoraService = new CalculadoraService();

        double a = 10;
        double b = 0;
        var mensagemEsperada = "400 BAD_REQUEST \"Divisão por zero não aceita\"";

        ResponseStatusException responseStatusException = Assertions.assertThrows(
                ResponseStatusException.class, () -> calculadoraService.dividir(a, b)
        );

        Assertions.assertEquals(responseStatusException.getMessage(), mensagemEsperada);
    }

}