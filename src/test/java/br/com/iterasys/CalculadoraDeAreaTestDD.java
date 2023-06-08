package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculadoraDeAreaTestDD {

    @DataProvider (name = "MassaAreaQuadrado")
    public Object[][] massaAreaQuadrado() {
        return new Object[][] {
            { 1, 1  },
            { 2, 4  },
            { 3, 9  },
            { 4, 16 }
        };
    };

    @DataProvider (name = "MassaAreaRetangulo")
    public Object[][] massaAreaRetangulo() {
        return new Object[][] {
            { 1, 2, 2  },
            { 2, 2, 4  },
            { 4, 4, 16 },
            { 8, 8, 64 }
        };
    };

    @DataProvider (name = "MassaAreaTriangulo")
    public Object[][] massaAreaTriangulo() {
        return new Object[][] {
            { 1, 2, 1  },
            { 2, 2, 2  },
            { 4, 4, 8  },
            { 8, 8, 32 }
        };
    };

    @DataProvider (name = "MassaAreaCirculo")
    public Object[][] massaAreaCirculo() {
        return new Object[][] {
            { 1, 3.141592653589793  },
            { 2, 12.566370614359172 },
            { 3, 28.274333882308138 },
            { 4, 50.26548245743669  }
        };
    }

    @Test(dataProvider = "MassaAreaQuadrado")
    public static void areaQuadradoTest(double lado, double resultadoEsperado) {
        // Arrange
        // Dados fornecidos pelo dataProvider
        double resultadoAtual;

        // Act
        resultadoAtual = CalculadoraDeArea.areaQuadrado(lado);

        // Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test(dataProvider = "MassaAreaRetangulo")
    public static void areaRetanguloTest(double base, double altura, double resultadoEsperado) {
        // Arrange
        // Dados fornecidos pelo dataProvider
        double resultadoAtual;

        // Act
        resultadoAtual = CalculadoraDeArea.areaRetangulo(base, altura);

        // Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test(dataProvider = "MassaAreaTriangulo")
    public static void areaTrianguloTest(double base, double altura, double resultadoEsperado) {
        // Arrange
        // Dados fornecidos pelo dataProvider
        double resultadoAtual;

        // Act
        resultadoAtual = CalculadoraDeArea.areaTriangulo(base, altura);

        // Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test(dataProvider = "MassaAreaCirculo")
    public static void areaCirculoTest(double raio, double resultadoEsperado) {
        // Arrange
        // Dados fornecidos pelo dataProvider
        double resultadoAtual;

        // Act
        resultadoAtual = CalculadoraDeArea.areaCirculo(raio);

        // Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }
}
