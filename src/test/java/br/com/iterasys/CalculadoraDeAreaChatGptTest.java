package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculadoraDeAreaChatGptTest {

    @Test
    public void testCalcularAreaQuadrado() {
        double lado = 5.0;
        double expectedArea = 25.0;
        double actualArea = CalculadoraDeAreaChatGpt.calcularAreaQuadrado(lado);
        Assert.assertEquals(actualArea, expectedArea);
    }

    @Test
    public void testCalcularAreaRetangulo() {
        double base = 4.0;
        double altura = 6.0;
        double expectedArea = 24.0;
        double actualArea = CalculadoraDeAreaChatGpt.calcularAreaRetangulo(base, altura);
        Assert.assertEquals(actualArea, expectedArea);
    }

    @Test
    public void testCalcularAreaTriangulo() {
        double base = 8.0;
        double altura = 5.0;
        double expectedArea = 20.0;
        double actualArea = CalculadoraDeAreaChatGpt.calcularAreaTriangulo(base, altura);
        Assert.assertEquals(actualArea, expectedArea);
    }

    @Test
    public void testCalcularAreaCirculo() {
        double raio = 3.0;
        double expectedArea = 28.274333882308138;
        double actualArea = CalculadoraDeAreaChatGpt.calcularAreaCirculo(raio);
        Assert.assertEquals(actualArea, expectedArea, 0.0001);
    }
}
