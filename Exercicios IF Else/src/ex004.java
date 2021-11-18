/*
Um posto está vendendo combustíveis com a seguinte tabela de descontos:

Álcool:

* Até 20 litros: desconto de 3% por litro;
* Acima de 20 litros: Desconto de 5% por litro.

Gasolina:

* Até 20 litros: desconto de 4% por litro;
* Acima de 20 litros, desconto de 6% por litro.

Escreva um programa que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool. G-gasolina), calcule e imprima o valor a ser pago pelo cliente.
*/
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        double G = 2.90;
        double A = 3.30;
        
        System.out.println("Digite o tipo de combustivel: 1(Álcool, 2(Gasolina) ");
        float combustivel = ler.nextInt();

        System.out.println("Digite a quantidade de litros: ");
        float litro = ler.nextInt();

        if (combustivel == 1 && litro <= 20) {
            System.out.println("O Total a pagar é: " + A * (litro * (1-(3/100))));
        } else if (combustivel == 1 && litro > 20) {
            System.out.println("O Total a pagar é: " + A * (litro * (1-(5/100))));
        }

        if (combustivel == 2 && litro <= 20) {
            System.out.println("O Total a pagar é: " + G * (litro * (1-(4/100))));
        } else if (combustivel == 2 && litro > 20) {
            System.out.println("O Total a pagar é: " + G * (litro * (1-(6/100))));
        }
    }
}