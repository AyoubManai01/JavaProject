package tn.tuniprob.gestionmagasin;

public class Vendeur extends Employe {
    public int TauxVente;


    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, int TauxVente) {
        super(identifiant, nom, adresse, nbr_heures);
        this.TauxVente = TauxVente;

    }

    @Override
    public String toString() {
        return this.identifiant+", "+this.nom+", "+this.adresse+", "+this.nbr_heures+" "+this.TauxVente+" .\n";
    }

    public void calculSalaire(){
        this.salaire = 450*TauxVente;
    }


}
