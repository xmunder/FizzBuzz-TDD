import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

    @Nested
    @DisplayName("Números no divisibles por 3 ni 5")
    class NonMultiples {
        @ParameterizedTest(name = "Cuando_{0}_no_es_múltiplo_de_3_ni_5_Espera_{0}")
        @ValueSource(ints = {1, 2, 4, 7, -1})
        void returnsNumber(int input) {
            assertEquals(String.valueOf(input), FizzBuzz.fizzbuzz(input));
        }
    }

    @Nested
    @DisplayName("Múltiplos solo de 3")
    class OnlyThrees {
        @ParameterizedTest(name = "Cuando_{0}_es_múltiplo_de_3_Espera_Fizz")
        @ValueSource(ints = {3, 6, -3})
        void returnsFizz(int input) {
            assertEquals(FizzBuzz.FIZZ, FizzBuzz.fizzbuzz(input));
        }
    }

    @Nested
    @DisplayName("Múltiplos solo de 5")
    class OnlyFives {
        @ParameterizedTest(name = "Cuando_{0}_es_múltiplo_de_5_Espera_Buzz")
        @ValueSource(ints = {5, 10, -5})
        void returnsBuzz(int input) {
            assertEquals(FizzBuzz.BUZZ, FizzBuzz.fizzbuzz(input));
        }
    }

    @Nested
    @DisplayName("Múltiplos de 3 y 5 (incluyendo cero y numeros grandes)")
    class ThreesAndFives {
        @ParameterizedTest(name = "Cuando_{0}_es_múltiplo_de_3_y_5_Espera_FizzBuzz")
        @ValueSource(ints = {0, 15, 30, -15, 3000000, -3000000})
        void returnsFizzBuzz(int input) {
            assertEquals(FizzBuzz.FIZZ + FizzBuzz.BUZZ, FizzBuzz.fizzbuzz(input));
        }
    }
}

