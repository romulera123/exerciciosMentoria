package exercicios;
import java.util.List;

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

public class Exercicio_04 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Dados.getPessoas();

        // Listar as pessoas do Brasil com o nome em Uppercase e suas idades
        pessoas.stream().filter(p -> p.getPais().equals("Brazil")).map(p -> p.getNome().toUpperCase() + ", " +p.getIdade())
        
        .forEach(System.out::println);
    }
}