package src.exercicio2;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", "Oliveira", 28,
                "Belo Horizonte", "Minas Gerais");

        Curriculo curriculo1 = new Curriculo(pessoa1);

        curriculo1.listaHabilidadesPessoa.add("Excel avançado");
        curriculo1.listaHabilidadesPessoa.add("Inglês fluente");
        curriculo1.listaHabilidadesPessoa.add("Conhecimento de HTML");

        Curriculo.print(curriculo1);
        // fim currículo

        LivroPdf livro1 = new LivroPdf(800, "George R. R. Martin",
                "A Guerra dos Tronos", "Fantasia");

        LivroPdf.print(livro1);
        //fim livro

        Relatorio relatorio1 = new Relatorio(50,
                "Jorge Silva", "Sandra Oliveira");

        relatorio1.textoRelatorio = "Pesquisa sobre a fauna brasileira.";

        Relatorio.print(relatorio1);
        //fim relatório
    }
}
