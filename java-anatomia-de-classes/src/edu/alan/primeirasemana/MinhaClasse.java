package edu.alan.primeirasemana;

public class MinhaClasse {

    public static void main( String [] args){

        String firstName = "Alan";
        String lastName = "Vieira";

        String fullName = fullName(firstName, lastName);

        System.out.println(fullName);



    }

    public static String fullName (String firstName, String lastName){
        return firstName.concat(" ").concat(lastName);

    }
    
}
