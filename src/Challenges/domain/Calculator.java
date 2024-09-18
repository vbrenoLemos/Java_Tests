package Challenges.domain;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Calculator {

    public static void calcularSoma() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double valorA = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double valorB = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double valorC = sc.nextDouble();
        double resul = valorA + valorB;
        if (resul > valorC) {
            System.out.println("o valor de " + valorC + " é menor que " + resul);
        } else {
            System.out.println("o valor de " + valorC + " é maior que " + resul);
        }

    }

    public static void ParOrImpar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        String tipo = (num > 0) ? "positivo" : "negativo";
        String paridade = (num % 2 == 0) ? "par" : "ímpar";

        System.out.printf("%d é %s e é %s", num, tipo, paridade);
    }

    public static void SomaComparada() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite um número: ");
        int num2 = sc.nextInt();
        int resul = num2 + num1;
        if (num1 == num2)
            System.out.println("A soma deles é igual a " + resul);
    }

    public static void Antecessor() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número inteiro: ");
            int num = sc.nextInt();
            System.out.printf("""
                    Antecessor : %d
                    Número Escolhido: %d
                    Sucessor: %d """, num - 1, num, num + 1);

        } catch (InputMismatchException e) {
            System.out.println("Digite um número INTEIRO válido");
        }
    }

    public static void TrocarValor() {
        String A = "Breno";
        String B = "Isabelle";
        String temp = A;

        A = B;
        B = temp;

        System.out.println(A + " " + B);
    }

    public static void CalcularLitros() {
        Scanner sc = new Scanner(System.in);
        double tempo, velocidade, distancia, litros;
        System.out.print("Qual o tempo da viagem: ");
        tempo = sc.nextDouble();
        System.out.print("Qual a velocidade média do carro: ");
        velocidade = sc.nextDouble();

        distancia = tempo * velocidade;
        litros = distancia / 12;

        System.out.println("Foram usados " + litros + " litros na sua viagem");
    }

    public static void RandomNumero() {
        Random numero = new Random();
        System.out.println(numero.nextInt(101));
    }
}
