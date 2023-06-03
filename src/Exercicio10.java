public class Exercicio10 {
    public static void main(String[] args) {

        int n = 10;
        int a[] = new int[n];
        int i;
        int ctimpares = 0, smimpares = 0;
        float mdimpares;

        for (i = 0; i < n; i++) {
            a[i] = (int)Math.round(Math.random() * 100);


            if ((a[i] % 2) != 0) {
                ctimpares = ctimpares + 1;
                smimpares = smimpares + a[i];
                System.out.printf("a[%d] = %2d - %do. número impar\n", i, a[i], ctimpares);}
            else System.out.printf("a[%d] = %2d\n", i, a[i]);
        }

        System.out.printf("\nSoma dos numeros ímpares = %3d", smimpares);
        System.out.printf("\nQuantidade de numeros ímpares = %3d", ctimpares);
        System.out.printf("\n------------------------------------------");

        mdimpares = smimpares / (float)ctimpares;
        System.out.printf("\nMedia aritmetica dos números ímpares = %6.2f\n", mdimpares);
    }
}

