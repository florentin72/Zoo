package fr.ensim.info.a.Zoo;

import fr.ensim.info.a.Zoo.exception.LimitVisiteurException;
import fr.ensim.info.a.Zoo.model.Zoo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ZooServiceTest {

    @Mock
    ZooApplication zooApplication;

    @InjectMocks
    ZooService zooService = new ZooService();

    @BeforeEach
    void setUp() {
        zooApplication.zoo = new Zoo();
    }

    @Test
    void addVisiteur() throws LimitVisiteurException {
        zooService.addVisiteur();
        assertEquals(1,ZooApplication.zoo.getNbVisiteurs());
    }

 /*   @Test
    void addVisiteurException() throws LimitVisiteurException {
        zooService.addVisiteur();
        zooService.addVisiteur();
        zooService.addVisiteur();
    }
*/


    @Test
    void getNbVisiteur() {
    }
}