package br.com.digitalhouse.Exercicio03;

import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {

//Exercício 3:
//Criar uma nova classe chamada Prova. Definir e implementar o seguinte método:
//public void somaTotal(Set<Integer> conjuntoDeInteiros)
//O método deve percorrer o conjunto de inteiros, ir acumulando o total da soma
//dos valores e, no final, imprimir na
//tela o valor da soma total.
//Em seguida crie uma classe Exercício 3 com seu método main, imprimir no Main
//todas as chaves junto com seus valores associados. Para isso, utilizar o
//foreach com as chaves.

    public static void main(String[] args) {

        Prova prova = new Prova();

        Set<Integer> conjuntoDeInteiros = new HashSet<>();

        conjuntoDeInteiros.add(1);
        conjuntoDeInteiros.add(2);
        conjuntoDeInteiros.add(10);
        conjuntoDeInteiros.add(11);

        for (Integer valor : conjuntoDeInteiros) {
            System.out.println(valor);
        }

        prova.somaTotal(conjuntoDeInteiros);

    }
}
