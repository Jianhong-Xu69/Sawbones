import java.util.Scanner;

public class SawbonesRunner {
    public static void main(String[] args) {
        System.out.println("This character creator is built for Sawbones 1e, NOT D&D 5e");
        System.out.println("This is not meant to be a replacement to a character sheet");
        System.out.println("This was made because creating a character takes a hilarious amount of time");
        Scanner user = new Scanner(System.in);
        SawbonesDice test = new SawbonesDice();
        System.out.println("Do you want to create a blank character sheet?");
        if (user.nextLine().equalsIgnoreCase("yes")) {
            SawbonesCharacter blank = new SawbonesCharacter();
        } else {
            System.out.print("What is your character's name? ");
            String name = user.nextLine();
            System.out.print("What is your character's class? ");
            String classes = user.nextLine();
            System.out.print("What is your character's race? ");
            String race = user.nextLine();
            System.out.print("What level is your character? ");
            int level = user.nextInt();
            SawbonesCharacter adventurer = new SawbonesCharacter(name, classes, race, level);
            System.out.println(test.RollStats());
            System.out.print("Input your Strength stat: ");
            System.out.println(adventurer.ChangeStats(1, user.nextInt()));
            System.out.print("Input your Agility stat: ");
            System.out.println(adventurer.ChangeStats(2, user.nextInt()));
            System.out.print("Input your Endurance stat: ");
            System.out.println(adventurer.ChangeStats(3, user.nextInt()));
            System.out.print("Input your Intellect stat: ");
            System.out.println(adventurer.ChangeStats(4, user.nextInt()));
            System.out.print("Input your Wisdom stat: ");
            System.out.println(adventurer.ChangeStats(5, user.nextInt()));
            System.out.print("Input your Charisma stat: ");
            System.out.println(adventurer.ChangeStats(6, user.nextInt()));
            adventurer.RollHealthStamina();
            System.out.println(adventurer.CharacterInformation());
        }
    }
}
