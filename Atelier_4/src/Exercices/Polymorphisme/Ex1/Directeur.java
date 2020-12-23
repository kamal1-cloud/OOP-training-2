package Exercices.Polymorphisme.Ex1;

public class Directeur extends Chef{


    public Directeur(String nom, String prenom, String adresse, String ville, int datedenaissance, double salaire, String service) {
        super(nom, prenom, adresse, ville, datedenaissance, salaire, service);
    }

    @Override
    public void afficher() {
        System.out.println(nom+" "+prenom+" "+adresse+" "+ville+" "+datedenaissance+" "+salaire+" "+service);
    }
}
