public class Main {
    public static void main(String[] args) {

        System.out.println(fakultaetwhile(3));

    }

    public static String alarm(int number){

        if (number > 30){

            return "Zu viele Personen";

        }else if (number==30){
            return "Maximale Anzahl Personen erreicht!";
        }else{
            return "Maximale Personenzahl nicht überschritten";
        }


    }

    public static int alarmLevel(String i){

        switch (i){
            case "rot":
                return 0;
            case "gelb":
                return 30;

            case "grün":
                return 60;

            default:
                return 0;
        }
    }

    public static String alarmLevel2(int input, String alarmLevelToDay){

        switch (alarmLevelToDay){
            case "rot":
                return "keine Personen erlaubt";
            case "gelb":
                return "max 30 Personen erlaubt";
            case "grün":
                return "max 60 personen erlaubt";


            default:
                return "das ist keine Farbe";

        }



    }

    public static int fakultaet(int i){
        int result=1;



        for (int x=1; x<=i; x++){
            result = result * x;
            System.out.println( "die Fakultät von: " + x +"  ---->  "+result);
        }

        return result;
    }


    public static int fakultaetwhile(int zahl){

        int count=zahl;
        System.out.println(count +"count");
        int result=1;
        while (count==zahl){
            System.out.println("count in der while schleife " + count);

            for (int x=1; x<=zahl; x++){
                result = result * x;


            }

            count++;

        }
        return result;


    }


}
