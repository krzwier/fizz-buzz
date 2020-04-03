package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    
    /**
     * Test the number 1
     */
    @Test
    void GetValue_Input1_Return1() {

        FizzBuzz fb = new FizzBuzz();

        String result = fb.getValue(1);

        assertEquals("1", result);
    }
}
