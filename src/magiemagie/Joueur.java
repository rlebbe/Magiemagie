/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Formation
 */
public class Joueur {
    
    private String nom;
    private ArrayList<Carte> cartes = new ArrayList();

    @Override
    public String toString() {
        return "Nom : " + this.nom + ", Cartes : " + this.cartes;
    }
    
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Carte> getCarte() {
        return cartes;
    }

    public void setCarte(ArrayList<Carte> carte) {
        this.cartes = carte;
    }
    

    
 
}
