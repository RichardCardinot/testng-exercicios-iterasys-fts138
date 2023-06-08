package br.com.iterasys;

import java.util.Scanner;

class CalculadoraDeAreaChatGpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma forma geométrica:");
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Triângulo");
        System.out.println("4. Círculo");

        int opcao = scanner.nextInt();
        double area = 0.0;

        switch (opcao) {
            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                area = calcularAreaQuadrado(lado);
                break;
            case 2:
                System.out.print("Digite a base do retângulo: ");
                double base = scanner.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double altura = scanner.nextDouble();
                area = calcularAreaRetangulo(base, altura);
                break;
            case 3:
                System.out.print("Digite a base do triângulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double alturaTriangulo = scanner.nextDouble();
                area = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                break;
            case 4:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                area = calcularAreaCirculo(raio);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("A área é: " + area);
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }
}
