public class Exercicio08 {
    public static void main(String[] args) {

        int num = 100;

        for (int i = num; i <= 150 ; i++) {

            int unidade = (i % 10);
            int dezena = (i % 100) / 10;
            int centena = (i / 100);

            int somaAlg = (unidade + dezena + centena);

            if (somaAlg % 2 == 0) {
                System.out.println(i + " A soma dos digitos é: " + somaAlg);

            }
        }
        }
}
