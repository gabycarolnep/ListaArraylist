import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println("Lista atual: ");

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("Qual número deseja remover? ");

        int num = entrada_do_usuario.nextInt();
        int indice = lista.lastIndexOf(num);
        lista.remove(indice);

        System.out.println("Nova lista: ");

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
