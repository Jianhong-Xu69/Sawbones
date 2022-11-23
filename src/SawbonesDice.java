/**
 * The SawbonesDice class is a class created to roll dice
 */
public class SawbonesDice {
    /**
     * Constructor for the SawbonesDice class. This is a class that has no variable so it does nothing
     */
    public SawbonesDice() {
    }

    /**
     * Method for the SawbonesDice class, returns the standard rolled stats of a Sawbones Character
     * @return a String containing the standard character creation roll of Sawbones, 6(1d8-4)
     */
    public String RollStats() {
        int roll = 0;
        int each = 0;
        String total = "";
        for (int i = 0; i < 2; i++) {
            total += "Set " + (i + 1) + " out of " + 2 + ": ";
            for (int d = 0; d < 6; d++) {
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

    /**
     * Method for the SawbonesDice class, returns the total roll of any dice roll including modifiers
     * @param number represents the number of dice that should be rolled
     * @param side represents how many sides the dice should
     * @param modifier represents what each dice should be incremented by
     * @return a int containing the total of the dice rolls
     */
    public int RollDice(int number, int side, int modifier) {
        int roll = 0;
        int total = 0;
        for (int d = 0; d < number; d++) {
            roll = (int) ((Math.random() * side) + 1);
            roll += modifier;
            total += roll;
        }
        return total;
    }
}
