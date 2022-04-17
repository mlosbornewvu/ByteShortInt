public class Main {
    public static void main(String[] args) {

        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create an int variable and set it to any valid int number.
        // 4. Create a variable of type long, and make it equal to
        // 50000 + 10 times the sum of the byte, plus the short plus the int

        byte myByteValue = 32;
        short myShortValue = 48;
        int myIntValue = 403_455;
        long myLongValue = 50_000L + 10L*(myByteValue+myShortValue+myIntValue);
        short shortValue = (short) (1000+3*(myByteValue + myShortValue + myIntValue));

        System.out.println("myLongValue = " + myLongValue);

        System.out.println("shortValue = " + shortValue);
    }

}
