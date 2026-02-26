import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void when_NumberIsNotMultipleOf3Or5_Expect_ReturnNumber() {
        // Arange
        int input = 1;
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        // Assert
        assertEquals("1", result);
    }

    @Test
    void when_NumberIsMultipleOf3_Expect_ReturnFizz() {
        // Arange
        int input = 3;
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        // Assert
        assertEquals("Fizz", result);
    }
    
    @Test
    void when_NumberIsMultipleOf5_Expect_ReturnBuzz() {
        // Arange
        int input = 5;
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        // Assert
        assertEquals("Buzz", result);
    }
    
    @Test
    void when_NumberIsMultipleOf3And5_Expect_ReturnFizzBuzz() {
        // Arange
        int input = 15;
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        // Assert
        assertEquals("FizzBuzz", result);
    }
    
    @Test
    void when_NumberIsZero_Expect_ReturnFizzBuzz() {
        // Arange
        int input = 0;
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        // Assert
        assertEquals("FizzBuzz", result);
    }
    
    @Test
    void when_NumberIsNegativeMultipleOf3_Expect_ReturnFizz() {
        // Arange
        int input = -3;
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        // Assert
        assertEquals("Fizz", result);
    }
    
    @Test
    void when_NumberIsNegativeMultipleOf5_Expect_ReturnBuzz() {
        // Arange
        int input = -5;
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        // Assert
        assertEquals("Buzz", result);
    }
    
    @Test
    void when_NumberIsTooBig_Expect_ReturnFizzBuzz() {
        // Arange
        int input = 3000000;
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    void when_NegativeNumberIsTooBig_Expect_ReturnFizzBuzz() {
        // Arange
        int input = -3000000;
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        // Assert
        assertEquals("FizzBuzz", result);
    }
}
