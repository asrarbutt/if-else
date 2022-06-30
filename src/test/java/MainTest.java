import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {


    @Test
    void alarm31(){

        //given
        int number=31;


        //when
        String result= Main.alarm(number);
        String expected="Zu viele Personen";
        String expected2="Maximale Personenzahl nicht überschritten";


        //then
        Assertions.assertEquals(expected, result);


    }


    @Test
    void alarm29(){

        //given
        int number=29;


        //when
        String result= Main.alarm(number);
        String expected="Maximale Personenzahl nicht überschritten";


        //then
        Assertions.assertEquals(expected, result);


    }

    @Test
    void alarm30(){

        //given
        int number=30;


        //when
        String result= Main.alarm(number);
        String expected="Maximale Anzahl Personen erreicht!";



        //then
        Assertions.assertEquals(expected, result);


    }


    @Test
    void alarmRed(){
        //given
        String farbe="rot";

        //when
        int result=Main.alarmLevel(farbe);
        int expected=0;

        Assertions.assertEquals(expected, result);
    }
    @Test
    void alarmYellow(){
        //given
        String farbe="gelb";

        //when
        int result=Main.alarmLevel(farbe);
        int expected=30;

        Assertions.assertEquals(expected, result);
    }

    @Test
    void alarmGreen(){
        //given
        String farbe="grün";

        //when
        int result=Main.alarmLevel(farbe);
        int expected=60;

        Assertions.assertEquals(expected, result);
    }



}
