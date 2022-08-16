
package fr.m2i.jsfwebapp;

/**
 *
 * @author rahni
 */
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "adherentData", eager = true)
public class AdherentData {

    private List<Adherent> adherents;
    private Adherent adherent;
    
    public AdherentData() {
        this.adherents = new ArrayList();
        this.adherent = new Adherent();
    }

    public String goToValidate() {
        return "validate?faces-redirect=true";
    }

    public String onSave() {
        adherents.add(adherent);
        adherent = new Adherent();
        return "listAdherent?faces-redirect=true";
    }

    public List<Adherent> getAdherents() {
        return adherents;
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }
}