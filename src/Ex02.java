import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é impar");
        }
    }
}
