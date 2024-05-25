package com.example.teste_pipeline.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

}