import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota");
        int nota = sc.nextInt();
        if (nota >= 7 && nota <= 10) {
            System.out.println("aprovado");
        }
        else if (nota >= 5 && nota < 7) {
            System.out.println("recuperação");
        }
        else if (nota < 5) {
            System.out.println("reprovado");
        } else {
            System.out.println("Nota inválida");
        }
    }}



