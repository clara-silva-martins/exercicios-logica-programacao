import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jogo de adivinhação");
        System.out.println("Escreva um número de 1 a 10 e tente adivinhar qual é o certo");
        int input = sc.nextInt();
        int numero = 1;

        if (input != numero) {
            if (input <= 5 && input > 0) {
                System.out.println("Está QUENTE");
            } if (input < 10 && input >= 6) {
                System.out.println("Está FRIO");
            }
            else{
                System.out.println("Está errado! Precisa ser de 1 a 10");
            }
        } else {
            System.out.println("A certa!");
        }

    }
}

