import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos verificar os lados de um triângulo");
        System.out.println("Primeiro digite um numero: ");
        int a = sc.nextInt();
        System.out.println("Segundo digite um numero: ");
        int b = sc.nextInt();
        System.out.println("Terceiro digite um numero: ");
        int c = sc.nextInt();
        if (verificarTriangulo(a, b, c)) {
            if (a == b && b == c) {
                System.out.println("É um triângulo equilátero");
            } else if (a == b || b == c || c == a) {
                System.out.println("É um triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("inválido");
        }
    }

    public static boolean verificarTriangulo(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }
}
