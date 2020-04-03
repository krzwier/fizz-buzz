package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    /**
     * Helper method to set up fizzbuzz instance, get value, 
     * and test assertion
     */
    private void AssertGetValue(String expected, int input){
        FizzBuzz fb = new FizzBuzz();

        String result = fb.getValue(input);

        assertEquals(expected, result);
    }
    
    @Test
    void GetValue_Input1_Return1() {
        AssertGetValue("1", 1);
    }

    @Test
    void GetValue_Input2_Return2() {
        AssertGetValue("2", 2);
    }

    @Test
    void GetValue_Input3_Return3() {
        AssertGetValue("Fizz", 3);
    }

    @Test
    void GetValue_Input4_Return4() {
        AssertGetValue("4", 4);
    }

    @Test
    void GetValue_Input5_ReturnBuzz() {
        AssertGetValue("Buzz", 5);
    }
}
