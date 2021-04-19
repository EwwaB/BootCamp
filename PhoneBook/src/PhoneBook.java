public class PhoneBook {
    public static void main ( String[] args ) {

        int id = 1;
        String name = "Ewa";
        String surname = "Bańkowska";
        String phoneNumber = "509376914";
        int age = 20;
        String contact = "";
        boolean isHidden = false;

        printContactCard ( id, name, surname, age, phoneNumber );
        printContactCard ( id, name, surname, age, phoneNumber );
        printContact ( id, name, surname, phoneNumber, age );
        getContact ( id, name, surname, age, phoneNumber );


    }

    static void printContactCard ( int id, String name, String surname, int age, String phoneNumber ) {
        System.out.println ( "id = " + id );
        System.out.println ( "Imię = " + name );
        System.out.println ( "Nazwisko = " + surname);
        System.out.println ("Numer telefonu = " + phoneNumber);
    }

    static void printContact ( int id, String name, String surname, String phoneNumber, int age ) {
        System.out.println ( id + " |" + name + " |" + surname + " |" + " " + phoneNumber + " |" + age );
    }

    static String getContact ( int id, String name, String surname, int age, String phoneNumber ) {
        return id + " " + name + " " + surname + " " + " " + age + " " + phoneNumber;
    }
}
