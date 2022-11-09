public class SawbonesDice {

    public SawbonesDice()
    {
    }

    public String RollDice(int number, int dice)
    {
        int roll = 0;
        int total = 0;
        String totalRoll = "";
        for (int i = 0; i < number; i++)
        {
            roll = (int) ((Math.random() * dice) + 1);
            total += roll;
            totalRoll += roll + ", ";
        }
        totalRoll += "for a total of " + total;
        return totalRoll;
    }
}
