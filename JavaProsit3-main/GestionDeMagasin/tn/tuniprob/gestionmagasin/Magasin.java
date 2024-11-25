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
        StringBuilder s = new StringBuilder("Magasin{" +
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
        if (chercherProduit(p)){
            System.out.println("Le produit existe déja ...");
        }

        tab[CapMagasin] = p;
        CapMagasin++;
        totalProduits++;
    }

    public static int getTotalProduits() {
        return totalProduits;
    }

    public boolean chercherProduit(Produit p) {
        for (int i = 0; i < CapMagasin; i++) {
            if (tab[i].comparer1(p)) {
                return true;
            }
        }
        return false;
    }

    public void supprimerProduit(Produit p) {
        for (int i = 0; i < CapMagasin; i++) {
            if (tab[i].comparer1(p)) {
                tab[i] = null;
                CapMagasin--;
                totalProduits--;
                for (int j = 0; j < CapMagasin; j++) {
                    tab[j] = tab[j + 1];
                }
            }
        }
    }
    public static void comparerMagasin(Magasin M1, Magasin M2) {
        int x=0, y=0;
        for (int i = 0; i < M1.CapMagasin; i++) {
            if (M1.tab[i] != null){
                x++;
            }
        }
        for (int j = 0; j < M2.CapMagasin; j++) {
            if (M1.tab[j] != null){
                y++;
            }
        }
        if (x > y){
            System.out.println("Le premier Magasin a plus de produits.");
        }
        else {
            System.out.println("Le deuxieme Magasin a plus de produits.");
        }
    }


}
