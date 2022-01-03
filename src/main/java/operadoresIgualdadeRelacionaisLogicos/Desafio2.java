package operadoresIgualdadeRelacionaisLogicos;

public class Desafio2 {
    public static void main(String[] args) {

        int valor1 = 2;
        int valor2 = 7;
        int valor3 = 15;

        if (valor1 > valor2 && valor1 > valor3){
            System.out.println(valor1);
        }else if (valor2 > valor3){
            System.out.println(valor2);
        }else {
            System.out.println(valor3);
        }


    }
}
