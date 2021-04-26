
public class PhoneBookStructural_a {
    public static void main ( String[] args ) {

        int id = 1;
        String name = "Ewa";
        String surname = "Bańkowska";
        String phoneNumber = "509376111";
        int age = 20;
        String contact = "2;Ewa;Bańkowska;20;509376111";
        boolean isHidden = false;


        printContactCard (contact );
        printContact ( contact );
        getContactRaw ( id, name, surname,  age, phoneNumber, isHidden );
    }


    static void printContactCard (String contact) {
        String[] new1 = contact.split ( ";" );

        System.out.println ( "Id = " + new1[0]);
        System.out.println ( "Imię = " + new1[1]);
        System.out.println ( "Nazwisko = " + new1[2]);
        System.out.println ( "Wiek = " + new1[3]);
        System.out.println ( "Numer telefonu  = " + new1[4]);

    }

    static void printContact ( String contact ) {

        String[] new2 = contact.split ( ";" );

        System.out.printf ("| %s|  %s | %s | %s | %s", new2[0],new2[1],new2[2],new2[3],new2[4]);
    }

    private static void getContactRaw ( int id, String name, String surname, int age, String number, boolean isHidden ) {

        System.out.printf ( "\n %d ; %s ; %s ; %d ; %s",id ,name ,surname ,age ,number , isHidden);


    }
}





