package fr.ensim.info.a.Zoo;

import fr.ensim.info.a.Zoo.exception.LimitVisiteurException;
import fr.ensim.info.a.Zoo.model.Animal;
import fr.ensim.info.a.Zoo.model.Secteur;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class ZooService {

    /**
     *
     * @throws LimitVisiteurException
     */
    public void addVisiteur() throws LimitVisiteurException {
        if (ZooApplication.zoo.getNbVisiteurs() == 3){
            throw new LimitVisiteurException("trop de visiteurs");
        }
        ZooApplication.zoo.setNbVisiteurs( ZooApplication.zoo.getNbVisiteurs() +1 );
    }

    /**
     *
     * @return
     */
    public int getNbVisiteur() {
       return ZooApplication.zoo.getNbVisiteurs();
    }

    /**
     *
     * @return
     */
    public Map<String,Integer> getAnimaux() {
        Map<String,Integer> retour = new TreeMap();
        ZooApplication.zoo.getSecteurList().forEach(secteur ->  {
            retour.put(secteur.getAnimalName(),secteur.getAnimalList().size());

        });


       return retour;
    }
}
