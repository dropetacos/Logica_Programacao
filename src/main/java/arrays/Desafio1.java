package arrays;

public class Desafio1 {
    /*
    Crie um método que receba uma array de dez valores inteiros.
    Esse método terá que exibir.
    A) O maior valor
    B) Soma dos valores
    C) A média aritmética dos valores
     */

    public static void main(String[] args) {
        int [] valores = {5,4,12,8,15,2,3,7,9,6};
        exibeResultados(valores);
    }
    public static void exibeResultados (int[] valores){
        int maior = 0;
        int soma = 0;
        float media = 0;
        for (int valor: valores){
            if (valor > maior){
                maior = valor;
            }
            soma = soma + valor;
        }
        media = (float) soma / valores.length;

        System.out.println("O maior valor é: "+maior);
        System.out.println("A soma dos valores é: "+soma);
        System.out.println("A Média dos valores é: "+media);

    }

}
