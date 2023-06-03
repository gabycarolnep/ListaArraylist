import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite a idade da " + (i + 1) + " pessoa: ");
            vetorA[i] = entrada_do_usuario.nextInt();
        }
        int menor = vetorA[0];
        int maior = vetorA[0];

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > maior) {
                maior = vetorA[i];

            } else if (vetorA[i] < menor) {
                menor = vetorA[i];
            }
        }
        System.out.println("Lista das idades: ");

        for(int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Menor idade: " + menor);
        System.out.println("Maior idade: " + maior);
    }
}
