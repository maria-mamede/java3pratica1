package src.exercicio3;

public class Gato extends Animal implements EatableCarne{
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne.");
    }
}
