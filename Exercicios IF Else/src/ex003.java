/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

* “Telefonou para a vítima? “
* “Esteve no local do crime?”
* “Mora perto da vítima? “
* “Devia para a vítima? “
* “Já trabalhou com a vítima? “

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 
3 e 4 como “Cúmplice” e 5 como “Assassino“. Caso contrário, ele será classificado como “Inocente“.
*/

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? 1/Sim ou 0/Não: ");
        int r1 = ler.nextInt();

        System.out.println("Esteve no local do crime? 1/Sim ou 0/Não:");
        int r2 = ler.nextInt();

        System.out.println("Mora perto da vítima? 1/Sim ou 0/Não:");
        int r3 = ler.nextInt();

        System.out.println("Devia para a vítima? 1/Sim ou 0/Não:");
        int r4 = ler.nextInt();

        System.out.println("Já trabalhou com a vítima? 1/Sim ou 0/Não:");
        int r5 = ler.nextInt();

        float res = r1 + r2 + r3 + r4 + r5;

        if (res < 2) {
            System.out.println("Inocente");
        } else if (res == 2) {
            System.out.println("Suspeita");
        } else if (res == 3 || res == 4) {
            System.out.println("Cúmplice");
        } else if (res == 5) {
            System.out.println("Assasino");
        }
    }
}