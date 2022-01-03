package desafios;

public class Desafio3 {
    /*
    Através de um valor sobre tempo, onde os valores podem ser:
    Ensolarado, Chovendo, Nevando, Tempestade

    Exibir as seguintes mensagens
    Ensolarado: ir pra praia,
    Chovendo: levar guarda chuva,
    Nevando: fica em casa,
    Tempestade: boa sorte.
     */

    public static void main (String [] args){
        String tempo = "chovendo";
        switch (tempo){
            case "ensolarado":
                System.out.println("ir para praia");
                break;
            case "chovendo":
                System.out.println("levar guarda chuva");
                break;
            case "nevando":
                System.out.println("ficar em casa");
                break;
            case "tempestade":
                System.out.println("boa sorte");
                break;
        }
    }
}
