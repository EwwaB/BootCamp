import org.w3c.dom.ls.LSOutput;

public class PhoneBook {
    public static void main ( String[] args ) {

        int id = 1;
        String name = "Ewa";
        String surname = "Bańkowska";
        String phoneNumber = "509376914";
        int age = 20;
        String contact = "1;Ewa;Bańkowska;20;1509376914";
        boolean isHidden = false;

       printContactCard ( id, name, surname, age, phoneNumber );
       printContact ( id, name, surname, phoneNumber, age );
      getContact ( id, name, surname, age, phoneNumber );


        printContactCard ( contact );
        getContactRaw ( id, name, surname, age, phoneNumber, isHidden );
    }

    private static void getContactRaw () {
    }

    static void printContactCard ( int id, String name, String surname, int age, String phoneNumber ) {
        System.out.println ( "id = " + id );
        System.out.println ( "Imię = " + name );
        System.out.println ( "Nazwisko = " + surname );
        System.out.println ( "Numer telefonu = " + phoneNumber );
    }
    static void printContact ( int id, String name, String surname, String phoneNumber, int age ) {
        System.out.println ( id + " |" + name + " |" + surname + " |" + " " + phoneNumber + " |" + age );
    }
    static String getContact ( int id, String name, String surname, int age, String phoneNumber ) {
        return id + " " + name + " |" + surname + " |" + " " + age + " " + phoneNumber;
    }
    static void printContactCard ( String contact ) {

         String  [] nowa = contact.split(";"); {


        }
        System.out.println ( nowa);

    }
    private static void getContactRaw ( int id, String name, String surname, int age, String phoneNumber, boolean isHidden ) {


    }
    }




