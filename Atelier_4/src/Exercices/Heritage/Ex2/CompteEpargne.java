package Exercices.Heritage.Ex2;

import java.util.Scanner;

class CompteEpargne extends CompteBancaire{
    private double minSolde = 200;
    private double tauxAnnuel = 0.01;
    private double soldeEpargne;

    public CompteEpargne(long numero, double solde, double minSolde, double tauxAnnuel ,double soldeEpargne){
        super(numero, solde);
        this.minSolde = minSolde;
        this.tauxAnnuel = tauxAnnuel;
        this.soldeEpargne = soldeEpargne;
    }

    public double TauxAnnuel() {
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Voulez-vous un compte epargne ? [y/n]");
        String response = myObj2.nextLine();
        if (response.equals("y") && solde < minSolde){
            System.out.println("t'as pas le droit de faire un compte epargne");
        }else if (response.equals("y") && solde > minSolde){
            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Combien vouler-vous epargné ? (Le minimum 200 DH)");
            this.soldeEpargne = myObj3.nextDouble();
            System.out.println("vous avez epargner :" + soldeEpargne*tauxAnnuel);
        }
        else {
            super.Afficher();

        }

        return soldeEpargne;
    }
}