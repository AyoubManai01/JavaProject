package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produit produitA = new Produit(1021, "Lait", "Delice", 0.700f);
        Produit produitB = new Produit(2510, "Yaourt", "Vitalait", 0.600f);
        Produit produitC = new Produit(3250, "Tomate", "Sicam", 1.200f);
        Produit produitD = new Produit(4500, "Tomate", "Sicam", 1.350f);

        Date expirationDate = new Date(2025 - 1900, 11, 31);
        produitA.setDateexp(expirationDate);
        produitB.setDateexp(expirationDate);
        produitC.setDateexp(expirationDate);

        //Magasin M = new Magasin(9001, "MG");
        //M.ajouterProduit(produitA);
        //M.ajouterProduit(produitB);
        //M.ajouterProduit(produitC);

        //System.out.println(M.toString());
        //System.out.println("Total produits dans tous les magasins: " + Magasin.getTotalProduits());
        //System.out.println(M);
        //M.supprimerProduit(produitA);
        //System.out.println(Magasin.getTotalProduits());
        //System.out.println(M);

        //Magasin M1 = new Magasin(9001, "MG");
        //M1.ajouterProduit(produitA);
        //M1.ajouterProduit(produitB);
        //M1.ajouterProduit(produitC);

        //Magasin.comparerMagasin(M, M1);

        Magasin Carrefour = new Magasin(1, "Centre-ville");
        Magasin Monoprix = new Magasin(2, "Menzah 6");

        Caissier C1 = new Caissier(1,"Ahmed", "Tunis", 15, 10);
        Caissier C2 = new Caissier(2,"Amine", "Bizerte", 17, 11);

        Vendeur V1 = new Vendeur(1, "Elyes", "Tunis", 10, 7);
        Responsable R1 = new Responsable(1, "Ayoub", "Tunis", 19, 100);

        Carrefour.ajouterEmploye(C1);
        Carrefour.ajouterEmploye(C2);
        Carrefour.ajouterEmploye(V1);
        Carrefour.ajouterEmploye(R1);

        Caissier C3 = new Caissier(3,"Moenes", "Tunis", 11, 18);

        Vendeur V2 = new Vendeur(2, "Elyes", "Tunis", 10, 9);
        Vendeur V3 = new Vendeur(3, "Khalil", "Beja", 12, 11);
        Vendeur V4 = new Vendeur(4, "Fourat", "Nabeul", 14, 8);
        Responsable R2 = new Responsable(2, "Salah", "Tunis", 18, 200);

        Monoprix.ajouterEmploye(C3);
        Monoprix.ajouterEmploye(V2);
        Monoprix.ajouterEmploye(V3);
        Monoprix.ajouterEmploye(V4);
        Monoprix.ajouterEmploye(R2);

        Carrefour.afficherEmploye();

        Carrefour.ajouterProduit(produitA);
        Carrefour.ajouterProduit(produitB);
        Monoprix.ajouterProduit(produitC);
        Monoprix.ajouterProduit(produitD);

        //System.out.println(Monoprix.toString());

        //System.out.println(R1.Prime);
        //System.out.println(R2.Prime);

        for (int i=0; i < Carrefour.countEmp; i++){
            Carrefour.employe[i].calculSalaire();

        }
        for (int i=0; i < Carrefour.countEmp; i++){
            Carrefour.employe[i].afficherSalaire();
        }
        System.out.println(Carrefour.toString());
        System.out.println(Employe.equals(C1, C2));

        
    }
}
