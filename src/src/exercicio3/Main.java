package src.exercicio3;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        cachorro.emitirSom();
        cachorro.comerCarne();

        gato.emitirSom();
        gato.comerCarne();

        vaca.emitirSom();
        vaca.comerPasto();

        cachorro.comerAnimal(cachorro);
        gato.comerAnimal(gato);
        vaca.comerAnimal(vaca);
    }
}
