package tn.tuniprob.gestionmagasin;

public class Magasin {
    final int CAP_MAX = 50;
    int identifiant;
    String adresse;
    int CapMagasin = 0;
    Produit[] tab = new Produit[CAP_MAX];
    private static int totalProduits = 0;

    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("tn.tuniprob.gestionmagasin.Magasin{" +
                "identifiant=" + identifiant +
                ", adresse='" + adresse + '\'' +
                ", CapMagasin=" + CapMagasin);
        for (int i = 0; i < CapMagasin; i++) {
            s.append(", " + tab[i].toString());
        }
        s.append("}");
        return s.toString();
    }

    public void ajouterProduit(Produit p) {
        if (CapMagasin >= CAP_MAX) {
            System.out.println("Impossible d'ajouter un produit");
            return;
        }
        tab[CapMagasin] = p;
        CapMagasin++;
        totalProduits++;
    }

    public static int getTotalProduits() {
        return totalProduits;
    }
}
