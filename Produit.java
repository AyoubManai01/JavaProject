import java.util.Date;

public class Produit {
    int identifiant;
    String marque;
    String libelle;
    float prix;
    Date dateexp;
    Produit(){}
    Produit(int identifiant, String marque, String libelle, float prix){
            this.identifiant = identifiant;
            this.marque = marque;
            this.libelle = libelle;
            this.prix = prix;
    }
    Produit(int identifiant, String marque, String libelle){
        this.identifiant = identifiant;
        this.marque = marque;
        this.libelle = libelle;
    }
    Produit(int identifiant, String marque, String libelle, float prix, Date dateexp){
        this.identifiant = identifiant;
        this.marque = marque;
        this.libelle = libelle;
        this.prix = prix;
        this.dateexp = dateexp;
    }
    void afficher(){
        System.out.println("Identifiant: " + this.identifiant);
        System.out.println("Marque: " + this.marque);
        System.out.println("Libelle: " + this.libelle);
        System.out.println("Prix: " + this.prix);
    }

    @Override
    public String toString(){
        return this.identifiant + " " + this.marque + " " + this.libelle + " " + this.prix;
    }
}


