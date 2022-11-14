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
    SawbonesCharacterSetups helper = new SawbonesCharacterSetups();

    public SawbonesCharacter() {
        name = "nameless";
        classes = "none";
        race = "human";
        level = 1;
    }

    public SawbonesCharacter(String name, String classes, String race, int level, String starterGear, String starterProf, String starterSkill) {
        this.name = name;
        this.level = level;
        if (classes.equalsIgnoreCase("rogue")) {
            RogueSetup(starterGear, starterProf, starterSkill);
        } else if (classes.equalsIgnoreCase("knight")) {
            KnightSetup(starterGear, starterProf, starterSkill);
        } else if (classes.equalsIgnoreCase("runemage")) {
            RunemageSetup(starterGear, starterProf, starterSkill);
        } else if (classes.equalsIgnoreCase("monk")) {
            MonkSetup(starterGear, starterProf, starterSkill);
        }
    }

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

    private void RogueSetup(String starterProf, String starterGear, String starterSkill)//DONE (?)
    {
        classes = "Rogue";
        features = "Gang Up\nBanditry\n";
        proficiencies = "Light Armour\n" + helper.RogueProficiencies(starterProf);
        inventory = helper.RogueGear(starterGear) + "One set of hide armor\nA bag of tricks\nThree day's worth of provisions\nTwenty lock picks\nA hood\nA mask or cloth scarf";
        skills = helper.RogueSkills(starterSkill) + "\nIncrease them by 3";
    }

    private void KnightSetup(String starterProf, String starterGear, String starterSkill)//DONE (?)
    {
        classes = "Knight";
        features = "Defender\nValor\n";
        proficiencies = "Light Armour\n" + helper.KnightProficiencies(starterProf);
        inventory = "Three weapons of your choice that you are proficient in\n" + helper.KnightGear(starterGear) + "\nA seal symbolizing the Oath you swore\nOne day's worth of provisions\nA cape\nThree vials of water";
        skills = helper.KnightSkills(starterSkill) + "\nIncrease them by 3";
    }

    private void RunemageSetup(String starterProf, String starterGear, String starterSkill)//DONE (?)
    {
        classes = "Runemage";
        features = "Runecasting\nEvocation\n";
        proficiencies = "Light Armour\n" + helper.RunemageProficiencies(starterProf);
        inventory = "Two Light weapons of your choice that you are proficient in\nOne set of hide armor\nA box full of charms\nOne day's worth of provisions\nA hood, A mask, or cloth scarf";
        skills = helper.RunemageSkills(starterSkill) + "\nIncrease them by 2";
    }
    private void MonkSetup(String starterProf, String starterGear, String starterSkill)//DONE (?)
    {
        classes = "Monk";
        features = "Qi\nStances\n";
        proficiencies = "Light Armour\n" + helper.MonkProficiencies(starterProf);
        inventory = helper.MonkGear(starterGear) + "A scroll containing the knowledge of the Ancestral Art you follow\none day's worth of provisions\n20m of rope\na hollow gourd full of water";
        skills = helper.MonkSkills(starterSkill) + "\nIncrease them by 2";
    }

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

    public String CharacterInformation() {
        return "\n" + name + "\n" + classes + "\n" + specialisation + "\n" + race + "\nLevel " + level + "\n\nHP: " + hitPoints + "\nStamina: " + stamina + "\n" + GetStats() + "\n" + GetFeatures() + "\n" + GetInventory();
    }

    private String GetStats() {
        return "\nStr: " + strength + "\nAgi: " + agility + "\nEnd: " + endurance + "\nInt: " + intellect + "\nWis: " + wisdom + "\nCha: " + charisma;
    }

    private String GetFeatures() {
        return "\n" + classes + " features:\n" + features + "\nSkills:\n" + skills + "\n\nProficiencies: \n" + proficiencies;
    }

    private String GetInventory() {
        return "\nInventory:\n\n" + inventory;
    }
}
