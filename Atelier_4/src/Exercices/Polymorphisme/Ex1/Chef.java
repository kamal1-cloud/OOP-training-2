package Exercices.Polymorphisme.Ex1;

public class Chef extends Employe{
    String service;

    public Chef(String nom, String prenom, String adresse, String ville, int datedenaissance, double salaire, String service) {
        super(nom, prenom, adresse, ville, datedenaissance, salaire);
        this.service = service;
    }

    @Override
    public void afficher() {
        System.out.println(nom+" "+prenom+" "+adresse+" "+ville+" "+datedenaissance+" "+salaire+" "+service);
    }
}
