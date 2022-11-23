/**
 * The SawbonesCharacterSetups class is a helper class created to hopefully make the SawbonesCharacter class less complicated. It did not
 */
public class SawbonesCharacterSetups {
    /**
     * Constructor for the SawbonesCharacterSetup class. This is a helper class so it does nothing
     */
    public SawbonesCharacterSetups(){
    }

    /**
     * Method for the SawbonesCharacterSetups class, returns the chosen proficiencies of a Rogue
     * @param choice represents what proficiencies were chosen
     * @return a String containing the proficiencies suited for a Rogue
     */
    public String RogueProficiencies (String choice)
    {
        String proficiencies = "";
        if (choice.toLowerCase().contains("a"))
        {
            proficiencies += "Axes\n";
        }
        if (choice.toLowerCase().contains("b"))
        {
            proficiencies += "Bludgeons\n";
        }
        if (choice.toLowerCase().contains("c"))
        {
            proficiencies += "Daggers\n";
        }
        if (choice.toLowerCase().contains("d"))
        {
            proficiencies += "Crossbows\n";
        }
        if (choice.toLowerCase().contains("e"))
        {
            proficiencies += "Bows\n";
        }
        if (choice.toLowerCase().contains("f"))
        {
            proficiencies += "Firearms\n";
        }
        return proficiencies;
    }

    /**
     * Method for the SawboneCharacterSetups class, returns the chosen loadout of a Rogue
     * @param choice represents what loadout items were chosen
     * @return a String containing the loadout suited for a Rogue
     */
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

    /**
     * Method for the SawbonesCharacterSetups class, returns the chosen skills of a Rogue
     * @param choice represents what skills were chosen
     * @return a String containing the skills suited for a Rogue
     */
    public String RogueSkills(String choice)
    {
        String skills = "";
        if (choice.toLowerCase().contains("a"))
        {
            skills += "Subterfuge\n";
        }
        if (choice.toLowerCase().contains("b"))
        {
            skills += "Stealth\n";
        }
        if (choice.toLowerCase().contains("c"))
        {
            skills += "Dodge\n";
        }
        if (choice.toLowerCase().contains("d"))
        {
            skills += "Light Weapons\n";
        }
        if (choice.toLowerCase().contains("e"))
        {
            skills += "Investigation\n";
        }
        if (choice.toLowerCase().contains("f"))
        {
            skills += "Intimidation\n";
        }
        if (choice.toLowerCase().contains("g"))
        {
            skills += "Archery\n";
        }
        if (choice.toLowerCase().contains("h"))
        {
            skills += "Persuasion\n";
        }
        if (choice.toLowerCase().contains("i"))
        {
            skills += "Perception\n";
        }
        return skills;
    }

    /**
     * Method for the SawbonesCharacterSetups class, returns the chosen proficiencies of a Knight
     * @param choice represents what proficiencies were chosen
     * @return a String containing the proficiencies suited for a Knight
     */
    public String KnightProficiencies (String choice)
    {
        String proficiencies = "";
        if (choice.toLowerCase().contains("a"))
        {
            proficiencies += "Medium Armor\n";
        }
        if (choice.toLowerCase().contains("b"))
        {
            proficiencies += "Heavy Armor\n";
        }
        if (choice.toLowerCase().contains("1"))
        {
            proficiencies += "Swords\n";
        }
        if (choice.toLowerCase().contains("2"))
        {
            proficiencies += "Bludgeons\n";
        }
        if (choice.toLowerCase().contains("3"))
        {
            proficiencies += "Daggers\n";
        }
        if (choice.toLowerCase().contains("4"))
        {
            proficiencies += "Spears\n";
        }
        return proficiencies;
    }

    /**
     * Method for the SawboneCharacterSetups class, returns the chosen loadout of a Knight
     * @param choice represents what loadout items were chosen
     * @return a String containing the loadout suited for a Knight
     */
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

    /**
     * Method for the SawbonesCharacterSetups class, returns the chosen skills of a Knight
     * @param choice represents what skills were chosen
     * @return a String containing the skills suited for a Knight
     */
    public String KnightSkills(String choice)
    {
        String skills = "";
        if (choice.toLowerCase().contains("a"))
        {
            skills += "Light Weapons\n";
        }
        if (choice.toLowerCase().contains("b"))
        {
            skills += "Heavy Weapons\n";
        }
        if (choice.toLowerCase().contains("c"))
        {
            skills += "Medium Armor\n";
        }
        if (choice.toLowerCase().contains("d"))
        {
            skills += "Heavy Armor\n";
        }
        if (choice.toLowerCase().contains("e"))
        {
            skills += "Intimidation\n";
        }
        if (choice.toLowerCase().contains("f"))
        {
            skills += "Athletic\n";
        }
        if (choice.toLowerCase().contains("g"))
        {
            skills += "Resistances\n";
        }
        if (choice.toLowerCase().contains("h"))
        {
            skills += "History\n";
        }
        if (choice.toLowerCase().contains("i"))
        {
            skills += "Insight\n";
        }
        if (choice.toLowerCase().contains("j"))
        {
            skills += "Will\n";
        }
        return skills;
    }

