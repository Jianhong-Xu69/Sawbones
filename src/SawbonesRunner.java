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
            System.out.println(blank.CharacterInformation());
        } else {
            System.out.println(test.RollStats());
            System.out.print("What is your character's name? ");
            String name = user.nextLine();
            System.out.println("What is your character's class? \n(A) Rogue\n(B) Knight\n(C) Runemage\n(D) Monk\n");
            String classes = user.nextLine();
            String starterGear = "";
            String starterProf = "";
            String starterSkill = "";
            String choice = "";
            if (classes.equalsIgnoreCase("a"))
            {
                for (int i = 0; i < 2; i++) {
                    System.out.println("Choose a proficiency (" + (i+1) + " out of 2) from: \n(A) Axes\n(B) Bludgeons\n(C) Daggers\n(D) Crossbows\n(E) Bows\n(F) Firearms\n");
                    choice = user.nextLine();
                    if (choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b") || choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("d") || choice.equalsIgnoreCase("e") || choice.equalsIgnoreCase("f"))
                    {
                        if (starterProf.toLowerCase().contains(choice)) {
                            System.out.println("You already have that proficiency! Try again!");
                            i--;
                        } else {
                            starterProf += choice;
                        }
                    }
                    else {
                        System.out.println("Invalid input! Try Reading");
                        i--;
                    }
                }
                for (int i = 0; i < 1; i++) {
                    System.out.println("Choose between:\n(A) A Hand Axe and Tomahawk\n(B) Two Shivs\n(C) A Club, A Flintlock Pistol, and 30 Handgun Ammunition\n(D) A Hand Crossbow, 30 Hand Crossbow Bolts and a Knife\n(E) A Dirk, A Shortbow, and 30 arrows\n");
                    choice = user.nextLine();
                    if (choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b") || choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("d") || choice.equalsIgnoreCase("e") || choice.equalsIgnoreCase("f"))
                    {
                        starterGear = choice;
                    }
                    else {
                        System.out.println("Invalid input! Try Reading");
                        i--;
                    }
                }
                for (int i = 0; i < 4; i++) {
                    System.out.println("Choose a starter skill from: \n(A) Subterfuge\n(B) Stealth\n(C) Dodge\n(D) Light Weapons\n(E) Investigation\n(F) Intimidation\n(G) Archery\n(H) Persuasion\n(I) Perception");
                    choice = user.nextLine();
                    if (choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b") || choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("d") || choice.equalsIgnoreCase("e") || choice.equalsIgnoreCase("f") || choice.equalsIgnoreCase("g") || choice.equalsIgnoreCase("h")) {
                        if (starterSkill.toLowerCase().contains(choice.toLowerCase())) {
                            System.out.println("You already have that skill! Try again!");
                            i--;
                        } else {
                            starterSkill += choice;
                        }
                    } else {
                        System.out.println("Invalid input! Try Reading");
                        i--;
                    }
                }
            }
            else if (classes.equalsIgnoreCase("b"))
            {
                for (int i = 0; i < 1; i++) {
                    System.out.println("Choose a starting proficiency from: \n(A) Medium Armor\n(B) Heavy Armor\n");
                    choice = user.nextLine();
                    if (choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b"))
                    {
                        starterProf += choice;
                    }
                    else
                    {
                        System.out.println("Invalid input! Try Reading");
                        i--;
                    }
                }
                for (int i = 0; i < 2; i++) {
                    System.out.println("Choose a proficiency (" + (i+1) + " out of 2) from: \n(1) Swords\n(2) Bludgeons\n(3) Daggers\n(4) Spears\n");
                    choice = user.nextLine();
                    if (choice.equalsIgnoreCase("1") || (choice.equalsIgnoreCase("2") || (choice.equalsIgnoreCase("3") || (choice.equalsIgnoreCase("4")))))
                    {
                        if (starterProf.toLowerCase().contains(choice)) {
                            System.out.println("You already have that proficiency! Try again!");
                            i--;
                        } else {
                            starterProf += choice;
                        }
                    }
                    else
                    {
                        System.out.println("Invalid input! Try Reading");
                        i--;
                    }
                }
                for (int i = 0; i < 1; i++) {
                    System.out.println("Choose between:\n(A) Quilted Armor\n(B) Ring Mail\n(C) Lamellar\n");
                    choice = user.nextLine();
                    if (choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b") || choice.equalsIgnoreCase("c"))
                    {
                        starterGear += choice;
                    }
                    else
                    {
                        System.out.println("Invalid Input! Try Reading");
                        i--;
                    }
                }
                for (int i = 0; i < 1; i++) {
                    System.out.println("Choose between:\n(1)Heater\n(2)Kite Shield (if proficient)\n");
                    choice = user.nextLine();
                    if ((choice.equalsIgnoreCase("1") || (choice.equalsIgnoreCase("2"))))
                    {
                        starterGear += choice;
                    }
                    else
                    {
                        System.out.println("Invalid Input! Try Reading");
                        i--;
                    }
                }
                for (int i = 0; i < 2; i++) {
                    System.out.println("Choose a skill (" + (i+1) + " out of 2) from: \n(A) Light Weapons\n(B) Heavy Weapons\n(C) Medium Armor\n(D) Heavy Armor\n(E) Intimidation\n(F) Athletics\n(G) Resistance\n(H) History\n(I) Insight\n(J) Will");
                    choice = user.nextLine();
                    if (choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b") || choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("d") || choice.equalsIgnoreCase("e") || choice.equalsIgnoreCase("f") || choice.equalsIgnoreCase("g") || choice.equalsIgnoreCase("h"))
                    {
                        if (starterSkill.toLowerCase().contains(choice.toLowerCase()))
                        {
                            System.out.println("You already have that skill! Try again!");
                            i--;
                        }
                        else {
                            starterSkill += choice;
                        }
                        System.out.println("Invalid Input! Try Reading");
                        i--;
                    }
                }
            }
            else if (classes.equalsIgnoreCase("c"))
            {
                for (int i = 0; i < 2; i++) {
                    System.out.println("Choose a proficiency (" + (i+1) + " out of 2) from: \n(A) Axes\n(B) Bludgeons\n(C) Daggers\n(D) Staves\n");
                    choice = user.nextLine();
                    if (choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b") || choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("d")) {
                        if (starterProf.toLowerCase().contains(choice)) {
                            System.out.println("You already have that proficiency! Try again!");
                            i--;
                        } else {
                            starterProf += choice;
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Input! Try Reading");
                        i--;
                    }
                }
                starterGear = "";
                for (int i = 0; i < 2; i++) {
                    System.out.println("Choose a starting skill from: \n(A) Magic\n(B) Nature\n(C) Survival\n(D) Will\n(E) Insight\n(F) History\n(G) Resistance\n(H) Light Weapons\n");
                    if ((choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b") || choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("d") || choice.equalsIgnoreCase("e") || choice.equalsIgnoreCase("f") || choice.equalsIgnoreCase("g") || choice.equalsIgnoreCase("h")))
                    {
                        if (starterSkill.toLowerCase().contains(choice.toLowerCase())) {
                            starterSkill += user.nextLine();
                        }
                        else
                        {
                            System.out.println("You already have that skill! Try again!");
                            i--;
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Input! Try Reading");
                        i--;
                    }
                }
            }
            else if (classes.equalsIgnoreCase("d"))
            {
                for (int i = 0; i < 2; i++) {
                    System.out.println("Choose a proficiency (" + (i+1) + " out of 2) from: \n(A) Staves\n(B) Bludgeons\n(C) Exotic Weapons\n(D) Daggers\n(E) Bows\n(F) Spears\n");
                    choice = user.nextLine();
                    if ((choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b") || choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("d") || choice.equalsIgnoreCase("e") || choice.equalsIgnoreCase("f"))) {
                        if (starterProf.toLowerCase().contains(choice)) {
                            System.out.println("You already have that proficiency! Try again!");
                            i--;
                        } else {
                            starterProf += choice;
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Input! Try Reading");
                        i--;
                    }
                }
                for (int i = 0; i < 2; i++) {
                    System.out.println("Choose an item (" + (i+1) + " out of 2) from:\n(A) Long Stick\n(B) Hunting Bow and 20 arrows\n(C) Shortspear\n(D) Mace\n(E) Jian\n(F) Skinning Knife\n");
                    choice = user.nextLine();
                    if ((choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b") || choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("d") || choice.equalsIgnoreCase("e") || choice.equalsIgnoreCase("f"))) {
                        if (starterGear.toLowerCase().contains(choice)) {
                            System.out.println("You already have that item! Try again!");
                            i--;
                        } else {
                            starterGear += choice;
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Input! Try Reading");
                        i--;
                    }
                }
                System.out.println("Choose between: \n(1) Quilted Armor\n(2) Monk's Robes\n");
                starterGear += user.nextLine();
                for (int i = 0; i < 3; i++) {
                    System.out.println("Choose a starter skills from: \n(A) Light Weapons\n(B) Speed\n(C) Magic\n(D) Athletics\n(E) Resistance\n(F) History\n(G) Archery\n(H) Stealth\n(I) Will\n");
                    starterSkill += user.nextLine();
                }
            }
            System.out.print("What is your character's race? \n(A) Human\n(B) Halfling\n(C) Skeleton\n(D) Ghoul\n(E) Elharithlaan\n(F) Analaan\n(G) Entaari\n(H) Stonepeak\n(I) Ironskin\n(J) Windhammer\n(K) Nishiryu\n(L) Khanak\n(M) Paka'mtu");
            String race = user.nextLine();
            int asi1 = 0;
            int asi2 = 0;
            if (race.equalsIgnoreCase("a"))
            {
                System.out.println("Choose a stat to increase by 1:\n(1)Strength\n(2)Agility\n(3)Endurance\n(4)Intellect\n(5)Wisdom\n(6)Charisma\n");
                asi1 = user.nextInt();
                System.out.println("Choose a stat to increase by 1:\n(1)Strength\n(2)Agility\n(3)Endurance\n(4)Intellect\n(5)Wisdom\n(6)Charisma\n");
                asi2 = user.nextInt();
            }
            System.out.print("What level is your character? ");
            int level = user.nextInt();
            SawbonesCharacter adventurer = new SawbonesCharacter(name, classes, race, level, starterProf, starterGear, starterSkill);
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
            if (race.equalsIgnoreCase("human")) {
                System.out.println(adventurer.ChangeStats(asi1, 1));
                System.out.println(adventurer.ChangeStats(asi2, 1));
            }
            adventurer.RollHealthStamina();
            System.out.println(adventurer.CharacterInformation());
        }
    }
}
