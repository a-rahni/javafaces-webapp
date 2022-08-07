/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.jsfwebapp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author rahni
 */
@ManagedBean(name="inscrireBean")
@RequestScoped
public class InscrireAdherent {
    
    @ManagedProperty(value="#{adherentData}")
    private AdherentData adherentData;
    
    private Adherent adherent = new Adherent();
    
    public InscrireAdherent(){
        adherent = new Adherent();
    }
    
    // Méthode d'action appelée lors du clic sur le bouton du formulaire
    // d'inscription
    public void inscrire(){
        if(adherent.getNom()!=null && !adherent.getNom().equals(""))
            adherentData.getAdherents().add(adherent);
        
    }

    public Adherent getAdherent() {
        return adherent;
    }
    
    
    
}