    /**
     * Method for the SawbonesCharacterSetups class, returns the chosen proficiencies of a Runemage
     * @param choice represents what proficiencies were chosen
     * @return a String containing the proficiencies suited for a Runemage
     */
    public String RunemageProficiencies (String choice)
    {
        String proficiencies = "";
        if (choice.toLowerCase().contains("a"))
        {
            proficiencies += "Axes\n";
        }
        if (choice.toLowerCase().contains("b"))
        {
            proficiencies += "Bludgeons\n";
        }
        if (choice.toLowerCase().contains("c"))
        {
            proficiencies += "Daggers\n";
        }
        if (choice.toLowerCase().contains("d"))
        {
            proficiencies += "Staves\n";
        }
        return proficiencies;
    }

    /**
     * Method for the SawbonesCharacterSetups class, returns the chosen skills of a Runemage
     * @param choice represents what skills were chosen
     * @return a String containing the skills suited for a Runemage
     */
    public String RunemageSkills(String choice)
    {
        String skills = "";
        if (choice.toLowerCase().contains("a"))
        {
            skills += "Magic\n";
        }
        if (choice.toLowerCase().contains("b"))
        {
            skills += "Nature\n";
        }
        if (choice.toLowerCase().contains("c"))
        {
            skills += "Survival\n";
        }
        if (choice.toLowerCase().contains("d"))
        {
            skills += "Will\n";
        }
        if (choice.toLowerCase().contains("e"))
        {
            skills += "Insight\n";
        }
        if (choice.toLowerCase().contains("f"))
        {
            skills += "History\n";
        }
        if (choice.toLowerCase().contains("g"))
        {
            skills += "Resistance\n";
        }
        if (choice.toLowerCase().contains("h"))
        {
            skills += "Light Weapons\n";
        }
        return skills;
    }

    /**
     * Method for the SawbonesCharacterSetups class, returns the chosen proficiencies of a Monk
     * @param choice represents what proficiencies were chosen
     * @return a String containing the proficiencies suited for a Monk
     */
    public String MonkProficiencies (String choice)
    {
        String proficiencies = "";
        if (choice.toLowerCase().contains("a"))
        {
            proficiencies += "Staves\n";
        }
        if (choice.toLowerCase().contains("b"))
        {
            proficiencies += "Bludgeons\n";
        }
        if (choice.toLowerCase().contains("c"))
        {
            proficiencies += "Exotic Weapons\n";
        }
        if (choice.toLowerCase().contains("d"))
        {
            proficiencies += "Daggers\n";
        }
        if (choice.toLowerCase().contains("e"))
        {
            proficiencies += "Bows\n";
        }
        if (choice.toLowerCase().contains("f"))
        {
            proficiencies += "Spears\n";
        }
        return proficiencies;
    }

    /**
     * Method for the SawboneCharacterSetups class, returns the chosen loadout of a Monk
     * @param choice represents what loadout items were chosen
     * @return a String containing the loadout suited for a Monk
     */
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

    /**
     * Method for the SawbonesCharacterSetups class, returns the chosen skills of a Monk
     * @param choice represents what skills were chosen
     * @return a String containing the skills suited for a Monk
     */
    public String MonkSkills(String choice)
    {
        String skills = "";
        if (choice.toLowerCase().contains("a"))
        {
            skills += "Light Weapons\n";
        }
        if (choice.toLowerCase().contains("b"))
        {
            skills += "Speed\n";
        }
        if (choice.toLowerCase().contains("c"))
        {
            skills += "Magic\n";
        }
        if (choice.toLowerCase().contains("d"))
        {
            skills += "Athletics\n";
        }
        if (choice.toLowerCase().contains("e"))
        {
            skills += "Resistance\n";
        }
        if (choice.toLowerCase().contains("f"))
        {
            skills += "History\n";
        }
        if (choice.toLowerCase().contains("g"))
        {
            skills += "Archery\n";
        }
        if (choice.toLowerCase().contains("h"))
        {
            skills += "Stealth\n";
        }
        if (choice.toLowerCase().contains("i"))
        {
            skills += "Will\n";
        }
        return skills;
    }
}
