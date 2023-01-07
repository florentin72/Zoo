package fr.ensim.info.a.Zoo;
import fr.ensim.info.a.Zoo.exception.ErrorResponse;
import fr.ensim.info.a.Zoo.exception.LimitVisiteurException;
import fr.ensim.info.a.Zoo.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/zoo")
public class ZooResource {

    @Autowired
    ZooService zooService;


    /**
     *
     * @throws LimitVisiteurException
     */
    @PostMapping(path = "/visiteur", produces = "application/json")
    public void addVisiteur() throws LimitVisiteurException {
        zooService.addVisiteur();
    }

    /**
     *
     * @return
     */
    @GetMapping(path = "/visiteur", produces = "application/json")
    public int getNbVisiteur()  {
        return zooService.getNbVisiteur();
    }

    /**
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(LimitVisiteurException.class)
    public ErrorResponse handleException(LimitVisiteurException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(ex.getMessage());
        return errorResponse;
    }

    /**
     *
     * @return
     */
    @GetMapping(path = "/animaux", produces = "application/json")
    public Map<String,Integer> getNbAnimaux ( ){
       return zooService.getAnimaux();

    }



}
