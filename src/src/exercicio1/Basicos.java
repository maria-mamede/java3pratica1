package src.exercicio1;

public class Basicos extends OperacoesBasicos implements Transacoes {
    @Override
    public void transacaoOk() {
        System.out.println("Transação realizada com sucesso.");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação não realizada.");
    }

    @Override
    public void consultaSaldo() {
        System.out.println("Consultando saldo.");
    }

    @Override
    public void pagamento() {
        System.out.println("Realizando pagamento.");
    }

    @Override
    public void saque() {
        System.out.println("Realizando saque.");
    }
}
