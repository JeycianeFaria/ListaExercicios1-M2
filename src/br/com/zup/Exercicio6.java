package br.com.zup;

public class Exercicio6 {

    public static void main(String[] args) {

        //criando variavel para armazernar dados necessários
        float salarioPorHoras = 30.4F;
        float horasTrabalhadas = 100F;
        float salarioBruto = salarioPorHoras * horasTrabalhadas;

        //variaveis dos calculos dos descontos
        float valorImpostoDeRenda = salarioBruto * (11/100F);
        float valorInss = salarioBruto * (8/100F);
        float valorSindicato = salarioBruto * (5/100F);


    }

}
