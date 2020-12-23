package Exercices.Polymorphisme.Ex1;

public class Test {
    public static void main(String[] args) {
        Personne[] P = new Personne[8];

        P[0] = new Employe("jamal", "Deboz", "Quartier A", "Marrakech",1996,30000);
        P[1] = new Employe("Yassine", "Modden", "Quartier B", "Safi",1997,34000);
        P[2] = new Employe("Adnan", "Tamsamani", "Quartier C", "Ben Guerir",1997,34000);
        P[3] = new Employe("Abd hakim", "Ennasifi", "Quartier D", "Ben Guerir",1997,34000);
        P[4] = new Employe("Abd hakim", "Ennasifi", "Quartier D", "Ben Guerir",1997,34000);
        P[5] = new Chef("Zakaria", "Elhouari", "Quartier E", "Ben Guerir",1997,34000,"Marketig");
        P[6] = new Chef("Zakaria", "Elhouari", "Quartier F", "Ben Guerir",1997,34000,"Marketig");
        P[7] = new Directeur("Kamal", "Habrich", "Quartier G", "Marrakech",1997,34000,"commerciale");


        for (Personne p : P)
        {
            p.afficher();

        }



    }
}
