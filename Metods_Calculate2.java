public class Metods_Calculate2 {
    public static void main ( String[] args ) {

        int a = 33;
        int b =34;
        int c= 60;


        calculateAverageAge ( a,b,c );
        calculateAverageAge2 (a,b,c);
        calculateAverageAge3(a,b,c);
        calculateAverageAge4(a,b,c);

    }

    static void calculateAverageAge ( int a, int b, int c ) {
        int d = a+b+c;
        int e = d/3;
        System.out.println (e);

    }

    static void calculateAverageAge2 ( int a, int b, int c){
        int d = a+b+c;
        float e = d/3;
        System.out.println (e);

    }


     static void calculateAverageAge3 ( float a1, float a2, float a3) {
       float d = (a1+a2+a3)/3;

       int   e =  Math.round (d);
        System.out.println (e);

    }


    static void calculateAverageAge4 ( float a1, float a2, float a3) {
        float d = (a1+a2+a3)/3;

        float  e =  Math.round (d);
        System.out.println (e);
    }
}





