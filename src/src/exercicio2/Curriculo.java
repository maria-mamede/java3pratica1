package src.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Curriculo implements Printable{
    Pessoa pessoa;
    List<String> listaHabilidadesPessoa = new ArrayList<>();

    public Curriculo(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "pessoa=" + pessoa +
                ", habilidadesPessoa=" + listaHabilidadesPessoa +
                '}';
    }

    static void print(Curriculo curriculo){
        System.out.println("Imprimindo currículo.");
        System.out.println(curriculo);
    }
}
