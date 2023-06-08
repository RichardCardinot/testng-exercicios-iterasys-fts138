package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculadoraDeAreaTest {

    @Test
    public static void areaQuadradoTest() {
        // Arrange
        double lado = 3, resultadoEsperado = 9, resultadoAtual;

        // Act
        resultadoAtual = CalculadoraDeArea.areaQuadrado(lado);

        // Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public static void areaRetanguloTest() {
        // Arrange
        double base = 4, altura = 2, resultadoEsperado = 8, resultadoAtual;

        // Act
        resultadoAtual = CalculadoraDeArea.areaRetangulo(base, altura);

        // Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public static void areaTrianguloTest() {
        // Arrange
        double base = 4, altura = 2, resultadoEsperado = 4, resultadoAtual;

        // Act
        resultadoAtual = CalculadoraDeArea.areaTriangulo(base, altura);

        // Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public static void areaCirculoTest() {
        // Arrange
        double raio = 2, resultadoEsperado = 12.566370614359172, resultadoAtual;

        // Act
        resultadoAtual = CalculadoraDeArea.areaCirculo(raio);

        // Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }
}
