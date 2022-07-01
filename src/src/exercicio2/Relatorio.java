package src.exercicio2;

public class Relatorio implements Printable {
    String textoRelatorio;
    int numeroPaginasRelatorio;
    String nomeAutorRelatorio;
    String nomeRevisorRelatorio;

    public Relatorio(int numeroPaginasRelatorio, String nomeAutorRelatorio, String nomeRevisorRelatorio) {
        this.numeroPaginasRelatorio = numeroPaginasRelatorio;
        this.nomeAutorRelatorio = nomeAutorRelatorio;
        this.nomeRevisorRelatorio = nomeRevisorRelatorio;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "textoRelatorio='" + textoRelatorio + '\'' +
                ", numeroPaginasRelatorio=" + numeroPaginasRelatorio +
                ", nomeAutorRelatorio='" + nomeAutorRelatorio + '\'' +
                ", nomeRevisorRelatorio='" + nomeRevisorRelatorio + '\'' +
                '}';
    }

    static void print(Relatorio relatorio){
        System.out.println("Imprimindo relatório.");
        System.out.println(relatorio);
    }
}
