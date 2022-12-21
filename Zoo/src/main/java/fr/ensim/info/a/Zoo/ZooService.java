package fr.ensim.info.a.Zoo;

import org.springframework.stereotype.Component;

@Component
public class ZooService {
    public void addVisiteur() {
        ZooApplication.zoo.setNbVisiteurs( ZooApplication.zoo.getNbVisiteurs() +1 );
    }
    public int getNbVisiteur() {
       return ZooApplication.zoo.getNbVisiteurs();
    }
}
