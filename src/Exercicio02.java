import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite o numero que deseja adicionar a lista: ");
        List<Integer> lista_num = new ArrayList<>();

        lista_num.add(1);
        lista_num.add(2);
        lista_num.add(3);
        lista_num.add(4);
        lista_num.add(5);

        int num = entrada_do_usuario.nextInt();

        System.out.println("Em qual posição da lista deseja adiciona-lo? ");
        int posicao = entrada_do_usuario.nextInt();

        lista_num.add(posicao, num);

        System.out.print("A nova lista é: " +  lista_num);
    }
}
