package aula04;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        int n1, n2, resultado;

        Scanner ler = new Scanner(System.in);


        System.out.println("Número: ");
        n1 = ler.nextInt();

        if (n1 % 2 == 0)
        {
            System.out.println("Número PAR");
        }

        else {
            System.out.println("Número ÍMPAR");
        }
    }

}
