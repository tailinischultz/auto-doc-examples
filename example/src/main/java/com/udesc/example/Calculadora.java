package com.udesc.example;

/**
 * Classe Calculadora demonstra o uso de Javadoc.
 * 
 * <p>Esta classe contém operações matemáticas básicas
 * como soma, subtração, multiplicação e divisão.</p>
 * 
 * @author Tailini
 * @version 1.0
 */
public class Calculadora {

    /**
     * Realiza a soma de dois números inteiros.
     * 
     * @param a primeiro número
     * @param b segundo número
     * @return a soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     *
     * @param a minuendo (número a ser subtraído)
     * @param b subtraendo (número que será subtraído)
     * @return o resultado da subtração {@code a - b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return o produto de {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números inteiros.
     * 
     * <p><b>Atenção:</b> Se {@code b} for zero, ocorre uma {@link ArithmeticException}.</p>
     *
     * @param a dividendo
     * @param b divisor
     * @return o quociente da divisão {@code a / b}
     * @throws ArithmeticException se {@code b} for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida!");
        }
        return a / b;
    }
}
