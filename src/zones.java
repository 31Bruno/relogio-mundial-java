import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class zones {
        public ArrayList<DateTimeFormatter> clock = new ArrayList<>();

        public zones(){
        clock.add(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        clock.add(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a"));
        clock.add(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        clock.add(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        clock.add(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a"));
}}
