package Exercices.Heritage.Ex1;

public class Article {
    protected String nom;
    protected double prix;

    public Article(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void afficher(){
        System.out.println("Le prix de l'article est"+" "+prix+" "+"$");
    }
}





