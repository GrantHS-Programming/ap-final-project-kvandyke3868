public class Thing {

    private String startTime;
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


}
