package estruturasDeRepeticao;

public class Desafio4 {

    /*
    Exibir a tabuada do número 5 no intervalo de 1 a 10
    Em do while
     */

    public static void main(String[] args) {
        int tabuada = 5;
        int cont = 1;

        do {
            System.out.println(tabuada+" x "+cont+" = "+tabuada*cont);
            cont++;
        }while (cont<=10);
    }
}
