public class SawbonesDice {

    public SawbonesDice()
    {
    }

    public String RollDice(int times, int number, int dice)
    {
        int roll = 0;
        int each = 0;
        int total = 0;
        String totalRoll = "";
        for (int i = 0; i < times; i++)
        {
            totalRoll += "Set " + (i + 1) + " out of " + times + ": ";
            for (int d = 0; d < number; d++)
            {
                roll = (int) ((Math.random() * dice) + 1);
                each += roll;
                totalRoll += roll + ", ";
            }
            totalRoll += "for a total of " + each + "\n";
            total += each;
            each = 0;
        }
        totalRoll += "The total of all these rolls is: " + total;
        return totalRoll;
    }
}
