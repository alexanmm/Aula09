package br.com.digitalhouse.Exercicio01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio1 {

    static Map<Integer, String> mapaLoteria = new HashMap<>();
    static Map<String, List<String>> mapaApelidos = new HashMap<>();

    public static void main(String[] args) {

        //1. Criar um dicionário que represente os primeiros 5 números da “Loteria dos
        //Sonhos”, junto com seu significado. Para isso, o dicionário deverá ter como
        //chave Integer e como valor uma String.
        //Números da Loteria dos Sonhos:
        //0 → Ovos
        //1 → Água
        //2 → Escopeta
        //3 → Cavalo
        //4 → Dentista
        //5 → Fogo
        mapaLoteria.put(0, "vos");
        mapaLoteria.put(1, "Água");
        mapaLoteria.put(2, "Escopeta");
        mapaLoteria.put(3, "Cavalo");
        mapaLoteria.put(4, "Dentista");
        mapaLoteria.put(5, "Fogo");

        //2. Criar um dicionário que represente os apelidos que uso para chamar os
        //meus amigos. Para isso, o dicionário deverá ter como chave String e como
        //valor uma lista de Strings.
        //João → Juan, Fissura, Maromba
        //Miguel → Night Watch, Bruce Wayne, Tampinha
        //Maria → Wonder Woman, Mary, Marilene
        //Lucas → Lukinha, Jorge, George
        //Em seguida crie uma classe Exercício 1 com seu método main, imprimir no Main
        //todas as chaves junto com seus valores associados. Para isso, utilizar o
        //foreach com as chaves.


        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");
        mapaApelidos.put("João", apelidosJoao);

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");
        mapaApelidos.put("Miguel", apelidosMiguel);

        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder Woman");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");
        mapaApelidos.put("Maria", apelidosMaria);

        List<String> apelidosLucas = new ArrayList<>();
        apelidosLucas.add("Lukinha");
        apelidosLucas.add("Jorge");
        apelidosLucas.add("George");
        mapaApelidos.put("Lucas", apelidosLucas);

        //Exibir os valores na tela
        imprimir();

    }

    public static void imprimir(){

        for (String chave: mapaApelidos.keySet()){

            System.out.println("Chave: " + chave);

            for (String linha: mapaApelidos.get(chave) ){
                System.out.println("Valor: " + linha);
            }

            System.out.println("***");

        }

    }

}
