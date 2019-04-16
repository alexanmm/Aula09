package br.com.digitalhouse.Exercicio04;

public abstract class Peca {

    private String marca;
    private String modelo;

    //Construtor
    public Peca() {

    }

    public Peca(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getter and Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Métodos
    public abstract void retirada();

}
