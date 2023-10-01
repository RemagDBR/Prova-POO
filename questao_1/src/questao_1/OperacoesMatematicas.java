package questao_1;

import java.util.Scanner;

public class OperacoesMatematicas {
    // Atributos para armazenar os 3 números
    private double numero1;
    private double numero2;
    private double numero3;

    // Construtor que recebe os 3 números
    public OperacoesMatematicas(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    // Método para somar os números
    public double somar() {
        return numero1 + numero2 + numero3;
    }

    // Método para calcular a média dos números
    public double calcularMedia() {
        return (numero1 + numero2 + numero3) / 3;
    }

    // Método para subtrair os números
    public double subtrair() {
        return numero1 - numero2 - numero3;
    }

    // Método para multiplicar os números
    public double multiplicar() {
        return numero1 * numero2 * numero3;
    }

    // Método para determinar o maior número entre eles
    public double determinarMaior() {
        double maior = numero1;

        if (numero2 > maior) {
            maior = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }

        return maior;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        OperacoesMatematicas operacoes = new OperacoesMatematicas(numero1, numero2, numero3);

        System.out.println("Soma: " + operacoes.somar());
        System.out.println("Média: " + operacoes.calcularMedia());
        System.out.println("Subtração: " + operacoes.subtrair());
        System.out.println("Multiplicação: " + operacoes.multiplicar());
        System.out.println("Maior número: " + operacoes.determinarMaior());

        scanner.close();
    }
}
