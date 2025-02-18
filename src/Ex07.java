import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jogo de pedra papel e tesoura");
        System.out.println("Jogador 1 digite pedra, papel ou tesoura");
        var jogadaUm = sc.nextLine();
        System.out.println("Jogador 2 digite pedra, tesoura");
        var jogadaDois = sc.nextLine();
        if (jogadaUm.equals("pedra") && jogadaDois.equals("tesoura")) {
            System.out.println("Pedra ganha de tesoura");
        } else if (jogadaUm.equals("tesoura") && jogadaDois.equals("papel")) {
            System.out.println("Tesoura ganha de papel");
        } else if (jogadaUm.equals("papel") && jogadaDois.equals("pedra")) {
            System.out.println("Papel ganha de pedra");
        } else{
            System.out.println("Empate");
        }
    }
}
