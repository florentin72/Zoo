package fr.ensim.info.a.Zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "/zoo")
public class ZooResource {

    @Autowired
    ZooService zooService;



    @PostMapping(path = "/visiteur", consumes = "application/json", produces = "application/json")
    public void addVisiteur()  {
        zooService.addVisiteur();
    }
    @GetMapping(path = "/visiteur", consumes = "application/json", produces = "application/json")
    public int getNbVisiteur()  {
        return zooService.getNbVisiteur();
    }

}
