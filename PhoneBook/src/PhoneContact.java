
public class PhoneContact {

    private int id;
    private String name;
    private String surname;
    private String phoneNumber;
    private int age;
    private boolean isHidden;


    public PhoneContact ( String name, String surname, String phoneNumber, int age ) {


        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.isHidden = isHidden;

        if (this.surname.isEmpty ( ) || this.name.isEmpty ( )) {
            this.surname = "NIEZNANE";
            this.name = "NIEZNANE";
        }
        if (this.phoneNumber.length ( ) > 9 || this.phoneNumber.length ( ) < 9) {
            this.phoneNumber = "000000000";
        }
    }

    public String getName () {
        return name;

    }

    public String getSurname () {
        return surname;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public int getAge () {
        return age;
    }

    public void setName ( String newName ) {
        this.name = newName;
    }

    public void setSurname ( String newSurname ) {
        this.surname = newSurname;
    }

    public void setPhoneNumber ( String newPhoneNumber ) {
        this.phoneNumber = newPhoneNumber;
    }

    public void setAge ( int newAge ) {
        this.age = newAge;
    }

    public void setHidden ( boolean newisHidden ) {
        this.isHidden = newisHidden;
    }


}




