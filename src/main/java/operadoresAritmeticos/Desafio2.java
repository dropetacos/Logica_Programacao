package operadoresAritmeticos;

public class Desafio2 {
    /*
    Cálculo das milhas marítimas sabendo que:
    1 milha = 1852 metros
    1 Km = 1000 metros
     */

    public static void main(String[] args) {
        float valorMilha = 5;
        float milha = 1852 / 1000f;

        float resultado = valorMilha * milha;
        System.out.println(resultado);
    }
}
