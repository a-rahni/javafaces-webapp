
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
        adherent.setId(adherents.size());
        adherents.add(adherent);
        adherent = new Adherent();
        return "listAdherent?faces-redirect=true";
    }

    public String onSelect(int id) {
        adherent = getAdherentById(id);
        return "update";
    }
    
    public void onDelete(int id) {
        Adherent toDelete = getAdherentById(id);

        if (toDelete != null) {
            adherents.remove(toDelete);
        }

        adherent = new Adherent();
    }
    
    public String onUpdate() {
        adherent = new Adherent();
        return "listAdherent";
    }
    /* autre manière de 'updater (au lieu de passer l'iD, passer l'objet adherent modifier en param)*/
    //public String onUpdate(Adherent a) {
       // int index =adherents.indexOf(a);
        // recuperer l'indexe de l'objet et update
       // adherents.set(index, newObjet); // dans la bonne methode ...   
      //  return "";
    //}
    
    public Adherent getAdherentById(int id) {

        for (Adherent a : adherents) {
            if (a.getId() == id) {
                return a;
            }
        }
        
        return null;
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