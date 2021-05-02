public enum NumberType {
    HOME ( "Domowy" ),
    MOBI ( "Komórkowy" ),
    WORK ( "Służbowy" ),
    ADD ("PRIV, MOBI, WORK");

    private String name;



    NumberType ( String name ) {
        this.name = name;
    }

    public String getName () {

        return name;

    }


}

