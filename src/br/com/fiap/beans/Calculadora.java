package br.com.fiap.beans;

public class Calculadora {

    private double resultado;

    public Calculadora() {
        super();
    }

    public Calculadora(double resultado) {
        super();
        this.resultado = resultado;
    }

    public double Somar(double n1, double n2){
        return resultado = n1 + n2;
    }

    public double Subtrair(double n1, double n2){
        return resultado = n1 - n2;
    }
}
