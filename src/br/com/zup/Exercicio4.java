package br.com.zup;

public class Exercicio4 {

    public static void main(String[] args) {

        //Exercicio realizado em sala juntamente com o professor

        //armazenando os dois dados necessários para o processamento.
        float qtdDeHorasTrabalhadas = 40F;
        float salarioPorHora = 45.7F;

        //Calcular o salário bruto
        float salarioBruto = qtdDeHorasTrabalhadas * salarioPorHora;


        //Exibindo o resultado para o usuario
        System.out.println("Você trabalhou " + qtdDeHorasTrabalhadas + "hr e você recebe R$" + salarioPorHora + " por horas ");
        System.out.println("Portanto o seu salário bruto deste mês será: R$" + salarioBruto);

    }

}
