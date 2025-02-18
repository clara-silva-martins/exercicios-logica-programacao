import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int a = sc.nextInt();
        System.out.println("Digite outro numero:");
        int b = sc.nextInt();
        System.out.println("Digite qual operação deseja executar:" + '\n' +
                "Soma==========> +" + '\n' +
                "Divisão=======> /" + '\n' +
                "Subtração=====> -" + '\n' +
                "Multiplicação=> *"
        );
        Scanner cs = new Scanner(System.in);
        var c = cs.nextLine();
        if(c.equals("+")) {
            var soma = a + b;
            System.out.println("A soma dos dois números é: " + soma);
        } else if (c.equals("*")) {
            var multi = a * b;
            System.out.println("A multiplicação dos dois números é: " + multi);
        } else if (c.equals("-")) {
            var sub = a - b;
            System.out.println("A subtração dos dois números é: " + sub);
        } else {
            var div = a / b;
            System.out.println("A divisão dos dois números é: " + div);

        }
    }
}
