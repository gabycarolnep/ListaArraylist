import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("INVERTENDO A ORDEM DOS NÚMEROS");
        System.out.println(" .................................. ");

        List<Integer> numeros = new ArrayList<>();
        System.out.println("Digite dois números inteiros quais quer: ");

        int num1 = entrada_do_usuario.nextInt();
        int num2 = entrada_do_usuario.nextInt();

        numeros.add(num1);
        numeros.add(num2);

        Collections.reverse(numeros);

        System.out.println(numeros);

    }
}
