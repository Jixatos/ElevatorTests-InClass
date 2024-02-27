package br.com.fiap.beans;

public class Elevador {

    private int id;
    private double cargaMaxima;
    private double cargaAtual;
    private boolean sinalAlerta;
    private Calculadora calculadora = new Calculadora();

    public Elevador() {
        super();
    }

    public Elevador(int id, double cargaMaxima, double cargaAtual, boolean sinalAlerta) {
        super();
        this.id = id;
        this.cargaMaxima = cargaMaxima;
        this.cargaAtual = cargaAtual;
        this.sinalAlerta = sinalAlerta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public boolean getSinalAlerta() {
        return sinalAlerta;
    }

    public void setSinalAlerta(boolean sinalAlerta) {
        this.sinalAlerta = sinalAlerta;
    }

    public double entrarNoElevador(double peso){
        this.cargaAtual = calculadora.Somar(this.cargaAtual, peso);
        return cargaAtual;
    }

    public double sairDoElevador(double peso){
        this.cargaAtual = calculadora.Subtrair(this.cargaAtual, peso);
        return cargaAtual;
    }

    public boolean valiarPeso(double peso){
        if (peso >= this.cargaMaxima) {
            return sinalAlerta = true;
        } else {
            return sinalAlerta = false;
        }
    }
}
