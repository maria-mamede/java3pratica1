package src.exercicio3;

abstract class Animal {
    public void emitirSom(){}

    public void comerAnimal(Cachorro cachorro){
        System.out.println("Comendo carne.");
    }

    public void comerAnimal(Gato gato){
        System.out.println("Comendo carne.");
    }

    public void comerAnimal(Vaca vaca){
        System.out.println("Comendo pasto.");
    }
}
