package fizzbuzz;


public final class FizzBuzz {
    
	public static String getValue(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } 
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getValue(i));
        }
        
    }
    
}
