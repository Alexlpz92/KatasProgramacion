import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearCalculatorTest {

    private final YearCalculator leapYearCalculator = new YearCalculator();

    @Test
    void givenYearDivisibleBy4_whenIsLeap_thenReturnTrue() {
        boolean result = leapYearCalculator.isLeap(1992);
        assertTrue(result);
    }

    @Test
    void givenYearNotDivisibleBy4_whenIsLeap_thenReturnFalse() {
        boolean result = leapYearCalculator.isLeap(1993);
        assertFalse(result);
    }

    @Test
    void givenYearIsDivisibleBy4AnNotDivisibleBy400_whenIsLeap_thenReturnFalse(){
        boolean result = leapYearCalculator.isLeap(1800);
        assertFalse(result);
    }

    @Test
    void givenYearIsDivisibleBy100AndDivisibleBy400_whenIsLeap_thenReturnTrue(){
        boolean result = leapYearCalculator.isLeap(2000);
        assertTrue(result);
    }



}
