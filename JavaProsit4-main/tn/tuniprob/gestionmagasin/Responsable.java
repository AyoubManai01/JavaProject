package tn.tuniprob.gestionmagasin;

public class Responsable extends Employe {
    public int Prime;

    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, int Prime){
        super(identifiant, nom, adresse, nbr_heures);
        this.Prime = Prime;
    }
    @Override
    public String toString() {
        return this.identifiant+", "+this.nom+", "+this.adresse+", "+this.nbr_heures+" "+this.Prime+" .\n";
    }

    public void calculSalaire(){
        if (this.nbr_heures > 160){
            this.salaire = 10 * this.nbr_heures + this.Prime;
        }
        else{
            this.salaire = 12 * this.nbr_heures + this.Prime;
        }
    }

}
