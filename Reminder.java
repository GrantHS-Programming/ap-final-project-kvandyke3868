import java.util.ArrayList;

public class Reminder extends Thing {

    private String title;


    public Reminder(){

    }

    public Reminder(String title){
        super(title);
    }

    public Reminder(String title, String startTime){
        super(startTime, title);
    }
}
