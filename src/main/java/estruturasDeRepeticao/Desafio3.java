package estruturasDeRepeticao;

public class Desafio3 {
    /*
    Exibir a tabuada do número 5 no intervalo de 1 a 10
    Em while
     */

    public static void main(String[] args) {
        int tabuada = 5;
        int cont = 1;

        while (cont <= 10){
            System.out.println(tabuada+" x "+cont+" = "+tabuada*cont);
            cont++;
        }
    }

    }

