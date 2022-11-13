public class SawbonesCharacterSetups {
    public String RogueProficiencies (String choice)
    {
        String proficiencies = "";
        if (choice.toLowerCase().contains("axes"))
        {
            proficiencies += "Axes\n";
        }
        if (choice.toLowerCase().contains("bludgeons"))
        {
            proficiencies += "Bludgeons\n";
        }
        if (choice.toLowerCase().contains("daggers"))
        {
            proficiencies += "Daggers\n";
        }
        if (choice.toLowerCase().contains("crossbows"))
        {
            proficiencies += "Crossbows\n";
        }
        if (choice.toLowerCase().contains("bows"))
        {
            proficiencies += "Bows\n";
        }
        if (choice.toLowerCase().contains("firearms"))
        {
            proficiencies += "Firearms\n";
        }
        return proficiencies;
    }
    public String RogueGear (String choice)
    {
        String inventory = "";
        if (choice.equalsIgnoreCase("a"))
        {
            inventory += "Hand Axe\nTomahawk\n";
        }
        else if (choice.equalsIgnoreCase("b"))
        {
            inventory += "Shiv\nShiv\n";
        }
        else if (choice.equalsIgnoreCase("c"))
        {
            inventory += "Club\nFlintlock Pistol\n30 Handgun Ammunition\n";
        } else if (choice.equalsIgnoreCase("d"))
        {
            inventory += "Hand Crossbow\nKnife\n30 Hand Crossbow Bolts\n";
        }
        else if (choice.equalsIgnoreCase("e"))
        {
            inventory += "Shortbow\nDirk\n30 Arrows\n";
        }
        return inventory;
    }
    public String RogueSkills(String choice)
    {
        String skills = "";
        if (choice.toLowerCase().contains("subterfuge"))
        {
            skills += "Subterfuge\n";
        }
        if (choice.toLowerCase().contains("stealth"))
        {
            skills += "Stealth\n";
        }
        if (choice.toLowerCase().contains("dodge"))
        {
            skills += "Dodge\n";
        }
        if (choice.toLowerCase().contains("light weapons"))
        {
            skills += "Light Weapons\n";
        }
        if (choice.toLowerCase().contains("investigation"))
        {
            skills += "Investigation\n";
        }
        if (choice.toLowerCase().contains("intimidation"))
        {
            skills += "Intimidation\n";
        }
        if (choice.toLowerCase().contains("archery"))
        {
            skills += "Archery\n";
        }
        if (choice.toLowerCase().contains("persuasion"))
        {
            skills += "Persuasion\n";
        }
        if (choice.toLowerCase().contains("perception"))
        {
            skills += "Perception\n";
        }
        return skills;
    }

    public String KnightProficiencies (String choice)
    {
        String proficiencies = "";
        if (choice.toLowerCase().contains("medium armor"))
        {
            proficiencies += "Medium Armor\n";
        }
        if (choice.toLowerCase().contains("heavy armor"))
        {
            proficiencies += "Heavy Armor\n";
        }
        if (choice.toLowerCase().contains("swords"))
        {
            proficiencies += "Swords\n";
        }
        if (choice.toLowerCase().contains("bludgeons"))
        {
            proficiencies += "Bludgeons\n";
        }
        if (choice.toLowerCase().contains("daggers"))
        {
            proficiencies += "Dagger\n";
        }
        if (choice.toLowerCase().contains("spear"))
        {
            proficiencies += "Spears\n";
        }
        return proficiencies;
    }
    public String KnightGear (String choice)
    {
        String inventory = "";
        if (choice.equalsIgnoreCase("a"))
        {
            inventory += "Quilted Armor\n";
        }
        else if (choice.equalsIgnoreCase("b"))
        {
            inventory += "Ring Mail\n";
        }
        else if (choice.equalsIgnoreCase("c"))
        {
            inventory += "Lamellar\n";
        }
        return inventory;
    }
    public String KnightSkills(String choice)
    {
        String skills = "";
        if (choice.toLowerCase().contains("light weapons"))
        {
            skills += "Light Weapons\n";
        }
        if (choice.toLowerCase().contains("heavy weapons"))
        {
            skills += "Heavy Weapons\n";
        }
        if (choice.toLowerCase().contains("medium armor"))
        {
            skills += "Medium Armor\n";
        }
        if (choice.toLowerCase().contains("heavy armor"))
        {
            skills += "Heavy Armor\n";
        }
        if (choice.toLowerCase().contains("intimidation"))
        {
            skills += "Intimidation\n";
        }
        if (choice.toLowerCase().contains("athletic"))
        {
            skills += "Athletic\n";
        }
        if (choice.toLowerCase().contains("resistances"))
        {
            skills += "Resistances\n";
        }
        if (choice.toLowerCase().contains("history"))
        {
            skills += "History\n";
        }
        if (choice.toLowerCase().contains("insight"))
        {
            skills += "Insight\n";
        }
        if (choice.toLowerCase().contains("will"))
        {
            skills += "Will\n";
        }
        return skills;
    }
}
