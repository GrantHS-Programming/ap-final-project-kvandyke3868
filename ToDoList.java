import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    //reminder
    //event
    //taskList

    ArrayList<Reminder> reminderList = new ArrayList<>();
    ArrayList<Event> eventList = new ArrayList<>();
    Scanner myScanner = new Scanner(System.in);
    JFrame frame = new JFrame("To Do");
    JButton button = new JButton("button");
    String ogResponse = "";

    public static void main(String[] args) {
        new ToDoList();
    }
    public ToDoList(){
        //frame.setLayout(new BorderLayout());
        //frame.setSize(800,800);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Container resetContainer = new Container();

        //button.addActionListener(this);
        //resetContainer.add(button);


        menu();

    }

    public void menu(){
        System.out.println("What would you like to do (keywords add, remove, delete, reminder, event, calender)");
        ogResponse = myScanner.nextLine();
        if (ogResponse.contains("remind")){
            reminder();
        }
        if (ogResponse.contains("event")){
            event();
        }

        if (ogResponse.contains("calender") || ogResponse.contains("schedule")){
            for (int i = 0; i < reminderList.size(); i++) {
                System.out.println("Reminder for " + reminderList.get(i).getStartTime() + " at " + reminderList.get(i).getStartTime());
            }
        }
        System.out.println(ogResponse);
        menu();


    }

    public void reminder() {
        if (ogResponse.contains("remove") || ogResponse.contains("delete")){
            System.out.println("Which reminder would you like to remove ");
            for (Reminder reminder : reminderList) {
                System.out.println("Reminder for " + reminder.getTitle() + " at " + reminderList.get(0).getStartTime());
            }

            int remove = myScanner.nextInt() + 1;
            System.out.println("Removed the reminder, " + reminderList.remove(remove).getTitle());
        }

        else{
            System.out.println("Title: ");
            String title = myScanner.nextLine();
            if (!title.isEmpty()) {
                System.out.println("Time: ");
                String time = myScanner.nextLine();
                if (!time.isEmpty()) {
                    reminderList.add(new Reminder(time, title));
                } else {
                    reminderList.add(new Reminder(title));
                }
            }
            else {
                reminderList.add(new Reminder());
            }

            System.out.println("Reminder set for " + reminderList.get(reminderList.size()-1).getTitle() + " at " + reminderList.get(reminderList.size()-1).getStartTime());
        }
        menu();
    }

    public void event(){
        if (ogResponse.contains("remove") || ogResponse.contains("delete")){
            System.out.println("Which event would you like to remove ");
            //print event list

            //System.out.println("Removed the event, " + reminderList.remove(remove).getTitle());
        }

        else{
            System.out.println("Title: ");
            String title = myScanner.nextLine();
            if (!title.isEmpty()) {
                System.out.println("Start Time: ");
                String startTime = myScanner.nextLine();
                if (!startTime.isEmpty()){
                    System.out.println("End Time: ");
                    String endTime = myScanner.nextLine();
                    if (!endTime.isEmpty()) {
                        eventList.add(new Event(startTime, title));
                    }
                }
                else{
                    eventList.add(new Event(title));
                }
            }
            else{
                eventList.add(new Event());

            }
            System.out.println("Event set for " + " ");
        }
        menu();
    }




}

