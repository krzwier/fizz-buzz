package fizzbuzz;


public final class FizzBuzz {
    
	public String getValue(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(i);
    }
    
}
