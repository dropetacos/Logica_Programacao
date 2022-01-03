package arrays;

public class Desafio2 {
    /*
    Criar um programa que tenha 3 nomes e três sexos correspondentes
    Exibir o nome e o sexo de cada item da matriz
     */
    public static void main(String[] args) {
        String [] [] matriz = {{"joão", "maria", "josé"}, {"Masculino" , "Feminino", "Masculino"}};

        for (int i = 0; i < matriz[0].length; i++){
            System.out.println("Nome: "+matriz[0][i]+" Sexo: "+matriz[1][i]);
        }
    }


}
