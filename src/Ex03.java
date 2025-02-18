import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Você é um adulto");
        }else if (idade >= 13 && idade < 18) {
            System.out.println("Você é adolescente");
        }else if (idade < 12) {
            System.out.println("Você é criança");
        }
    }
}
