import java.util.ArrayList;
import java.util.Scanner;

public class TaskInput {

    static ArrayList<String> setUp(){
        ArrayList listName = new ArrayList<>();
        System.out.println("success");
        return listName;
    }




    static void addTask(ArrayList<String> list){
        //initial prompt to add items to list
        Scanner scanner = new Scanner(System.in);  
        String input = "default";
        System.out.println("Input your task(s), enter 0 when done.");
            //add items to list until user exits
            while(!(input.equals("0"))){
                input = scanner.nextLine();
                list.add(input);
                System.out.println(list);
                System.out.println("Enter another task or enter 0 to exit.");
            }
            scanner.close();
    }


    public static void main(String[] args) {


        //Scanner scanner = new Scanner(System.in);  


        ArrayList<String> todo = setUp();
        addTask(todo);

        // ArrayList<String> todo1 = new ArrayList<String>();

        // todo1.add("hi");
        // todo1.add("hiiiiiiii");
        // todo1.add("hiiiiiiiiiiiiiii");

        // System.out.println(todo1);
    
        // addTask(todo1);

    
        // Print a test output statement
        //System.out.println("This is a test output statement.");

        // Create a Scanner object to read input
        
        // Ask for the user's name
        //System.out.print("Please enter your name: ");

        // Read the user's name
        //String name = scanner.nextLine();

        // Print the received name
        //System.out.println("Hello, " + name + "!");

        //addTask();


        // Close the scanner
        //scanner.close();
    }
}
