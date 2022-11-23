/**
 * The SawbonesCharacter class represents the Sawbones Character sheet. A Sawbones Character sheet contains a name, class, race, features, attributes, inventory, skills, level, hitPoints, stamina, strength, agility, endurance, intellect, wisdom, and charisma
 */
public class SawbonesCharacter {
    private String name = "";
    private String classes = "";
    private String race = "";
    private String features = "";
    private String attributes = "";
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
    SawbonesCharacterSetups helper = new SawbonesCharacterSetups();
    SawbonesRaceSetups assist = new SawbonesRaceSetups();

    /**
     * Empty Constructor for the SawbonesCharacter class, creates a default instance of SawbonesCharacter.
     */
    public SawbonesCharacter() {
        name = "nameless";
        classes = "none";
        race = "none";
        level = 1;
    }

    /**
     * Constructor for the SawbonesCharacter class. This creates a new instance of SawbonesCharacter given the following parameters
     *
     * @param name represents the name of the SawbonesCharacter
     * @param classes represents the classes of the SawbonesCharacter
     * @param race represents the race of the SawbonesCharacter
     * @param level represents the level of the SawbonesCharacter
     * @param starterGear represents the starting gear loadout of the SawbonesCharacter
     * @param starterProf represents the starting proficiencies of the SawbonesCharacter
     * @param starterSkill represents the starting skill set of the SawbonesCharacter
     */
    public SawbonesCharacter(String name, String classes, String race, int level, String starterGear, String starterProf, String starterSkill) {
        this.name = name;
        this.level = level;
        if (classes.equalsIgnoreCase("a")) {
            RogueSetup(starterGear, starterProf, starterSkill);
        } else if (classes.equalsIgnoreCase("b")) {
            KnightSetup(starterGear, starterProf, starterSkill);
        } else if (classes.equalsIgnoreCase("c")) {
            RunemageSetup(starterGear, starterProf, starterSkill);
        } else if (classes.equalsIgnoreCase("d")) {
            MonkSetup(starterGear, starterProf, starterSkill);
        }
        if (race.equalsIgnoreCase("a"))
        {
            HumanSetup();
        }
        else if (race.equalsIgnoreCase("b"))
        {
            HalflingSetup();
        }
        else if (race.equalsIgnoreCase("c"))
        {
            SkeletonSetup();
        }
        else if (race.equalsIgnoreCase("d"))
        {
            GhoulSetup();
        }
        else if (race.equalsIgnoreCase("e"))
        {
            ElharithlaanSetup();
        }
        else if (race.equalsIgnoreCase("f"))
        {
            AnalaanSetup();
        }
        else if (race.equalsIgnoreCase("g"))
        {
            EntaariSetup();
        }
        else if (race.equalsIgnoreCase("h"))
        {
            StonepeakSetup();
        }
        else if (race.equalsIgnoreCase("i"))
        {
            IronskinSetup();
        }
        else if (race.equalsIgnoreCase("j"))
        {
            WindhammerSetup();
        }
        else if (race.equalsIgnoreCase("k"))
        {
            NishiryuSetup();
        }
        else if (race.equalsIgnoreCase("l"))
        {
            KhanakSetup();
        }
        else if (race.equalsIgnoreCase("m"))
        {
            PakamtuSetup();
        }
    }

    /**
     * Method for the SawbonesCharacter class. Takes two ints and changes a variable according to those two ints
     *
     * @param stat represents the variable that is going to be changed
     * @param number represents the amount that the variable increments
     * @return a String detailing what variable was changed and to what amount
     */
    public String ChangeStats(int stat, int number) {
        if (stat == 1) {
            strength += number;
            return "Strength is now set to " + strength;
        } else if (stat == 2) {
            agility += number;
            return "Dexterity is now set to " + agility;
        } else if (stat == 3) {
            endurance += number;
            return "Constitution is now set to " + endurance;
        } else if (stat == 4) {
            intellect += number;
            return "Intelligence is now set to " + intellect;
        } else if (stat == 5) {
            wisdom += number;
            return "Wisdom is now set to " + wisdom;
        } else if (stat == 6) {
            charisma += number;
            return "Charisma is now set to " + charisma;
        } else {
            return "That isn't a valid stat!";
        }
    }

    /**
     * Method for the SawbonesCharacter class, initializes the starting proficiencies, items, and skills for a Rogue in the SawbonesCharacter class
     *
     * @param starterProf represents the starting proficiencies of a Rogue
     * @param starterGear represents the starting loadout of a Rogue
     * @param starterSkill represents the starting skillset of a Rogue
     */
    private void RogueSetup(String starterProf, String starterGear, String starterSkill)//DONE (?)
    {
        classes = "Rogue";
        features = "Gang Up\nBanditry\n";
        proficiencies = "Light Armour\n" + helper.RogueProficiencies(starterProf);
        inventory = helper.RogueGear(starterGear) + "One set of hide armor\nA bag of tricks\nThree day's worth of provisions\nTwenty lock picks\nA hood, mask or cloth scarf";
        skills = helper.RogueSkills(starterSkill) + "\nIncrease them by 3";
    }

