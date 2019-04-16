package br.com.digitalhouse.Exercicio04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes extends Peca{

    private Map<Integer, List<Peca>> lista = new HashMap<>();
    private int contador;

    //Construtor
    public GuardaVolumes(){

    }

    public GuardaVolumes(String marca, String modelo) {
        super(marca, modelo);

    }

    //Getter and Setter
    public Map<Integer, List<Peca>> getLista() {
        return lista;
    }

    public void setLista(Map<Integer, List<Peca>> lista) {
        this.lista = lista;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    //Métodos
    public Integer guardarPecas(List<Peca> listaDePeca) {

        contador++;
        lista.put(contador, listaDePeca);

        return contador; //número de identificação
    }

    public void mostrarPecas() {

        System.out.println("Peças que estão no guarda-volumes:");

        for (Integer chave : lista.keySet()){

            for (Peca linha: lista.get(chave)) {
                System.out.println(
                        "Número: " + chave +
                        " Marca: " + linha.getMarca() +
                        " Modelo: " + linha.getModelo());
            }

        }
    }

    public void mostrarPecas(Integer numero){

        System.out.println("Peças referentes ao número: " + numero);

            for (Peca linha: lista.get(numero)) {
                System.out.println(
                        "Marca: " + linha.getMarca() +
                        " Modelo: " + linha.getModelo());
            }

    }

    public void devolverPecas(Integer numero){

        System.out.println("Remover peças referentes ao número: " + numero);
        lista.remove(numero);

    }

    @Override
    public void retirada() {

    }
}
