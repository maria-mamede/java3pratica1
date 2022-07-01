package src.exercicio2;

public class LivroPdf implements Printable{
    int numeroPaginas;
    String nomeAutor;
    String tituloLivro;
    String generoLivro;

    public LivroPdf(int numeroPaginas, String nomeAutor, String tituloLivro, String generoLivro) {
        this.numeroPaginas = numeroPaginas;
        this.nomeAutor = nomeAutor;
        this.tituloLivro = tituloLivro;
        this.generoLivro = generoLivro;
    }

    @Override
    public String toString() {
        return "LivroPdf{" +
                "numeroPaginas=" + numeroPaginas +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", tituloLivro='" + tituloLivro + '\'' +
                ", generoLivro='" + generoLivro + '\'' +
                '}';
    }

    static void print(LivroPdf livroPdf){
        System.out.println("Imprimindo livro PDF.");
        System.out.println(livroPdf);
    }
}
