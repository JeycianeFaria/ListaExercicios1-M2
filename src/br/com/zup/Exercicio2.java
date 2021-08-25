package br.com.zup;

public class Exercicio2 {

    public static void main(String[] args) {

        //criando as variaveis para as notas
        float nota1 = 7F;
        float nota2 = 6F;
        float nota3 = 8.5F;
        float nota4 = 9F;

        //criando a variavel para realizar a soma das notas
        float somaDasNotas = nota1 + nota2 + nota3 +nota4;

        //criando variavel para calcular a média aritmética
        float mediaAritmetica = somaDasNotas/4;


        //imprimindo a média aritmética  para o usuário
        System.out.println("Suas notas do bimestre foram as seguintes: " + nota1 +  ", " + nota2 + ", " + nota3 + " e " + nota4 );
        System.out.println("E sua média aritmética é " + mediaAritmetica);

    }

}
