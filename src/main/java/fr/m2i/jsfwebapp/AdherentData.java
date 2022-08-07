/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.jsfwebapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author rahni
 */
@ManagedBean(name="adherentData", eager=true)
public class AdherentData {
    
    private List<Adherent> adherents = new ArrayList<>();

    public AdherentData() {
        adherents.add(new Adherent("nom1","prenom1", new Date(), "Paris", "Lecture", "Homme"));
        adherents.add(new Adherent("nom2","prenom2", new Date(), "Lyon", "Dessin", "Femme"));
        adherents.add(new Adherent("nom3","prenom3", new Date(), "Paris", "Cinema", "Homme"));
    }

    public List<Adherent> getAdherents() {
        return adherents;
    }
    
    
    
}
