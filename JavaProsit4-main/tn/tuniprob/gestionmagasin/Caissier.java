package tn.tuniprob.gestionmagasin;

public class Caissier extends Employe {
    int NumCaisse;


    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int NumCaisse) {
        super(identifiant, nom, adresse, nbr_heures);
        this.NumCaisse = NumCaisse;

    }
    @Override
    public String toString() {
        return this.identifiant+", "+this.nom+", "+this.adresse+", "+this.nbr_heures+" "+this.NumCaisse+" .\n";
    }

    public void calculSalaire(){
        if (this.nbr_heures > 180){
            this.salaire = 5 * this.nbr_heures ;
        }
        else{
            this.salaire = 5.75f * this.nbr_heures ;
        }
    }


}
