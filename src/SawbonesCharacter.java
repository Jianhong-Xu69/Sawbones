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

    public SawbonesCharacter() {
        name = "nameless";
        classes = "none";
        race = "human";
        level = 1;
    }

    public SawbonesCharacter(String name, String classes, String race, int level) {
        this.name = name;
        this.level = level;
        if (classes.equalsIgnoreCase("rogue")) {
            RogueSetup();
        } else if (classes.equalsIgnoreCase("knight")) {
            KnightSetup();
        } else if (classes.equalsIgnoreCase("runemage")) {
            RunemageSetup();
        } else if (classes.equalsIgnoreCase("monk")) {
            MonkSetup();
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

    private void RogueSetup()//DONE (?)
    {
        classes = "Rogue";
        features = "Gang Up\nBanditry\n";
        proficiencies = "Light Armour\nTwo from Axes, Bludgeons, Daggers, Crossbows, Bows, and Firearms\n";
        inventory = "Choose between:\n(A) A Hand Axe and Tomahawk\n(B) Two Shivs\n(C) A Club, A Flintlock Pistol, and 30 Handgun Ammunition\n(D) A Hand Crossbow, 30 Hand Crossbow Bolts and a Knife\n(E) A Dirk, A Shortbow, and 30 arrows\nOne set of hide armor\nA bag of tricks\nThree day's worth of provisions\nTwenty lock picks\nA hood\nA mask or cloth scarf";
        skills = "Choose four from: \nSubterfuge\nStealth\nDodge\nLight Weapons\nInvestigation\nIntimidation\nArchery\nPersuasion\nPerception\nIncrease them by 3";
    }

    private void KnightSetup()//DONE (?)
    {
        classes = "Knight";
        features = "Defender\nValor\n";
        proficiencies = "Light Armour\nYour choice of Medium or Heavy Armor\nTwo from Swords, Bludgeons, Daggers, or Spears\n";
        inventory = "Three weapons of your choice that you are proficient in\nYour choice of:\nQuilted Armor\nRing Mail\nLamellar\nA seal symbolizing the Oath you swore\nOne day's worth of provisions\nYour choice of:\nHeater\nKite Shield (if proficient)\nA cape\nThree vials of water";
        skills = "Choose two from: \nLight Weapons\nHeavy Weapons\nMedium Armor\nHeavy Armor\nIntimidation\nAthletics\nResistance\nHistory\nInsight\nWill\nIncrease them by 3";
    }

    private void RunemageSetup()//DONE (?)
    {
        classes = "Runemage";
        features = "Runecasting\nEvocation\n";
        proficiencies = "Light Armour\nTwo from Axes, Bludgeons, Daggers, and Staves\n";
        inventory = "Two Light weapons of your choice that you are proficient in\nOne set of hide armor\nA box full of charms\nOne day's worth of provisions\nA hood, A mask, or cloth scarf";
        skills = "Choose two from: \nMagic\nNature\nSurvival\nWill\nInsight\nHistory\nResistance\nLight Weapons\nIncrease them by 2";
    }
    private void MonkSetup()//DONE (?)
    {
        classes = "Monk";
        features = "Qi\nStances\n";
        proficiencies = "Light Armour\nTwo from Staves, Bludgeons, Exotic Weapons, Daggers, Bows, or Spears\n";
        inventory = "Two weapons from the following choices:\nA Long Stick\nA Hunting Bow and 20 arrows\nA Shortspear\nA Mace\nA Jian\nA Skinning Knife\nYour choice of: \nQuilted Armor\nMonk's Robes\nA scroll containing the knowledge of the Ancestral Art you follow\none day's worth of provisions\n20m of rope\na hollow gourd full of water";
        skills = "Choose three from: \nLight Weapons\nSpeed\nMagic\nAthletics\nResistance\nHistory\nArchery\nStealth\nWill\nIncrease them by 2";
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
