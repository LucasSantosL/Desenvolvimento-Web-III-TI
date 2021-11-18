// Faça um programa que peça um número correspondente a um determinado ano e em seguida informe se 
// este ano e ou não bissexto
import java.util.Scanner;


public class ex002 {
    public static void main(String[] args) throws Exception {
        float ano;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        ano = ler.nextInt();

        if (ano%4 == 0 && ano%100 != 0 || ano%400 == 0) {
            System.out.println("Bissexto");
        } else {
            System.out.println("Não é bissexto");
        }

    }
}
