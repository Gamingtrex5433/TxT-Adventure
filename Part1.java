import java.util.Scanner;
public class Part1{
    public Part1(){
        Scanner nick = new Scanner(System.in);
        Scanner item = new Scanner(System.in);
        Scanner fight = new Scanner(System.in);
        Scanner elder = new Scanner(System.in);
        Scanner elderFight = new Scanner(System.in);
        Scanner chilli = new Scanner(System.in);
        Scanner goblinFight1 = new Scanner(System.in);
        Scanner goblinFight2 = new Scanner(System.in);
        Scanner goblinGroupFight = new Scanner(System.in);
        int damage = 0;
        int dummy = 20;
        int health = 30;
        int goblin = 40;
        System.out.println("Welcome Hero to Kings Rising!"); // backround info for story
        System.out.println(".");
        System.out.println("You are in the village of Radel, located in the Kingdom of Errasel.");
        System.out.println(".");
        System.out.println("The Goblin King has besieged us, you must help us!");
        System.out.println(".");
        System.out.println("Travel to the camp and wipe them out!");
        System.out.println(".");
        System.out.println("But first, What is your name Hero?");
        String name = nick.nextLine(); // asks for name
        System.out.println(".");
        System.out.println("Hello " + name);
        System.out.println(".");
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
        System.out.println(".");
        System.out.println("Now that you have a " + weapon + " now you can go practice on this dummy!");
        System.out.println(".");
        System.out.println(".");
        System.out.println("*you approach the dummy*");
        System.out.println(".");
        System.out.println("Do you attack or flee?");
        String attack = fight.nextLine();
        if (attack.equals("attack")) {
          System.out.println(".");
          System.out.println("You Swung at the Dummy and dealt " + damage + " !");
          dummy -= damage;
          System.out.println(".");
          System.out.println("The Dummy has " + dummy + " health left!");
          System.out.println(".");
          System.out.println("Do you attack or flee?");
          String attack2 = fight.nextLine();
          if(attack2.equals("attack")) {
                  System.out.println(".");
                  System.out.println("You Swung at the Dummy and dealt " + damage + " !");
                  dummy -= damage;
                  System.out.println(".");
                  System.out.println("The Dummy has " + dummy + " health left!");
                  System.out.println(".");
                  System.out.println("You defeated the Dummy!");
                  System.out.println(".");
          }
          else{
                health += 0;
                System.out.println(".");
                System.out.println("You fled the battle unscathed!");
          }
        }
        else{
            System.out.println(".");
            System.out.println("You fled the battle unscathed!");
            System.out.println(".");
            health += 0;
        }
        System.out.println("*You are approached by the village elder*");
        System.out.println(".");
        System.out.println("Oh " + name + " I saw you practicing over there and wanted to ask, will you help us fight the Goblin King?");
        System.out.println(".");
        String villageElder = elder.nextLine();
        if (villageElder.equals("yes")){
            System.out.println("Oh thank you hero!!!");
            System.out.println(".");
        }
        else{
            System.out.println("You son of a *****");
            System.out.println(".");
            System.out.println("*You enter into a figth with the elder!!!*");
            System.out.println(".");
            System.out.println("*He is super buff and strong you noob!!!*");
            System.out.println(".");
            System.out.println("Do you attack or flee?");
            String eldFight = elderFight.nextLine();
            if(eldFight.equals("attack")){
                System.out.println("The elder one shot you!!!");
                health -= 30;
                System.out.println("You are dead");
                //figure out how to do end game iteration
            }
            else{
                System.out.println("The elder one shot you!!!");
                health -= 30;
                System.out.println("You are dead");
                //figure out how to do end game iteration
            }
        }
        System.out.println("*After saying good byes and practicing some more, you are finally ready to set off on your journey*");
        System.out.println(".");
        System.out.println("*As you leave you wave goodbyes to the villagers and start down the road of adventure*");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("*As you journey, you come across a Chilli Cheese Dog Stand???*");
        System.out.println(".");
        System.out.println("*Do you wish to enter?*");
        String chilliCheese = chilli.nextLine();
        if (chilliCheese.equals("yes")){
            System.out.println("You got a Chilli Cheese Dog!");
            health += 2;
        }
        else{
            System.out.println("You might regret this...");
        }
        System.out.println("*You continue down the road*");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("After some time, you come across a watchtower, manned by a GOBLIN, as you approach, it drops down and loosk ready to attack");
        System.out.println(".");
        System.out.println("You enter a fight with the goblin!");
        System.out.println(".");
        System.out.println("Do you wan to attack or flee?");
        String goblinFight1Attack = goblinFight1.nextLine();
        if (goblinFight1Attack.equals("attack")){
            System.out.println("You hit the Goblin for " + damage + " and he hit you for 4 hit points!");
            goblin -= damage;
            health -= 4;
            System.out.println(".");
            System.out.println("The goblin is at " + goblin + " Health, Do you want to attack or flee?");
            String goblinFight1Attack2 = goblinFight1.nextLine();
            if(goblinFight1Attack2.equals("attack")){
                System.out.println("You hit the Goblin for " + damage + " and he hit you for 6 hit points!");
                goblin -= damage;
                health -= 6;
                System.out.println(".");
                System.out.println("The goblin is at " + goblin + " Health, Do you want to attack or flee?");
                String goblinFight1Attack3 = goblinFight1.nextLine();
                if(goblinFight1Attack2.equals("attack")){
                    System.out.println("You hit the Goblin for " + damage + " and he hit you for 5 hit points!");
                    goblin -= damage;
                    health -= 6;
                    System.out.println(".");
                    System.out.println("You killed the goblin!!! Nice!!!");
                    System.out.println("You won with " + health + " health remaining");
                }
                else{
                    System.out.println("You escaped the battle with your pride hurt and at " + health + " health remaining");
                    System.out.println(".");
                }
            }
            else{
                System.out.println("You escaped the battle with your pride hurt and at " + health + " health remaining");
                System.out.println(".");
            }
        }
        else{
            System.out.println("You escaped the battle with your pride hurt and at " + health + " health remaining");
            System.out.println(".");
            }
        }
    public static void main(String [] args){
        Part1 player = new Part1();
    }
}