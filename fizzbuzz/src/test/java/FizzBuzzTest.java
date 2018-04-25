import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {

    private FizzBuzz main;

    @Test
    public void testNegativeLength() {
        assertThrows(AssertionError.class, () -> main = new FizzBuzz(-1));
    }

    @Test
    public void testRule2() {
        main = new FizzBuzz(100);
        final List<String> fizzbuzzed = main.fizzBuzz();
        assertEquals("1", fizzbuzzed.get(1));
        assertEquals("Fizz", fizzbuzzed.get(3));
    }

    @Test
    public void testRule3() {
        main = new FizzBuzz(100);
        final List<String> fizzbuzzed = main.fizzBuzz();
        assertEquals("1", fizzbuzzed.get(1));
        assertEquals("Buzz", fizzbuzzed.get(5));
    }

    @Test
    public void testRule4() {
        main = new FizzBuzz(100);
        final List<String> fizzbuzzed = main.fizzBuzz();
        assertEquals("1", fizzbuzzed.get(1));
        assertEquals("Buzz", fizzbuzzed.get(15));
    }

    @Test
    public void testRule5() {
        main = new FizzBuzz(100);
        final List<String> fizzbuzzed = main.fizzBuzz();
        assertEquals("1", fizzbuzzed.get(1));
        assertEquals("It's a trap !", fizzbuzzed.get(7));
    }

    @Test
    public void testRule6() {
        main = new FizzBuzz(100);
        final List<String> fizzbuzzed = main.fizzBuzz();
        assertEquals("1", fizzbuzzed.get(1));
        assertEquals("La grande question sur la vie, l'univers et le reste!", fizzbuzzed.get(42));
    }

    @Test
    public void testZero() {
        main = new FizzBuzz(100);
        final List<String> fizzbuzzed = main.fizzBuzz();
        assertEquals("Buzz", fizzbuzzed.get(0));
    }
}