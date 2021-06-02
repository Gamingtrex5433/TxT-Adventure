
import java.util.Scanner;
public class Title
{
    public Title(){
        Scanner option = new Scanner(System.in);
        System.out.println("Welcome to King's Rising");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("What would you like to do?");
        System.out.println("Start");
        System.out.println("Rules");
        System.out.println("Exit");
        String choice = option.nextLine();
        choice = choice.toLowerCase();
        if(choice.equals("start")){
            System.out.println("Your adventure begins...");
            Gameplay player = new Gameplay();
        } else if(choice.equals("rules")){
            System.out.println("When it comes to adventure, the only rule is to follow your instincts...");
            Title run = new Title();
        } else if(choice.equals("exit")){
            System.out.println("Game Over");
            //game over
        } else {
            Title run2 = new Title();
        }
        
    
    
    }
    
    public static void main(String[] args)
    {
        Title runner = new Title();
    }
    
}
