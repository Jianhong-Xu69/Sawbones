public class SawbonesCharacter {
    private String name = "";
    private String classes = "";
    private String specialisation = "";
    private String race = "";
    private String features = "";
    private String inventory = "";
    private String proficiencies = "";
    private String skills = "";
    private int level = 0;
    private int hitPoints = 0;
    private int stamina = 0;
    private int strength = 0;
    private int agility = 0;
    private int endurance = 0;
    private int intellect = 0;
    private int wisdom = 0;
    private int charisma = 0;

    SawbonesDice roller = new SawbonesDice();
    public SawbonesCharacter()
    {
        name = "nameless";
        classes = "none";
        race = "human";
        level = 1;
    }
    public SawbonesCharacter(String name, String classes, String race, int level)
    {
        this.name = name;
        this.level = level;
        if (classes.equalsIgnoreCase("rogue"))
        {
            RogueSetup();
        }
    }

    public String ChangeStats(int stat, int number)
    {
        if (stat == 1)
        {
            strength += number;
            return "Strength is now set to " + strength;
        }
        else if (stat == 2)
        {
            agility += number;
            return "Dexterity is now set to " + agility;
        }
        else if (stat == 3)
        {
            endurance += number;
            return "Constitution is now set to " + endurance;
        }
        else if (stat == 4)
        {
            intellect += number;
            return "Intelligence is now set to " + intellect;
        }
        else if (stat == 5)
        {
            wisdom += number;
            return "Wisdom is now set to " + wisdom;
        }
        else if (stat == 6)
        {
            charisma += number;
            return "Charisma is now set to " + charisma;
        }
        else
        {
            return "That isn't a valid stat!";
        }
    }
    public void RogueSetup()//DONE (?)
    {
        classes = "Rogue";
        features = "Gang Up\nBanditry";
        proficiencies = "Light Armour\nTwo from Axes, Bludgeons, Daggers, Crossbows, Bows, and Firearms.\n";
        inventory = "Choose between:\n(A) A Hand Axe and Tomahawk\n(B) Two Shivs\n(C) A Club, A Flintlock Pistol, and 30 Handgun Ammunition\n(D) A Hand Crossbow, 30 Hand Crossbow Bolts and a Knife\n(E) A Dirk, A Shortbow, and 30 arrows\nOne set of hide armor, a bag of tricks, three day's worth of provisions, twenty lock picks, a hood, and a mask or cloth scarf. ";
        skills = "Choose four from: Subterfuge\nStealth\nDodge\nLight Weapons\nInvestigation\nIntimidation\nArchery\nPersuasion\nPerception\nIncrease them by 3";
    }
    public void RollHealthStamina()//NOT DONE NEED OTHER 3 CLASSES
    {
        if (classes.equalsIgnoreCase("rogue"))
        {
            for (int i = 1; i < level; i++)
            {
                hitPoints += Integer.parseInt(roller.RollDice(1,1,6, (endurance/2)));
            }
        }
        if (classes.equalsIgnoreCase("knight"))
        {
            for (int i = 1; i < level; i++)
            {
                hitPoints += Integer.parseInt(roller.RollDice(1,1,6, (endurance/2)));
            }
        }
        if (endurance > 0)
        {
            stamina = 3 + endurance;
        }
        else
        {
            stamina = 3;
        }
    }
    public String CharacterInformation()
    {
        return "\n" + name + "\n" + classes + "\n" + specialisation + "\n" + race + "\nLevel " + level + "\n" + GetStats() + "\n" + GetFeatures();
    }
    public String GetStats()
    {
        return "\nStr: " + strength + "\nAgi: " + agility + "\nEnd: " + endurance + "\nInt: " + intellect + "\nWis: " + wisdom + "\nCha: " + charisma;
    }
    public String GetFeatures()
    {
        return "\n" + classes + " features:\n" + features;
    }
}
