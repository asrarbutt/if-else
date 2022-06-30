public class Main {
    public static void main(String[] args) {

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


}
