import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    @DisplayName("WHEN called method getNumbers should return numbers when not a multiple of 3 or 5")
    void test1(){
        //GIVEN
        FizzBuzz game = new FizzBuzz();
        //WHEN
        var numbers = game.getNumbers();
        //THEN
        assertEquals("8",numbers.get(7));
        assertEquals("52",numbers.get(51));
        assertEquals("74",numbers.get(73));
        assertEquals("98",numbers.get(97));
    }

    @Test
    @DisplayName("WHEN called method getNumbers should return FIZZ when is a multiple of 3")
    void test2(){
        //GIVEN
        FizzBuzz game = new FizzBuzz();
        //WHEN
        var numbers = game.getNumbers();
        //THEN
        assertEquals("FIZZ",numbers.get(8));
        assertEquals("FIZZ",numbers.get(32));
        assertEquals("FIZZ",numbers.get(65));
        assertEquals("FIZZ",numbers.get(98));
    }

    @Test
    @DisplayName("WHEN called method getNumbers should return BUZZ when is a multiple of 5")
    void test3(){
        //GIVEN
        FizzBuzz game = new FizzBuzz();
        //WHEN
        var numbers = game.getNumbers();
        //THEN
        assertEquals("BUZZ",numbers.get(9));
        assertEquals("BUZZ",numbers.get(49));
        assertEquals("BUZZ",numbers.get(79));
        assertEquals("BUZZ",numbers.get(99));
    }

    @Test
    @DisplayName("WHEN called method getNumbers should return FIZZBUZZ when is a multiple of 3 and 5")
    void test4(){
        //GIVEN
        FizzBuzz game = new FizzBuzz();
        //WHEN
        var numbers = game.getNumbers();
        //THEN
        assertEquals("FIZZBUZZ",numbers.get(14));
        assertEquals("FIZZBUZZ",numbers.get(29));
        assertEquals("FIZZBUZZ",numbers.get(59));
        assertEquals("FIZZBUZZ",numbers.get(89));
    }
}
