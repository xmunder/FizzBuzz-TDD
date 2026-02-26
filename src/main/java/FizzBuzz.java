public class FizzBuzz {

    public static final String FIZZ = "Fizz";   
    public static final String BUZZ = "Buzz";

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzbuzz(i));
        }
    }

    public static String fizzbuzz(int n) {

        if ( n % 3 == 0 && n % 5 == 0) {
            return FIZZ + BUZZ;
        } else if (n % 3 == 0) {
            return FIZZ;
        } else if (n % 5 == 0) {
            return BUZZ;
        }
        return String.valueOf(n);
    }
}