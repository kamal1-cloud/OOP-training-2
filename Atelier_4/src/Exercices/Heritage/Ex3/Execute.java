
package Exercices.Heritage.Ex3;

public class Execute {
    public static void main(String[] args) {

        Enseignants prof = new Enseignants("Kamal","Habrich",1889,"Quartier A","Marrakech","Math");
        Secretaire se1 = new Secretaire("Hanan","latifi",1997,"Quartier C","Youssoufia",2);
        System.out.println(se1.toString());
        System.out.println(prof.toString());
        se1.ecrirePersonne();
        se1.modifiePersonne("Quartier D","Marrakech");
        prof.ecrirePersonne();


    }
}
