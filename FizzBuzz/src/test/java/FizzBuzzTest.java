import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void givenNumberMultipleOfThree_whenTest_thenReturnFizz(){
        String result = fizzBuzz.test(3);
        assertEquals("Fizz", result);
    }

    @Test
    void givenNumberNotMultipleOfThree_whenTest_thenReturnNumber(){
        String result = fizzBuzz.test(1);
        assertEquals("1", result);
    }

    @Test
    void givenNumberMultipleOfFive_whenTest_thenReturnBuzz(){
        String result = fizzBuzz.test(5);
        assertEquals("Buzz", result);
    }

    @Test
    void givenNumberMultipleOfThreeAndFive_whenTest_thenReturnFizzBuzz(){
        String result = fizzBuzz.test(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void givenZero_whenTest_thenReturnZero(){
        String result = fizzBuzz.test(0);
        assertEquals("0", result);
    }

    @Test
    void givenNonPositiveNumber_whenTest_thenReturnNumber(){
        String result = fizzBuzz.test(-1);
        assertEquals("-1", result);
    }
}
