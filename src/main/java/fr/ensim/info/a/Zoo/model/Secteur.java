package fr.ensim.info.a.Zoo.model;

import java.util.List;

public class Secteur <T extends Animal> {

   private List<T> animalList;
   private TypeAnimal typeAnimal;


   public void ajouterAnimal(T animal){
      animalList.add(animal);
   }

   public List<T> getAnimalList() {
      return animalList;
   }

   public TypeAnimal getTypeAnimal() {
      return typeAnimal;
   }

   public void setTypeAnimal(TypeAnimal typeAnimal) {
      this.typeAnimal = typeAnimal;
   }

   public void setAnimalList(List<T> animalList) {
      this.animalList = animalList;
   }
   public String getAnimalName(){
      return animalList.get(0).getNom();
   }
}
