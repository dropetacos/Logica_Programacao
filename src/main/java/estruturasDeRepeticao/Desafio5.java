package estruturasDeRepeticao;

public class Desafio5 {

    /*
    Exibir tabuada dos valores de 1 a 20 no intervalo de 1 a 10
     */

    public static void main(String[] args) {
        for (int tabuada = 1; tabuada <= 20; tabuada++){
            for (int i = 1; i <=10; i++){
                System.out.println(tabuada+ " x "+i+" = "+tabuada*i);
            }
        }
    }


}
