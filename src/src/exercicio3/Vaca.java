package src.exercicio3;

public class Vaca extends Animal implements EatablePasto{
    @Override
    public void emitirSom() {
        System.out.println("Mu!");
    }

    @Override
    public void comerPasto() {
        System.out.println("Comendo pasto.");
    }
}
