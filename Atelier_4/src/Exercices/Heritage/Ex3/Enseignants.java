package Exercices.Heritage.Ex3;

import java.util.Scanner;

class Enseignants extends Personne{
     String specialite;
     static int numberPers;

    public Enseignants(String nom, String prenom, int dateDeNaissance, String adresse, String ville, String specialite) {
        super(nom, prenom, dateDeNaissance, adresse, ville);
        this.specialite = specialite;
    }

     @Override
     public void ecrirePersonne() {
         Scanner Obj = new Scanner(System.in);
         System.out.println("Entrer le nom, prenom, date de naissance, adresse, ville, Specialité");
         this.nom = Obj.nextLine();
         this.prenom = Obj.nextLine();
         this.dateDeNaissance = Obj.nextInt();
         this.adresse = Obj.nextLine();
         this.ville = Obj.nextLine();
         this.specialite = Obj.nextLine();

         System.out.println(this.nom + this.prenom + this.dateDeNaissance+ this.adresse +this.ville+ this.specialite);

     }

    @Override
    public String toString() {
        return "Enseignants{" +
                "specialite='" + specialite + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}

