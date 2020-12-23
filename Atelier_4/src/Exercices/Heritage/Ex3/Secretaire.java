package Exercices.Heritage.Ex3;


import java.util.Scanner;

class Secretaire extends Personne{
    long numeroBureau;

    public Secretaire(String nom, String prenom, int dateDeNaissance, String adresse, String ville, long numeroBureau) {
        super(nom, prenom, dateDeNaissance, adresse, ville);
        this.numeroBureau = numeroBureau;
    }


    @Override
    public void ecrirePersonne() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ajouter un/e personne [y/n]");
        String response1 = myObj.nextLine();
        if (response1.equals("y")) {
            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Entre nom, prenom, Date de nassance, adresse, ville");
            String addN = myObj3.nextLine();
            String addP = myObj3.nextLine();
            int addBd = myObj3.nextInt();
            String addAd = myObj3.nextLine();
            String addV = myObj3.nextLine();


        }
        else{
            super.toString();
        }
    }

    @Override
    public String toString() {
        return "Secretaire{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", numeroBureau=" + numeroBureau +
                '}';
    }
}