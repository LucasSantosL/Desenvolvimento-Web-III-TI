// Faça um programa que peça os 3 lados de uma forma. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.

// Dicas:

// - **Três lados formam um triangulo quando a soma de quaisquer dos dois lados é maior que o terceiro.**
// - Triângulo Equilátero: três lados iguais;
// - Triângulo Isósceles: quaisquer dois lados iguais;
// - Triângulo Escaleno: três lados diferentes;


import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float a;
        float b;
        float c;

        System.out.println("Primeiro lado: ");
        a = ler.nextInt();

        System.out.println("Segundo lado: ");
        b = ler.nextInt();

        System.out.println("Terceiro lado: ");
        c = ler.nextInt();

        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Não é um triangulo");
        } else if (a == b || a == c) {
            System.out.println("Equilatero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
    }
}