import java.util.ArrayList;

public class Reminder extends Thing {


    public Reminder() {

    }

    public Reminder(String title) {
        super(title);
    }

    public Reminder(String title, String startTime) {
        super(startTime, title);
    }
}

