import java.util.ArrayList;

public class locationmanager {

    private ArrayList<String> countrys = new ArrayList<>();
    public locationmanager(){
        countrys.add("America/São_Paulo");
        countrys.add("America/New_York");
        countrys.add("America/Los_Angeles");
        countrys.add("America/Toronto");
        countrys.add("Europe/London");
        countrys.add("Europe/Paris");
        countrys.add("Asia/Tokyo");
        countrys.add("Asia/Shanghai");
        countrys.add("Asia/Kolkata");
        countrys.add("Australia/Sydney");
}
    public void showLocations(){
        for(int i = 0; i < countrys.size(); i++)
        System.out.println((i+1) + " - " + countrys.get(i));
    }
}