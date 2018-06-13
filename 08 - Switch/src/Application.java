import java.util.Scanner;
 
public class Application {
 
    
	public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        System.out.println("Please enter a command: ");
        String text = input.nextLine();
 
        switch (text) {
        case "start":
            System.out.println("Case started!");
            break;
 
        case "stop":
            System.out.println("Case stopped.");
            break;
 
        default:
            System.out.println("Command not defined");
        }
         
         
    }
 
}