public class FizzBuzz {

    public static final String FIZZ = "Fizz";   
    public static final String BUZZ = "Buzz";

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzbuzz(i));
        }
    }

    public static String fizzbuzz(int n) {

        String result =
                (n % 3 == 0 ? FIZZ : "") +
                (n % 5 == 0 ? BUZZ : "");

        return result.isEmpty() ? String.valueOf(n) : result;
    }
}