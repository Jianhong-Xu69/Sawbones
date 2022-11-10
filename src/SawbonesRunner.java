import java.util.Scanner;
public class SawbonesRunner {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        SawbonesDice test = new SawbonesDice();
        System.out.print("What is your character's name? ");
        String name = user.nextLine();
        System.out.print("What is your character's class? ");
        String classes = user.nextLine();
        System.out.print("What is your character's specialisation? ");
        String special = user.nextLine();
        System.out.print("What is your character's race? ");
        String race = user.nextLine();
        System.out.print("What level is your character? ");
        int level = user.nextInt();
        SawbonesCharacter adventurer = new SawbonesCharacter(name, classes, special, race, level);
        System.out.println(test.RollDice(2,6,8, -4));
        System.out.print("Input your Strength stat: ");
        adventurer.ChangeStats(1, user.nextInt());
        System.out.print("Input your Agility stat: ");
        adventurer.ChangeStats(2, user.nextInt());
        System.out.print("Input your Endurance stat: ");
        adventurer.ChangeStats(3, user.nextInt());
        System.out.print("Input your Intellect stat: ");
        adventurer.ChangeStats(4, user.nextInt());
        System.out.print("Input your Wisdom stat: ");
        adventurer.ChangeStats(5, user.nextInt());
        System.out.print("Input your Charisma stat: ");
        adventurer.ChangeStats(6, user.nextInt());
        System.out.println(adventurer.CharacterInformation());
    }
}
