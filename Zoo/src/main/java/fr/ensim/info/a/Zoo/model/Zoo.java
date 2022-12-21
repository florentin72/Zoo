package fr.ensim.info.a.Zoo.model;

import java.util.List;

public class Zoo {
    private List<Secteur> secteurList;
    private int nbVisiteurs;
    private int maxVisiteurParSecteur;


    public List<Secteur> getSecteurList() {
        return secteurList;
    }

    public void setSecteurList(List<Secteur> secteurList) {
        this.secteurList = secteurList;
    }

    public int getNbVisiteurs() {
        return nbVisiteurs;
    }

    public void setNbVisiteurs(int nbVisiteurs) {
        this.nbVisiteurs = nbVisiteurs;
    }

    public int getMaxVisiteurParSecteur() {
        return maxVisiteurParSecteur;
    }

    public void setMaxVisiteurParSecteur(int maxVisiteurParSecteur) {
        this.maxVisiteurParSecteur = maxVisiteurParSecteur;
    }

}
