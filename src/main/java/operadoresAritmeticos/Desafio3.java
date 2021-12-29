package operadoresAritmeticos;

public class Desafio3 {
    /*
    Calcule a exiba a tensão de um determinado circuito eletrônico a partir dos
    valores da resistência e corrente elétrica
    R = U / I Onde R = resistência, I = corrente e U = tensão
     */

    public static void main(String[] args) {
        int tensao;
        int resistencia = 10;
        int corrente = 8;

        tensao = resistencia * corrente;
        System.out.println(tensao);

    }
}
