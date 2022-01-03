package desafios;

public class Desafio1 {
    /*
    A partir de 3 valores verificar se a formam um triângulo e qual o seu tipo
    Triângulo = soma de dois lados quaiquer seja maior que o outro
    Triângulo escaleno = todos os lados diferentes
    Triângulo Isósceles = dois lados iguais
    Triângulo Equilátero = todos os lados iguais
     */

    public static void main(String[] args) {

        int ladoA = 7;
        int ladoB = 5;
        int ladoC = 3;

        if ( ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA){
            if (ladoA == ladoB && ladoB == ladoC){
                System.out.println("Essa figura é Triângulo Equilátero");
            }else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
                System.out.println("Essa figura é Triângulo Escaleno");
            }else {
                System.out.println("Essa figura é um triângulo Isósceles");
            }
        }else{
            System.out.println("Essa figura Não é triângulo");
        }
    }

}
