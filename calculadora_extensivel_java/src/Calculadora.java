package src;

import java.security.InvalidParameterException;

public class Calculadora {
    public void calcular(Operacao operacao) {
        if (operacao == null) {
            throw new InvalidParameterException("Operação está vazia");
        }

        operacao.realizar();
    }
}