    /**
     * Method for the SawbonesCharacter class, initializes the starting proficiencies, items, and skills for a Knight in the SawbonesCharacter class
     *
     * @param starterProf represents the starting proficiencies of a Knight
     * @param starterGear represents the starting loadout of a Knight
     * @param starterSkill represents the starting skillset of a Knight
     */
    private void KnightSetup(String starterProf, String starterGear, String starterSkill)//DONE (?)
    {
        classes = "Knight";
        features = "Defender\nValor\n";
        proficiencies = "Light Armour\n" + helper.KnightProficiencies(starterProf) + "Shields\n";
        inventory = "Three weapons of your choice that you are proficient in\n" + helper.KnightGear(starterGear) + "\nA seal symbolizing the Oath you swore\nOne day's worth of provisions\nA cape\nThree vials of water";
        skills = helper.KnightSkills(starterSkill) + "\nIncrease them by 3";
    }

    /**
     * Method for the SawbonesCharacter class, initializes the starting proficiencies, items, and skills for a Runemage in the SawbonesCharacter class
     *
     * @param starterProf represents the starting proficiencies of a Runemage
     * @param starterGear was a holdover from a previous version that I'm too afraid to delete. Oh well
     * @param starterSkill represents the starting skillset of a Runemage
     */
    private void RunemageSetup(String starterProf, String starterGear, String starterSkill)//DONE (?)
    {
        classes = "Runemage";
        features = "Runecasting\nEvocation\n";
        proficiencies = "Light Armour\n" + helper.RunemageProficiencies(starterProf);
        inventory = "Two Light weapons of your choice that you are proficient in\nOne set of hide armor\nA box full of charms\nOne day's worth of provisions\nA hood, A mask, or cloth scarf";
        skills = helper.RunemageSkills(starterSkill) + "\nIncrease them by 2";
    }

    /**
     * Method for the SawbonesCharacter class, initializes the starting proficiencies, items, and skills for a Monk in the SawbonesCharacter class
     *
     * @param starterProf represents the starting proficiencies of a Monk
     * @param starterGear represents the starting loadout of a Monk
     * @param starterSkill represents the starting skillset of a Monk
     */
    private void MonkSetup(String starterProf, String starterGear, String starterSkill)//DONE (?)
    {
        classes = "Monk";
        features = "Qi\nStances\n";
        proficiencies = "Light Armour\n" + helper.MonkProficiencies(starterProf);
        inventory = helper.MonkGear(starterGear) + "A scroll containing the knowledge of the Ancestral Art you follow\none day's worth of provisions\n20m of rope\na hollow gourd full of water";
        skills = helper.MonkSkills(starterSkill) + "\nIncrease them by 2";
    }

    /**
     * Method for the SawbonesCharacter class, initializes the race of the SawbonesCharacter as Human
     */
    private void HumanSetup()
    {
        race = "Human";
        attributes = assist.Human();
    }

    /**
     * Method for the SawbonesCharacter class, initializes the race of the SawbonesCharacter as Halfling
     */
    private void HalflingSetup()
    {
        race = "Halfling";
        ChangeStats(4, 1);
        ChangeStats(2,1);
        ChangeStats(3,-1);
        attributes = assist.Halfling();
    }

    /**
     * Method for the SawbonesCharacter class, initialize the race of the SawbonesCharacter as Skeleton
     */
    private void SkeletonSetup()
    {
        race = "Skeleton";
        ChangeStats(3,1);
        ChangeStats(4,1);
        attributes = assist.Skeleton();
    }

    /**
     * Method for the SawbonesCharacter class, initialize the race of the SawbonesCharacter as Ghoul
     */
    private void GhoulSetup()
    {
        race = "Ghoul";
        ChangeStats(4,1);
        ChangeStats(5,1);
        ChangeStats(6,-1);
        attributes = assist.Ghoul();
    }

    /**
     * Method for the SawbonesCharacter class, initialize the race of the SawbonesCharacter as Elharithlaan
     */
    private void ElharithlaanSetup()
    {
        race = "Elharithlaan";
        ChangeStats(2, 1);
        ChangeStats(3, -1);
        ChangeStats(4, 1);
        ChangeStats(5, 1);
        attributes = assist.Elharithlaan();
    }

    /**
     * Method for the SawbonesCharacter class, initialize the race of the SawbonesCharacter as Analaan
     */
    private void AnalaanSetup()
    {
        race = "Analaan";
        ChangeStats(2, 1);
        ChangeStats(5, 1);
        attributes = assist.Analaan();
    }

    /**
     * Method for the SawbonesCharacter class, initialize the race of the SawbonesCharacter as Entaari
     */
    private void EntaariSetup()
    {
        race = "Entaari";
        ChangeStats(2, 1);
        ChangeStats(3, 1);
        ChangeStats(5, 2);
        attributes = assist.Entaari();
    }

