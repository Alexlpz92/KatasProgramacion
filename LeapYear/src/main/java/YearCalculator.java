public class YearCalculator {
    public boolean isLeap(int notLeapYear) {

        boolean isDivisibleByOneHundred = isDivisible(notLeapYear, 100);
        boolean isNotDivisibleByFourHundred = !isDivisible(notLeapYear, 400);

        if (isDivisibleByOneHundred && isNotDivisibleByFourHundred) {
            return false;
        }

        return isDivisible(notLeapYear, 4);
    }

    private boolean isDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
