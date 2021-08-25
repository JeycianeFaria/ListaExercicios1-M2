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

        //Calculando o salário líquido
        float salarioLiquido = salarioBruto - valorImpostoDeRenda - valorInss - valorSindicato;


        //imprimindo valores
        System.out.println("O seu sálario bruto é de R$ " + salarioBruto);
        System.out.println("Foi descontado para o INSS o total de R$ " + valorInss);
        System.out.println("Foi descontado para o Sindicato o total de R$ " + valorSindicato);
        //System.out.println("Foi descontado para o Imposto de Renda  o total de R$ " + valorImpostoDeRenda);
        System.out.println("Então o seu salário líquido é de R$ " + salarioLiquido);

    }

}
