package br.com.zup;

public class Exercicio5 {

    public static void main(String[] args) {

        //criando variavel para armazenar os graus Fahrenheit
        float grausFahrenheit = 77F;

        //criando variavel para armazenar a conversão
        float conversaoParaCelsius = (grausFahrenheit - 32) / 1.8F;

        //imprimindo a conversão para o usuário
        System.out.println("A temperatura em graus Fahrenheit está " + grausFahrenheit + "ºF");
        System.out.println("A mesma temperatura em garus Celsius é " + conversaoParaCelsius + "ºC");

    }

}
