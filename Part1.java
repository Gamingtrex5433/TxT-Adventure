import java.util.Scanner;
public class Part1{
    public Part1(){
        Scanner nick = new Scanner(System.in);
        Scanner item = new Scanner(System.in);
        System.out.println("Welcome Hero to Kings Rising!"); // backround info for story
        System.out.println("You are in the village of Radel, located in the Kingdom of Errasel.");
        System.out.println("The Goblin King has besieged us, you must help us!");
        System.out.println("Travel to the camp and wipe them out!");
        System.out.println("But first, What is your name Hero?");
        String name = nick.nextLine(); // asks for name
        System.out.println("Hello " + name);
        System.out.println("So " + name + " do you want a sword or an axe?");
        String weapon = item.nextLine();
        if (input.equalsIgnoreCase("Sword")) {
          System.out.println("Your weapon is a " + weapon);
        }
        else{
            System.out.println("Your weapon is a " + weapon);
        }
    }
    public static void main(String [] args){
        Part1 player = new Part1();
    }
}
