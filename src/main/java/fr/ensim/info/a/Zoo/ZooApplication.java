package fr.ensim.info.a.Zoo;

import fr.ensim.info.a.Zoo.model.Secteur;
import fr.ensim.info.a.Zoo.model.Tigre;
import fr.ensim.info.a.Zoo.model.Zebre;
import fr.ensim.info.a.Zoo.model.Zoo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Stack;

@SpringBootApplication
public class ZooApplication {

	public static Zoo zoo;
	public static void main(String[] args) {
		SpringApplication.run(ZooApplication.class, args);


		System.out.println("Hello welcome in my zoo");
		zoo = new Zoo();
		zoo.setMaxVisiteurParSecteur(15);
		Secteur<Tigre> secteurTigre = new Secteur<>();
		Secteur<Zebre> secteurZebre= new Secteur<>();
		secteurTigre.setAnimalList(new ArrayList<>());
		secteurZebre.setAnimalList(new ArrayList<>());
		for (int i=0; i< 50; i++){
			secteurTigre.getAnimalList().add(new Tigre());
			secteurZebre.getAnimalList().add(new Zebre());

		}
		secteurZebre.getAnimalList().add(new Zebre());
		secteurZebre.getAnimalList().add(new Zebre());

		secteurZebre.getAnimalList().add(new Zebre());

		zoo.setSecteurList(new Stack<>());
		zoo.getSecteurList().add(secteurTigre);
		zoo.getSecteurList().add(secteurZebre);
	}

}
