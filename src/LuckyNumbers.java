public class LuckyNumbers {
    /* No instance variables */

    /* "empty" constructor with no parameters */
    public LuckyNumbers() { }

    /* Generates a random number between min and max, inclusive,
       and returns that random number
     */
    public int randomIntegerBetween(int min, int max) {
        /* implement this method  */
        int randomNumber = (int)(Math.random() * ((max - min) +1)) + min;
        return randomNumber;
    }

    /* Generates and returns a String containing lucky numbers

       For this lucky number game, there are 5 balls randomly drawn,
       each between 1 and 65, and one "super ball" between 1 and 30.

       In this game, the same number CAN appear more than once.

       The returned String should have the 6 numbers listed (they do not
       need to be in ascending order): 5 "lucky numbers" between 1 and 65,
       and the last one, the "super ball," between 1 and 30.
       See samples below.

       This method should call your randomIntegerBetween method above multiple times
      */
    public String getLuckyNumbers() {
        /* implement this method  */
        int num1 = randomIntegerBetween(1,65);
        int num2 = randomIntegerBetween(1,65);
        int num3 = randomIntegerBetween(1,65);
        int num4 = randomIntegerBetween(1,65);
        int num5 = randomIntegerBetween(1,65);
        int luckyNumber = randomIntegerBetween(1,30);
        String str = "your lucky numbers are: ";
        str += num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ".";
        str += "Your super ball is: " + luckyNumber;
        return str;
    }
}
