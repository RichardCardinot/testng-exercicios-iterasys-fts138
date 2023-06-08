package br.com.iterasys;

public class CalculadoraDeArea {

    public static double areaQuadrado(double lado) {
        return Math.pow(lado, 2);
    };
    public static double areaRetangulo(double base, double altura) {
        return base * altura;
    };
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    };
    public static double areaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    };
}
