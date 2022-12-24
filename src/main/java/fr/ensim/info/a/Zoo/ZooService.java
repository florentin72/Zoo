package fr.ensim.info.a.Zoo;

import fr.ensim.info.a.Zoo.exception.LimitVisiteurException;
import org.springframework.stereotype.Component;

@Component
public class ZooService {
    public void addVisiteur() throws LimitVisiteurException {
        if (ZooApplication.zoo.getNbVisiteurs() == 3){
            throw new LimitVisiteurException("trop de visiteurs");
        }
        ZooApplication.zoo.setNbVisiteurs( ZooApplication.zoo.getNbVisiteurs() +1 );
    }
    public int getNbVisiteur() {
       return ZooApplication.zoo.getNbVisiteurs();
    }
}
