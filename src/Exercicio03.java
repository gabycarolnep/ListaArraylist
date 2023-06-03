import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.print("Quantos números ddeseja colocar em ordem decrescente? ");

        int n = entrada_do_usuario.nextInt();
        int[] num = new int[n];

        System.out.println("Digite " + n + " números.");

        for (int i = 0; i < n; i++) {
            num[i] = entrada_do_usuario.nextInt();
        }
        Arrays.sort(num);
        System.out.println("Em ordem decrescente.");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[n - i - 1]);
        }

        entrada_do_usuario.close();






    }
}
