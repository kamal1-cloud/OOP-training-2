package Exercices.Heritage.Ex2;

public class Test {
    public static void main(String[] args) {
        CompteBancaire Compte = new CompteBancaire(1256356164,2000);
        Compte.Ajouter();
        Compte.Retirer();
        Compte.Afficher();
        CompteEpargne CompteE = new CompteEpargne(1256356164,2000,200,0.01, Compte.solde);
        CompteE.TauxAnnuel();
        CompteCourant CompteC = new CompteCourant(1256356164,20000);
    }
}
