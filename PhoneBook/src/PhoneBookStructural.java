import java.util.Arrays;

public class PhoneBookStructural {
    public static void main ( String[] args ) {
        int id = 1;
        String name = "Ewa";
        String surname = "";
        String phoneNumber = "509376914";
        int age = 20;
        String contact = "1;Ewa;Bankowska;20;509376111";
        boolean isHidden = false;
        int[] lastDialed = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 1;
        int idk = 2;

        printContactCard ( contact );
        printContact ( contact );
        String wynik = getContact ( id, name, surname, age, phoneNumber );
        System.out.println ( wynik );
        getContactRaw ( id, name, surname, age, phoneNumber, isHidden );
        int go = getLastDialed ( lastDialed );
        System.out.println ( );
        System.out.println ( go );
        getLastDialed ( lastDialed, index );
        dial ( lastDialed, idk );
        removeLastDialed (index,lastDialed);
    }


    static void removeLastDialed (int index,int []lastDialed){


       lastDialed [index] = 0;

        System.out.println ( Arrays.toString ( lastDialed ));
    }

    static void dial ( int[] lastDialed, int idk ) {
        lastDialed[0] = idk;
        System.out.println ( Arrays.toString ( lastDialed ) );

    }


    static int getLastDialed ( int[] lastDialed ) {
        return lastDialed[0];

    }

    static int getLastDialed ( int[] lastDialed, int index ) {
        int newIndex = index - 1;

        int c = lastDialed[newIndex];
        System.out.println ( c );

        if (c == 0) {
            System.out.println ( "Wartość równa 0" );
        }
        return c;

    }

    static void printContactCard ( String contact ) {
        if (contact.isEmpty ( )) {
            System.out.println ( "Nieznany" );
        } else {
            System.out.println ( );
            String[] new1 = contact.split ( ";" );
            System.out.println ( "Id = " + new1[0] );
            System.out.println ( "Imię = " + new1[1] );
            System.out.println ( "Nazwisko = " + new1[2] );
            System.out.println ( "Wiek = " + new1[3] );
            System.out.println ( "Numer telefonu  = " + new1[4] );
        }
    }

    public static String getContact ( int id, String name, String surname, int age, String phoneNumber ) {

        if (name.isEmpty ( )) {
            name = "Nieznany";
        } else {

        }

        if (surname.isEmpty ( )) {
            surname = "Nieznany";
        } else {
        }


        if (phoneNumber.isEmpty ( )) {
            ;
        } else {

        }

        return id + " " + name + " |" + surname + " |" + " " + age + " " + phoneNumber;

    }

    private static void getContactRaw ( int id, String name, String surname, int age, String number, boolean isHidden ) {
        if (name.isEmpty ( )) {
            System.out.println ( "Nieznany" );
        } else
            System.out.printf ( "\n %d ; %s ; %s ; %d ; %s", id, name, surname, age, number, isHidden );

        if (surname.isEmpty ( )) {
            System.out.println ( "Nieznany" );
        } else
            System.out.printf ( "\n %d ; %s ; %s ; %d ; %s", id, name, surname, age, number, isHidden );

        if (number.isEmpty ( )) {
            System.out.println ( "Nieznany" );
        } else
            System.out.printf ( "\n %d ; %s ; %s ; %d ; %s", id, name, surname, age, number, isHidden );
        if (number.length () > 9 && number.length () <9) {
            System.out.println (number.replaceAll ( "509376914", "000000000" ) );
            ;
        }


    }

    static void printContact ( String contact ) {

        switch (contact) {
            case "":
                System.out.println ( "Nieznany" );
                break;
        }
        String[] new2 = contact.split ( ";" );

        System.out.printf ( "| %s|  %s | %s | %s | %s", new2[0], new2[1], new2[2], new2[3], new2[4] );

    }


}
