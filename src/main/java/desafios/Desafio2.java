package desafios;

public class Desafio2 {
    /*
    Fazer um programa com os valores das notas (P1 e P2)e calcular a média ponderada.
    Exibir a situação final do aluno (Aprovado/Reprovado) sabendo que a média de aprovação é igual a 5
    Média = (P1 + 2xP2) / 3
     */
    public static void main(String[] args) {

        int P1 = 3;
        int P2 = 6;
        float media = (P1 + 2*P2) / 3;

        if (media >4){
            System.out.println("O aluno foi aprovado");
        }else{
            System.out.println("O aluno foi reprovado");
        }
    }
}
