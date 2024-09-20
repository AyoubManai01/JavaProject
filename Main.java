import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Produit produit0 = new Produit();
        Produit produitA = new Produit(1021, "Lait", "Delice");
        Produit produitB = new Produit(2510, "Yaourt", "Vitalait");
        Produit produitC = new Produit(3250, "Tomate", "Sicam", 1.200f);

        produit0.afficher();
        produitA.afficher();
        produitB.afficher();
        produitC.afficher();

        produitA.prix = 0.700f;
        produitA.afficher();

        produitB.prix = 0.600f;
        produitB.afficher();

        System.out.println(produitA.toString());
        System.out.println(produitB.toString());
        // toString doit etre appelé comme parametre du fonction println, au contraire du
        // methode afficher() qui ne necessite pas l'appel du println

        Date expirationDate = new Date(2025, 11, 31);
        produitA.dateexp = expirationDate;
        produitB.dateexp = expirationDate;
        produitC.dateexp = expirationDate;
        System.out.println(produitA.dateexp);
    }

}
