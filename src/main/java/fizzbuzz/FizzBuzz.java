package fizzbuzz;


public final class FizzBuzz {
    
	public String getValue(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);
    }
    
}
