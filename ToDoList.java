import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    //reminder
    //event
    //taskList

    //Arraylist<Integer> reminderList = new ArrayList<>();
    Scanner myScanner = new Scanner(System.in);
    JFrame frame = new JFrame("To Do");
    JButton button = new JButton("button");

    public static void main(String[] args) {
        new ToDoList();
    }
    public ToDoList(){
        frame.setLayout(new BorderLayout());
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container resetContainer = new Container();

        button.addActionListener(this);
        resetContainer.add(button);


        menu();

    }

    public void menu(){
        System.out.println("What would you like to do (keywords add, remove, delete, move, reminder, event)");
        String response = myScanner.next().toLowerCase();


        if (response.contains("reminder") || response.contains("remind")){
            System.out.println("Title: ");
            String title = myScanner.nextLine();
            if ()
            if (!title.isEmpty()){
                System.out.println("Time: ");
                String time = myScanner.nextLine();
                if (!time.isEmpty()){
                    Reminder x = new Reminder(time, title);
                }
                else {
                    Reminder x = new Reminder(title);
                }
            }
            else {
                Reminder x = new Reminder();
            }

        }



    }



}

