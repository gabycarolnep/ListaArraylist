import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("MÚLTIPLOS DE 5 E 7");
        System.out.println(" .................................. ");
        System.out.println("Digite um número inteiro qualquer: ");

        int num = entrada_do_usuario.nextInt();

        if ((num % 35) == 0){
            System.out.println("Esse número é múltiplo de 5 e 7");

        } else {
            System.out.println("Esse número não é múltiplo de 5 e 7");
        }


    }
}
