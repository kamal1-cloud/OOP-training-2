package Exercices.Heritage.Ex3;
import java.util.Scanner;

abstract class Personne {
    protected String nom;
    protected String prenom;
    protected int dateDeNaissance;
    protected String adresse;
    protected String ville;

    public Personne(String nom, String prenom, int dateDeNaissance, String adresse, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.ville = ville;
    }

    public void modifiePersonne (String adresse, String ville) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("tu veux modifier l'adresse et la ville [y/n]");
        String response = myObj.nextLine();
        if (response.equals("y")){
            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Entrer ton nouveaux adresse, ville ");
            String Newadress = myObj2.nextLine();
            String Newville = myObj2.nextLine();
            this.adresse = Newadress;
            this.ville = Newville;

        }
      /*  else {
            super.ecrirePersonne();
        }*/

    }
    public abstract void ecrirePersonne() ;

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }


}