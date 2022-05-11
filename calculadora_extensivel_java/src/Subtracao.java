package src;

public class Subtracao implements Operacao {
    private int resultado;
    private int primerValor;
    private int segundoValor;

    @Override
    public void realizar() {
        resultado = primerValor - segundoValor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getPrimerValor() {
        return primerValor;
    }

    public void setPrimerValor(int primerValor) {
        this.primerValor = primerValor;
    }

    public int getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(int segundoValor) {
        this.segundoValor = segundoValor;
    }
}