package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    
    @Test
    void GetValue_Input1_Return1() {

        FizzBuzz fb = new FizzBuzz();

        String result = fb.getValue(1);

        assertEquals("1", result);
    }

    @Test
    void GetValue_Input2_Return2() {
        FizzBuzz fb = new FizzBuzz();

        String result = fb.getValue(2);

        assertEquals("2", result);
    }
}
