package fr.ensim.info.a.Zoo;
import fr.ensim.info.a.Zoo.exception.ErrorResponse;
import fr.ensim.info.a.Zoo.exception.LimitVisiteurException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "/zoo")
public class ZooResource {

    @Autowired
    ZooService zooService;



    @PostMapping(path = "/visiteur", produces = "application/json")
    public void addVisiteur() throws LimitVisiteurException {
        zooService.addVisiteur();
    }
    @GetMapping(path = "/visiteur", produces = "application/json")
    public int getNbVisiteur()  {
        return zooService.getNbVisiteur();
    }

    @ExceptionHandler(LimitVisiteurException.class)
    public ErrorResponse handleException(LimitVisiteurException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(ex.getMessage());
        return errorResponse;
    }

}
