package Exercices.Polymorphisme.Ex1;

public class Personne {
    String nom, prenom, adresse, ville ;
    int datedenaissance;

    public Personne(String nom, String prenom, String adresse, String ville, int datedenaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.datedenaissance = datedenaissance;

    }
    public void afficher(){
        System.out.println(nom+" "+prenom+" "+adresse+" "+ville+" "+datedenaissance);
    }
}
