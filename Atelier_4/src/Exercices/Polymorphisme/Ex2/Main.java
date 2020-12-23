package Exercices.Polymorphisme.Ex2;



import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Ouvrage> ouvrages = new ArrayList<Ouvrage>();
        ArrayList<Abonne> abonnes =new ArrayList<Abonne>();
        
        
        Bibliotheque B1=new Bibliotheque("titre1", "12/12/2020", false,ouvrages,abonnes);
        ouvrages.add(new Ouvrage("Titre1","ddd",false));
        ouvrages.add(new Ouvrage("Titre1","ddd",false));

        abonnes.add(new Abonne(1,"Kamal",0666));
        abonnes.add(new Abonne(2,"Hakim",1239));
        
        
        B1.ajoutOuvrage(new Ouvrage("objet1","ddd",false));
        B1.ajoutOuvrage(new Ouvrage("objet1","ddd",false));
        B1.ajoutOuvrage(new Ouvrage("objet1","ddd",false));
        System.out.println("ouvrages List : " +ouvrages);

        System.out.println(B1.getOuvrage("Titre1"));
        
        
    }

}
