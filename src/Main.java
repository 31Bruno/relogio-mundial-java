//libraries
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

//Main
public class Main{
    void main(){
        Scanner input = new Scanner(System.in);
        locationmanager locations = new locationmanager();
        horario horario = new horario();

        //Read System
        System.out.println("********** Hello! I'm your personal time and location assistant. **********");
        System.out.println("********** Do you want to know the time in your location or in another country? **********");
        System.out.println("********** Type 1 or 2 to make your choice: **********");
        System.out.println("********** 1. Check the current time in my location **********");
        System.out.println("********** 2. Check the current time in another country **********");
        String a1 = input.nextLine();

//Choice System
        if(a1.equals("1")){
            Locale localAtual = Locale.getDefault();
            System.out.println(localAtual.getDisplayCountry());
            ZonedDateTime now = ZonedDateTime.now();
            DateTimeFormatter format2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(localAtual);
            System.out.println(now.format(format2));
        }
        else if (a1.equals("2")) {
            locations.showLocations();
            System.out.println("Which location you wanna know: ");

            horario.whiled();

            }else{
            System.out.println("We just accept number 1 or 2 here. Don't type any words or other numbers...");


        }
    }
}