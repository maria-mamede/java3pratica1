package src.exercicio3;

public class Cachorro extends Animal implements EatableCarne{
    @Override
    public void emitirSom() {
        System.out.println("Auau!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne.");
    }

}
