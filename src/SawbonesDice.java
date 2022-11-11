public class SawbonesDice {

    public SawbonesDice()
    {
    }

    public String RollStats()
    {
        int roll = 0;
        int each = 0;
        String total = "";
        for (int i = 0; i < 2; i++)
        {
            total += "Set " + (i + 1) + " out of " + 2 + ": ";
            for (int d = 0; d < 6; d++)
            {
                roll = (int) ((Math.random() * 8) + 1);
                roll += -4;
                each += roll;
                total += roll + ", ";
            }
            total += "for a total of " + each + "\n";
            each = 0;
        }
        return total;
    }
    public int RollDice(int number, int side, int modifier)
    {
        int roll = 0;
        int total = 0;
        for (int d = 0; d < number; d++)
        {
            roll = (int) ((Math.random() * side) + 1);
            roll += modifier;
            total += roll;
        }
        return total;
    }
}