    /**
     * Method for the SawbonesCharacter class, initialize the race of the SawbonesCharacter as Stonepeak
     */
    private void StonepeakSetup()
    {
        race = "Stonepeak";
        ChangeStats(3, 2);
        ChangeStats(1, 2);
        attributes = assist.Stonepeak();
    }

    /**
     * Method for the SawbonesCharacter class, initialize the race of the SawbonesCharacter as Ironskin
     */
    private void IronskinSetup()
    {
        race = "Ironskin";
        ChangeStats(3,3);
        ChangeStats(1,1);
        ChangeStats(2,-1);
        attributes = assist.Ironskin();
    }

    /**
     * Method for the SawbonesCharacter class, initialize the race of the SawbonesCharacter as Windhammer
     */
    private void WindhammerSetup()
    {
        race = "Windhammer";
        ChangeStats(3,2);
        ChangeStats(1,1);
        ChangeStats(5,-1);
        attributes = assist.Windhammer();
    }

    /**
     * Method for the SawbonesCharacter class, initialize the race of the SawbonesCharacter as Nishiryu
     */
    private void NishiryuSetup()
    {
        race = "Nishiryu";
        ChangeStats(3,1);
        ChangeStats(5,1);
        ChangeStats(6,1);
        attributes = assist.Nishiryu();
    }

    /**
     * Method for the SawbonesCharacter class, initialize the race of the SawbonesCharacter as Khanak
     */
    private void KhanakSetup()
    {
        race = "Khanak";
        ChangeStats(1,1);
        ChangeStats(4,1);
        ChangeStats(5,1);
        attributes = assist.Khanak();
    }

    /**
     * Method for the SawbonesCharacter class, initialize the race of the SawbonesCharacter as Paka'mtu
     */
    private void PakamtuSetup()
    {
        race = "Paka'mtu";
        ChangeStats(2,1);
        ChangeStats(5,1);
        ChangeStats(6,1);
        attributes = assist.Pakamtu();
        proficiencies += "Scimitars\nGreatsabres\n";
    }

    /**
     * Method for the SawboneCharacter class, generates the hitpoints and stamina of an instance of the SawbonesCharacter class
     */
    public void RollHealthStamina()//DONE
    {
        if (classes.equalsIgnoreCase("rogue")) {
            hitPoints = 6 + (endurance / 2);
            for (int i = 1; i < level; i++) {
                hitPoints += roller.RollDice(1, 6, (endurance / 2));
            }
        }
        if (classes.equalsIgnoreCase("knight")) {
            hitPoints = 8 + (endurance / 2);
            for (int i = 1; i < level; i++) {
                hitPoints += roller.RollDice(1, 8, (endurance / 2));
            }
        }
        if (classes.equalsIgnoreCase("runemage")) {
            hitPoints = 4 + (endurance / 2);
            for (int i = 1; i < level; i++) {
                hitPoints += roller.RollDice(1, 4, (endurance / 2));
            }
        }
        if (classes.equalsIgnoreCase("monk")) {
            hitPoints = 6 + (endurance / 2);
            for (int i = 1; i < level; i++) {
                hitPoints += roller.RollDice(1, 4, (endurance / 2));
            }
        }
        if (endurance > 0) {
            stamina = 3 + endurance;
        } else {
            stamina = 3;
        }
    }

    /**
     * Method that returns a formatted version of the Sawbones Character Sheet
     * @return a String of a formatted version of the Sawbones Character Sheet
     */
    public String CharacterInformation() {
        return "\n" + name + "\n" + classes + "\n\n" + race + "\nLevel " + level + "\n\nHP: " + hitPoints + "\nStamina: " + stamina + "\n" + GetStats() + "\n" + GetFeatures() + "\n" + GetInventory();
    }

    /**
     * Method that returns a formatted part of the Sawbones Character Sheet
     * @return a String of a  formatted version of the stats on the Sawbones Character Sheet
     */
    private String GetStats() {
        return "\nStr: " + strength + "\nAgi: " + agility + "\nEnd: " + endurance + "\nInt: " + intellect + "\nWis: " + wisdom + "\nCha: " + charisma;
    }

    /**
     * Method that returns a formatted part of the Sawbones Character Sheet
     * @return a String of a formatted versions of the attributes, features, skills, and proficiencies on the Sawbones Character Sheet
     */
    private String GetFeatures() {
        return "\n" + race + " attributes:\n" + attributes + "\n" + classes + " features:\n" + features + "\nSkills:\n" + skills + "\n\nProficiencies: \n" + proficiencies;
    }

    /**
     * Method that returns a formatted part of the Sawbones Character Sheet
     * @return a String of a formatted version of the inventory on the Sawbones Character Sheet
     */
    private String GetInventory() {
        return "Inventory:\n\n" + inventory;
    }

    /**
     * toString that returns the formatted version of the Sawbones Character Sheet
     * @return a String of a formatted version of the Sawbones Character Sheet
     */
    public String toString(){
        return CharacterInformation();
    }
}
