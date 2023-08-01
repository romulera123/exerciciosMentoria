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

public class Exercicio_08 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Dados.getPessoas();

        // Calcular a média de idade das pessoas
        double mediaIdade = Dados.getPessoas().stream()
        .mapToDouble(Pessoa::getIdade) //transforma a lista em apenas idade
        .average()
        .orElse(0); // Caso a lista esteja vazia, retornamos 0 como valor padrão

System.out.println("Média de idade das pessoas: " + mediaIdade);
}
}
