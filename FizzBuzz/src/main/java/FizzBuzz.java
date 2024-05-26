public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String test(int number) {

        if (number == 0){
            return String.valueOf(number);
        }

        boolean isMultipleOfThree = isMultiple(number, 3);
        boolean isMultipleOfFive = isMultiple(number, 5);


        if (!isMultipleOfThree && !isMultipleOfFive) {
            return String.valueOf(number);
        }

        StringBuilder result = new StringBuilder();

        if (isMultipleOfThree) {
            result.append(FIZZ);
        }

        if (isMultipleOfFive) {
            result.append(BUZZ);
        }

        return result.toString();
    }

    private boolean isMultiple(int numberToCheck, int number) {
        return numberToCheck % number == 0;
    }
}
