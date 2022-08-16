
package fr.m2i.jsf.web.app;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="adherentData" , eager = true)
@SessionScoped
public class AdherentData {
    
    private List<Adherent> adherents = new ArrayList();
    private String nom ;
    private String prenom ;
    private String dateNaissance ;
    private String ville ;
    private String loisir ;
    private String sexe ;

    public List<Adherent> getAdherents() {
        return adherents;
    }

    public String addAdherents() {
        Adherent adherent = new Adherent(nom, prenom,dateNaissance,ville,loisir,sexe);
        adherents.add(adherent);
        
        nom="";
        prenom="";
        dateNaissance="";
        ville="";
        loisir="";
        sexe="";
        
        return "showAdherents" ;
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

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
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
