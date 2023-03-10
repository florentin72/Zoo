package fr.ensim.info.a.Zoo;

import fr.ensim.info.a.Zoo.exception.ErrorResponse;
import fr.ensim.info.a.Zoo.exception.LimitVisiteurException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@RestController
@RequestMapping(path = "/zoo")
public class ZooResource {

    @Autowired
    ZooService zooService;

    static Logger LOGGER = Logger.getLogger(ZooResource.class);
    /**
     *
     * @throws LimitVisiteurException
     */

    @PostMapping(path = "/visiteur", produces = "application/json")
    public void addVisiteur() throws LimitVisiteurException {
        LOGGER.info("Ajout d'un visiteur");
        zooService.addVisiteur();
    }

    /**
     *
     * @return
     */
    @GetMapping(path = "/visiteur", produces = "application/json")
    public int getNbVisiteur()  {
        LOGGER.info("Recherhe nombre visiteurs");
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
        LOGGER.error(ex.getMessage(),ex);
        return errorResponse;
    }

    /**
     *
     * @return
     */
    @GetMapping(path = "/animaux", produces = "application/json")
    public Map<String,Integer> getNbAnimaux ( ){
        LOGGER.info("Recherhe du  nombre d'animaux");

        return zooService.getAnimaux();

    }

    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter() {
        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
        loggingFilter.setIncludeClientInfo(true);
        loggingFilter.setIncludeQueryString(true);
        loggingFilter.setIncludePayload(true);
        loggingFilter.setMaxPayloadLength(64000);
        return loggingFilter;
    }

}
