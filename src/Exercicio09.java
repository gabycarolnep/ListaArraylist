public class Exercicio09 {
    public static void main(String[] args) {

        int soma = 0;
        int[][] numero = new int[5][4];

        numero[0][0] = 1;
        numero[0][1] = 2;
        numero[0][2] = 3;
        numero[0][3] = 4;

        numero[1][0] = 5;
        numero[1][1] = 6;
        numero[1][2] = 7;
        numero[1][3] = 8;

        numero[2][0] = 9;
        numero[2][1] = 10;
        numero[2][2] = 11;
        numero[2][3] = 12;

        numero[3][0] = 13;
        numero[3][1] = 14;
        numero[3][2] = 15;
        numero[3][3] = 16;

        numero[4][0] = 17;
        numero[4][1] = 18;
        numero[4][2] = 19;
        numero[4][3] = 20;


        for (int i = 0; i < numero.length; i++) {
            for (int g = 0; g < numero[i].length; g++) {

                System.out.print(numero[i][g] + " - ");
                soma += numero[i][g];
            }

        }
        System.out.println("A soma de todos os números da matriz é : " + soma);
    }
}

