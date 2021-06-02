import java.util.Scanner;
public class Part1{
    public Part1(){
        Scanner nick = new Scanner(System.in);
        Scanner item = new Scanner(System.in);
        Scanner fight = new Scanner(System.in);
        int damage = 0;
        int dummy = 20;
        int health = 30;
        System.out.println("Welcome Hero to Kings Rising!"); // backround info for story
        System.out.println("You are in the village of Radel, located in the Kingdom of Errasel.");
        System.out.println("The Goblin King has besieged us, you must help us!");
        System.out.println("Travel to the camp and wipe them out!");
        System.out.println("But first, What is your name Hero?");
        String name = nick.nextLine(); // asks for name
        System.out.println("Hello " + name);
        System.out.println("So " + name + " do you want a sword or an axe?");
        String weapon = item.nextLine();
        weapon = weapon.toLowerCase();
       if (weapon.equals("sword")) {
          System.out.println("Your weapon is a " + weapon);
          damage += 15;
        }
       else {
            System.out.println("You weapon is a " + weapon);
            damage += 12;
        }
        System.out.println("Now that you have a " + weapon + " now you can go practice on this dummy!");
        System.out.println("*you approach the dummy*");
        System.out.println("Do you attack or flee?");
        String attack = fight.nextLine();
       if (attack.equals("attack")) {
          System.out.println("You Swung at the Dummy and dealt " + damage + " !");
          dummy -= damage;
          System.out.println("The Dummy has " + dummy + " health left!");
          System.out.println("Do you attack or flee?");
          String attack2 = fight.nextLine();
          if(attack2.equals("attack")) {
                  System.out.println("You Swung at the Dummy and dealt " + damage + " !");
                  dummy -= damage;
                  System.out.println("The Dummy has " + dummy + " health left!");
                  System.out.println("You defeated the Dummy!");
          }
          else{
                health += 0;
                System.out.println("You fled the battle unscathed!");
          }
       }
       else{
            System.out.println("You fled the battle unscathed!");
            health += 0;
       }
       
    }
    public static void main(String [] args){
        Part1 player = new Part1();
    }
}
