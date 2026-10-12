import java.util.Scanner;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class horario {
    Scanner input = new Scanner(System.in);
    locationmanager locationmanager = new locationmanager();
    zones zones = new zones();

   public void whiled(){
    while (true){
        String a2 = input.nextLine();
        try {
            int number1 = Integer.parseInt(a2);

            if (number1 >= 1 && number1 <= 10) {

                if (number1 == 1) {
                    ZonedDateTime ASao = ZonedDateTime.now(ZoneId.of("America/São Paulo"));
                    System.out.println(ASao.format(zones.clock.get(0)));
                } else if (number1 == 2) {
                    ZonedDateTime newyork = ZonedDateTime.now(ZoneId.of("America/New_York"));
                    System.out.println(newyork.format(zones.clock.get(1)));

                } else if (number1 == 3) {
                    ZonedDateTime LA = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
                    System.out.println(LA.format(zones.clock.get(1)));

                } else if (number1 == 4) {
                    ZonedDateTime tr = ZonedDateTime.now(ZoneId.of("America/Toronto"));
                    System.out.println(tr.format(zones.clock.get(1)));

                } else if (number1 == 5) {
                    ZonedDateTime Lo = ZonedDateTime.now(ZoneId.of("Europe/London"));
                    System.out.println(Lo.format(zones.clock.get(0)));

                } else if (number1 == 6) {
                    ZonedDateTime PA = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
                    System.out.println(PA.format(zones.clock.get(0)));

                } else if (number1 == 7) {
                    ZonedDateTime TO = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
                    System.out.println(TO.format(zones.clock.get(2)));

                } else if (number1 == 8) {
                    ZonedDateTime Shan = ZonedDateTime.now(ZoneId.of("Asia/Shangai"));
                    System.out.println(Shan.format(zones.clock.get(2)));

                } else if (number1 == 9) {
                    ZonedDateTime KO = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
                    System.out.println(KO.format(zones.clock.get(3)));

                } else if (number1 == 10) {
                    ZonedDateTime AU = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
                    System.out.println(AU.format(zones.clock.get(4)));
                }
                    break;
                } else {
                locationmanager.showLocations();
                System.out.println("You can only choose a number from 1 to 10.");
                System.out.println("Which location you wanna know: ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid number.");
    }
}
}
}
