package src.exercicio2;

public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    String cidade;
    String estado;

    public Pessoa(String nome, String sobrenome, int idade, String cidade, String estado) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
