package fr.ensim.info.a.Zoo.model;

public abstract class Animal {

    private String nom;
    private TypeAnimal typeAnimal;

    protected Animal(String nom, TypeAnimal typeAnimal) {
        this.nom = nom;
        this.typeAnimal = typeAnimal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
