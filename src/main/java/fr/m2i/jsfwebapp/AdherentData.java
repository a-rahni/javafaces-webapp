/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.jsfwebapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author rahni
 */
@ManagedBean(name="adherentData", eager=true)
@SessionScoped  /*ne pas utiliser list adherent en static --> pour garder les données durant toute la session*/
public class AdherentData {
    
    private List<Adherent> adherents = new ArrayList<>();
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String ville;
    private String loisir;
    private String sexe;

    public AdherentData() {
        adherents.add(new Adherent(1,"nom1","prenom1", new Date(), "Paris", "Lecture", "Homme"));
        adherents.add(new Adherent(2,"nom2","prenom2", new Date(), "Lyon", "Dessin", "Femme"));
        adherents.add(new Adherent(3,"nom3","prenom3", new Date(), "Paris", "Cinema", "Homme"));
    }

    public List<Adherent> getAdherents() {
        return adherents;
    }
    
    public String addAdherent(){
        int id = adherents.get(adherents.size()-1).getId()+1;
        Adherent adherent = new Adherent(id,nom, prenom, dateNaissance, ville, loisir,sexe);
        adherents.add(adherent);
        id = 0;
        nom= null;
        prenom = null;
        dateNaissance = null;
        ville =null;
        loisir = null;
        sexe = null;
        
        
        return "adherentList?faces-redirect=true";
    }
    
    
    
    public String goToValidate(){
        return "validationAdherent?faces-redirect=true";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLoisir() {
        return loisir;
    }

    public void setLoisir(String loisir) {
        this.loisir = loisir;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    
    
    
}
