package Exercices.Heritage.Ex3;
import java.util.Scanner;
class Etudiants extends Personne{
    int numberPers;

    public Etudiants(String nom, String prenom, int dateDeNaissance, String adresse, String ville, int numberPers) {
        super(nom, prenom, dateDeNaissance, adresse, ville);
        this.numberPers = numberPers;
    }

    @Override
    public void ecrirePersonne() {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Entrer le nom, prenom, date de naissance, adresse, ville, numero de D'etudiants");
        this.nom = Obj.nextLine();
        this.prenom = Obj.nextLine();
        this.dateDeNaissance = Obj.nextInt();
        this.adresse = Obj.nextLine();
        this.ville = Obj.nextLine();
        this.numberPers = Obj.nextInt();

        System.out.println(this.nom + this.prenom + this.dateDeNaissance+ this.adresse +this.ville+ this.numberPers);

    }
}
