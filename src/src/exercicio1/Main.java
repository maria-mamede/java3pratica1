package src.exercicio1;

public class Main {
    public static void main(String[] args) {
        Executivos executivo1 = new Executivos();
        Basicos basico1 = new Basicos();
        Cobradores cobrador1 = new Cobradores();

        executivo1.deposito();
        basico1.consultaSaldo();
        cobrador1.saque();

    }
}
