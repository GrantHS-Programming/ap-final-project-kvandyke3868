public class Event extends Thing{

    public Event() {
    }

    public Event(String title) {
        super(title);
    }

    public Event(String title, String startTime) {
        super(startTime, title);
    }
    public Event(String title, String startTime, String endTime) {
        super(startTime, endTime, title);

    }





}
