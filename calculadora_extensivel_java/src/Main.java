package src;

public class Main {
    public static void main(String args[]) {
        Soma soma = new Soma();
        soma.setPrimerValor(2);
        soma.setSegundoValor(4);

        Subtracao subtracao = new Subtracao();
        subtracao.setPrimerValor(10);
        subtracao.setSegundoValor(5);

        new Calculadora().calcular(soma);
        new Calculadora().calcular(subtracao);

        System.out.println(soma.getResultado());
        System.out.println(subtracao.getResultado());
    }
}