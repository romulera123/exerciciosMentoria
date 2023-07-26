package exercicios;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import dados.Dados;
import dados.Pessoa;



// Listar todas as pessoas
// Listar as 10 primeiras pessoas
// Listar as pessoas que são do Brasil
// Listar as pessoas do Brasil com o nome em Uppercase e suas idades
// Listar as pessoas que são do Brasil, em ordem de nome
// Listar as pessoas que são do Brasil, em ordem de idade
// Contar quantas pessoas tem mais de 45 anos
// Calcular a média de idade das pessoas

public class Exercicio_06 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Dados.getPessoas();

// Listar as pessoas que são do Brasil, em ordem de idade
    List<Pessoa> pessoasDoBrasil = pessoas.stream().filter(p -> p.getPais().equals("Brazil")).sorted(Comparator.comparingInt(Pessoa::getIdade)).collect(Collectors.toList());;
        pessoasDoBrasil.forEach(p2 -> System.out.println(p2.getNome() + " - Idade: "+ p2.getIdade()));


    }
}