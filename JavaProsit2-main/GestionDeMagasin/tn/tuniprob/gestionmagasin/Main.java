package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produit produitA = new Produit(1021, "Lait", "Delice", 0.700f);
        Produit produitB = new Produit(2510, "Yaourt", "Vitalait", 0.600f);
        Produit produitC = new Produit(3250, "Tomate", "Sicam", 1.200f);

        Date expirationDate = new Date(2025 - 1900, 11, 31);
        produitA.setDateexp(expirationDate);
        produitB.setDateexp(expirationDate);
        produitC.setDateexp(expirationDate);

        Magasin M = new Magasin(9001, "MG");
        M.ajouterProduit(produitA);
        M.ajouterProduit(produitB);
        M.ajouterProduit(produitC);

        System.out.println(M.toString());
        System.out.println("Total produits dans tous les magasins: " + Magasin.getTotalProduits());
    }
}
