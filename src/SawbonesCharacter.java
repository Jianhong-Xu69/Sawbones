public class SawbonesCharacter {
    private String name = "";
    private String classes = "";
    private String specialisation = "";
    private String race = "";
    private int level = 0;
    private String features = "";
    private int strength;
    private int agility;
    private int endurance;
    private int intellect;
    private int wisdom;
    private int charisma;

    public SawbonesCharacter(String name, String classes, String specialisation, String race, int level)
    {
        this.name = name;
        this.classes = classes;
        this.specialisation = specialisation;
        this.race = race;
        this.level = level;
        if (classes.toLowerCase().equals("rogue"))
        {
            features += "Gang Up\nBanditry\n";
        }
        else if (classes.toLowerCase().equals("runemage"))
        {
            features += "Runecasting\nEvocation\n";
        }
        else if (classes.toLowerCase().equals("knight"))
        {
            features += "Defender\nValor\n";
        }
        else if (classes.toLowerCase().equals("monk"))
        {
            features += "Qi\nStances\n";
        }
    }

    public void SetStats(int str, int dex, int con, int intel, int wis, int cha)
    {
        strength = str;
        agility = dex;
        endurance = con;
        intellect = intel;
        wisdom = wis;
        charisma = cha;
    }
    public String ChangeStats(int stat, int number)
    {
        if (stat == 1)
        {
            strength = number;
            return "Strength is now set to " + strength;
        }
        else if (stat == 2)
        {
            agility = number;
            return "Dexterity is now set to " + agility;
        }
        else if (stat == 3)
        {
            endurance = number;
            return "Constitution is now set to " + endurance;
        }
        else if (stat == 4)
        {
            intellect = number;
            return "Intelligence is now set to " + intellect;
        }
        else if (stat == 5)
        {
            wisdom = number;
            return "Wisdom is now set to " + wisdom;
        }
        else if (stat == 6)
        {
            charisma = number;
            return "Charisma is now set to " + charisma;
        }
        else
        {
            return "That isn't a valid stat!";
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
