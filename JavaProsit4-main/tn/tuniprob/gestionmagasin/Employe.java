package tn.tuniprob.gestionmagasin;

public class Employe {
    public int identifiant;
    public String nom;
    public String adresse;
    public int nbr_heures;
    float salaire;

    public Employe(){}

    public Employe(int identifiant, String nom, String adresse, int nbr_heures) {
    this.identifiant = identifiant;
    this.nom = nom;
    this.adresse = adresse;
    this.nbr_heures = nbr_heures;
    }
    @Override
    public String toString() {
        return this.identifiant+", "+this.nom+", "+this.adresse+", "+this.nbr_heures+" .\n";
    }

    public void afficherSalaire(){
        System.out.println(this.salaire);
    }
    public void calculSalaire(){
        this.salaire = 0;
    }

    public static boolean equals(Employe e1, Employe e2){
        return e1.identifiant == e2.identifiant && e1.nom == e2.nom && e1.adresse == e2.adresse && e1.nbr_heures == e2.nbr_heures ;
    }

}
