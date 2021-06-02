import java.util.Scanner;
public class Part1{
    public static void main(String [] args){
        Scanner nick = new Scanner(System.in);
        System.out.println("Welcome Hero to Kings Rising!"); // backround info for story
        System.out.println("You are in the village of Radel, located in the Kingdom of Errasel.");
        System.out.println("The Goblin King has besieged us, you must help us!");
        System.out.println("Travel to the camp and wipe them out!");
        System.out.println("But first, What is your name Hero?");
        String name = nick.nextLine(); // asks for name
        System.out.println("Hello " + name);
    }
}
