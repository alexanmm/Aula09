package br.com.digitalhouse.Teste;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //List
        System.out.println("*** List ***");
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa tairo = new Pessoa("Tairo", "Roberto", 30);
        Pessoa jessica = new Pessoa("Jessica", "Milena", 18);
        Pessoa vini = new Pessoa("Vini", "PHP", 35);

        pessoas.add(tairo);
        pessoas.add(jessica);
        pessoas.add(vini);

        for (Pessoa pessoa : pessoas) {
            System.out.println(
                    "Nome: " + pessoa.getNome() +
                    "\nSobrenome: " + pessoa.getSobrenome() + "\n");
        }

        //Set
        System.out.println("*** Set ***");
        Set<Pessoa> pessoaSet = new HashSet<>();
        pessoaSet.add(tairo);
        pessoaSet.add(jessica);
        pessoaSet.add(vini);
        pessoaSet.add(vini);
        pessoaSet.add(vini);

        for (Pessoa pessoa : pessoaSet) {
            System.out.println(
                    "Nome: " + pessoa.getNome() +
                            "\nSobrenome: " + pessoa.getSobrenome() + "\n");
        }

        //Map
        System.out.println("*** Map ***");
        Map<String, Pessoa> pessoaMap = new HashMap<>();
        pessoaMap.put("tairo", tairo);
        pessoaMap.put("jessica", jessica);
        pessoaMap.put("vini", vini);
        pessoaMap.put("vini", vini);
        pessoaMap.put("vini", vini);
        pessoaMap.put("vini", vini);

        for (String chave: pessoaMap.keySet()) {

            System.out.println(
                    "Nome: " + pessoaMap.get(chave).getNome() +
                    "\nSobrenome: " + pessoaMap.get(chave).getSobrenome() + "\n");
        }


    }

}
