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
            proficiencies += "Daggers\n";
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
        if (choice.toLowerCase().contains("a"))
        {
            inventory += "Quilted Armor\n";
        }
        else if (choice.toLowerCase().contains("b"))
        {
            inventory += "Ring Mail\n";
        }
        else if (choice.toLowerCase().contains("c"))
        {
            inventory += "Lamellar\n";
        }
        if (choice.toLowerCase().contains("1"))
        {
            inventory += "Heater\n";
        }
        else if (choice.toLowerCase().contains("2"))
        {
            inventory += "Kite Shield\n";
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

    public String RunemageProficiencies (String choice)
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
        if (choice.toLowerCase().contains("staves"))
        {
            proficiencies += "Staves\n";
        }
        return proficiencies;
    }
    public String RunemageSkills(String choice)
    {
        String skills = "";
        if (choice.toLowerCase().contains("magic"))
        {
            skills += "Magic\n";
        }
        if (choice.toLowerCase().contains("nature"))
        {
            skills += "Nature\n";
        }
        if (choice.toLowerCase().contains("survival"))
        {
            skills += "Survival\n";
        }
        if (choice.toLowerCase().contains("will"))
        {
            skills += "Will\n";
        }
        if (choice.toLowerCase().contains("insight"))
        {
            skills += "Insight\n";
        }
        if (choice.toLowerCase().contains("history"))
        {
            skills += "History\n";
        }
        if (choice.toLowerCase().contains("resistance"))
        {
            skills += "Resistance\n";
        }
        if (choice.toLowerCase().contains("light weapons"))
        {
            skills += "Light Weapons\n";
        }
        return skills;
    }

    public String MonkProficiencies (String choice)
    {
        String proficiencies = "";
        if (choice.toLowerCase().contains("staves"))
        {
            proficiencies += "Staves\n";
        }
        if (choice.toLowerCase().contains("bludgeons"))
        {
            proficiencies += "Bludgeons\n";
        }
        if (choice.toLowerCase().contains("exotic weapons"))
        {
            proficiencies += "Exotic Weapons\n";
        }
        if (choice.toLowerCase().contains("daggers"))
        {
            proficiencies += "Daggers\n";
        }
        if (choice.toLowerCase().contains("bows"))
        {
            proficiencies += "Bows\n";
        }
        if (choice.toLowerCase().contains("spear"))
        {
            proficiencies += "Spears\n";
        }
        return proficiencies;
    }
    public String MonkGear (String choice)
    {
        String inventory = "";
        if (choice.toLowerCase().contains("a"))
        {
            inventory += "Long Stick\n";
        }
        if (choice.toLowerCase().contains("b"))
        {
            inventory += "Hunting Bow\n20 Arrows\n";
        }
        if (choice.toLowerCase().contains("c"))
        {
            inventory += "Shortspear\n";
        }
        if (choice.toLowerCase().contains("d"))
        {
            inventory += "Mace\n";
        }
        if (choice.toLowerCase().contains("e"))
        {
            inventory += "Jian\n";
        }
        if (choice.toLowerCase().contains("f"))
        {
            inventory += "Skinning Knife\n";
        }
        if (choice.toLowerCase().contains("1"))
        {
            inventory += "Quilted Armor\n";
        }
        else if (choice.toLowerCase().contains("2"))
        {
            inventory += "Monk's Robes\n";
        }
        return inventory;
    }
    public String MonkSkills(String choice)
    {
        String skills = "";
        if (choice.toLowerCase().contains("light weapons"))
        {
            skills += "Light Weapons\n";
        }
        if (choice.toLowerCase().contains("speed"))
        {
            skills += "Speed\n";
        }
        if (choice.toLowerCase().contains("magic"))
        {
            skills += "Magic\n";
        }
        if (choice.toLowerCase().contains("athletics"))
        {
            skills += "Athletics\n";
        }
        if (choice.toLowerCase().contains("resistance"))
        {
            skills += "Resistance\n";
        }
        if (choice.toLowerCase().contains("history"))
        {
            skills += "History\n";
        }
        if (choice.toLowerCase().contains("archery"))
        {
            skills += "Archery\n";
        }
        if (choice.toLowerCase().contains("stealth"))
        {
            skills += "Stealth\n";
        }
        if (choice.toLowerCase().contains("will"))
        {
            skills += "Will\n";
        }
        return skills;
    }
}
