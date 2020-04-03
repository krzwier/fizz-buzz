package fizzbuzz;


public final class FizzBuzz {
    
	public static String getValue(int i) {
        if (isFizz(i) && i % 5 == 0) {
            return "FizzBuzz";
        } 
        if (isFizz(i)) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);
    }

    private static boolean isFizz(int i) {
        String stringValue = Integer.toString(i);
        if (i % 3 == 0 || stringValue.indexOf('3') != -1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getValue(i));
        }
        
    }
    
}
