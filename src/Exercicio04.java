import java.util.ArrayList;
import java.util.Collections;

public class Exercicio04 {

    public static void main(String[] args) {

        ArrayList<String> sexo = new ArrayList<>();

        sexo.add("feminino");
        sexo.add("masculino");
        sexo.add("feminino");
        sexo.add("feminino");
        sexo.add("masculino");
        sexo.add("masculino");
        sexo.add("feminino");
        sexo.add("masculino");
        sexo.add("feminino");
        sexo.add("feminino");

        ArrayList<Double> altura = new ArrayList<>();

        altura.add(1.50);
        altura.add(1.55);
        altura.add(1.90);
        altura.add(1.95);
        altura.add(1.83);
        altura.add(1.72);
        altura.add(1.69);
        altura.add(1.53);
        altura.add(1.80);
        altura.add(1.99);

        Collections.sort(altura);
        System.out.println(altura);

        double menor = altura.get(0);
        double maior = altura.get(9);

        System.out.println("A menor altura é: " + menor);
        System.out.println("A maior altura é: " + maior);

        double soma = 0;
        for (int i = 0; i < altura.size(); i++){
            soma = soma + altura.get(i);
        }

        System.out.println("A média das alturas dos homens é: " + (soma/10));

        int mulher = 0;
        for (int j = 0; j < sexo.size(); j++){
            if(sexo.get(j) == "feminino"){
                mulher++;
            }
        }
        System.out.println("O número de mulheres é: " + mulher);

        // A Hellen me ajudou nesse :D
    }
}

