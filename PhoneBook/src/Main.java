import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Main {
    public static void main ( String[] args ) {

        PhoneContact Paweł = new PhoneContact ("Paweł", "Kozak", "5678", 20);
        PhoneContact Ewa = new PhoneContact ("Ewa", "Bańkowska", "456789345", 23);
        PhoneContact Asia = new PhoneContact ("Asia", "Bańkowska", "987654309",22);
        PhoneContact Staś = new PhoneContact ("Stać", "Marzec", "65563231",10);
        PhoneContact Tamara = new PhoneContact ("Tamara", "Słońce", "5347328",12);

        PhoneContact[]con ={Paweł,Ewa,Asia,Staś,Tamara}


        printPhoneContact ( Paweł );
        printPhoneContact ( Ewa );


    }

    public static void printPhoneContact(PhoneContact contact) {
        System.out.println (contact.getName () );
        System.out.println (contact.getSurname () );
        System.out.println (contact.getAge () );
        System.out.println (contact.getPhoneNumber () );
    }

    public static PrntCon (PhoneContact[]con){
        System.out.println (PhoneContact[]con );
    }
}
