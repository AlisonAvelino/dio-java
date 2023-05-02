package alison.avelino.desafios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Objects;


public class DesafioAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;
        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();


        Map<Animal, String> animais = new HashMap<Animal, String>() {
            {
                put(new Animal("vertebrado", "ave", "carnivoro"), "aguia");
                put(new Animal("vertebrado", "ave", "onivoro"), "pomba");
                put(new Animal("vertebrado", "mamifero", "onivoro"), "homem");
                put(new Animal("vertebrado", "mamifero", "herbivoro"), "vaca");
                put(new Animal("invertebrado", "inseto", "hematofago"), "pulga");
                put(new Animal("invertebrado", "inseto", "herbivoro"), "lagarta");
                put(new Animal("invertebrado", "anelideo", "hematofago"), "sanguessuga");
                put(new Animal("invertebrado", "anelideo", "onivoro"), "minhoca");
            }
        };
        if (animais.get(new Animal(AN1, AN2, AN3)) != null){
            System.out.println(animais.get(new Animal(AN1, AN2, AN3)));
        }else {
            System.out.println("O animal não foi reconhecido!");
        }
    }


}


class Animal {
    String reino;
    String classe;
    String tipo;
    private int hashCode;


    public Animal(String reino, String classe, String tipo) {
        this.reino = reino;
        this.classe = classe;
        this.tipo = tipo;
        this.hashCode = Objects.hash(this.reino, this.classe, this.tipo);
    }


    public String getReino() {
        return reino;
    }


    public String getClasse() {
        return classe;
    }


    public String getTipo() {
        return tipo;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        final Animal other = (Animal) obj;
        return this.classe.equals(other.classe) &&
                this.reino.equals(other.reino) &&
                this.tipo.equals(other.tipo);
    }


    @Override
    public int hashCode() {
        return this.hashCode;
    }
}