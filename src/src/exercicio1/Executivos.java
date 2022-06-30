package src.exercicio1;

public class Executivos extends OperacoesExecutivos implements Transacoes {
    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação não realizada.");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Transação realizada com sucesso.");
    }

    @Override
    public void deposito(){
        System.out.println("Realizando depósito.");
    }

    @Override
    public void transferencia() {
        System.out.println("Realizando transferência.");
    }
}
