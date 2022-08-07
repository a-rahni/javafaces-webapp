/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.jsfwebapp;

import java.util.Date;


/**
 *
 * @author rahni
 */
public class Adherent {
    
    public static final String HOMME ="h";
    public static final String FEMME ="f";
    
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String ville;
    private String loisir;
    private String sexe;

    public Adherent(String nom, String prenom, Date dateNaissance, String ville, String loisir, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
        this.loisir = loisir;
        this.sexe = sexe;
    }
    
    public Adherent(){
        
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
