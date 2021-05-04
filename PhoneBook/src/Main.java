import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Main {
    public static void main ( String[] args ) {

        PhoneContact object1 = new PhoneContact ("Paweł", "Kozak", "5678", 20);
        PhoneContact object2 = new PhoneContact ("", "Bańkowska", "456789345", 23);

        printPhoneContact ( object1 );
        printPhoneContact ( object2 );


    }

    public static void printPhoneContact(PhoneContact contact) {
        System.out.println (contact.getName () );
        System.out.println (contact.getSurname () );
        System.out.println (contact.getAge () );
        System.out.println (contact.getPhoneNumber () );
    }
}
