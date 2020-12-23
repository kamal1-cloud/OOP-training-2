package Exercices.Heritage.Ex2;
import java.util.Scanner;
public class CompteBancaire {
    protected long numero;
    protected double solde;
    public CompteBancaire(long numero, double solde){
        this.numero = numero;
        this.solde = solde;
    }
    public void Ajouter(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter la somme souhaite ajouter :");
        this.solde += myObj.nextDouble();
        System.out.println("le montant ajouter est :" +" "+ solde);
    }
    public void Retirer(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter la somme souhaite retirer :");
        double retirer = myObj.nextDouble();
        if(retirer > solde){
            System.out.println("Le montant insuffisant");
        }else {
            System.out.println( "Le solde restant est :"+" "+(solde - retirer));
        }

    }
    public void Afficher(){
        System.out.println("Numero de compte est :"+" "+numero);
        System.out.println("Solde :"+" "+solde);
    }
}

