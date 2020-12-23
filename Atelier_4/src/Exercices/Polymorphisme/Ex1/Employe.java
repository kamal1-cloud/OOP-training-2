package Exercices.Polymorphisme.Ex1;

public class Employe extends Personne{
    double salaire;

    public Employe(String nom, String prenom, String adresse, String ville, int datedenaissance, double salaire) {
        super(nom, prenom, adresse, ville, datedenaissance);
        this.salaire = salaire;
    }




    @Override
    public void afficher() {
        System.out.println(nom+" "+prenom+" "+adresse+" "+ville+" "+datedenaissance+" "+salaire);

    }
}
