public class Thing {

    private String startTime;
    private String endTime;
    private String title;

    public Thing(){
        startTime = "all day";
        title = "n/a";

    }
    public Thing(String title){
        startTime = "all day";
        this.title = title;

    }

    public Thing(String title, String startTime){
        this.startTime = startTime;
        this.title = title;
    }
    public Thing(String title, String endTime, String startTime){
        this.startTime = startTime;
        this.endTime = endTime;
        this.title = title;

    }

    public String getTitle(){
        return title;
    }

    public String getStartTime(){
        return startTime;
    }
    public String getEndTime(){
        return endTime;
    }


}
