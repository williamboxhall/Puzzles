package williamboxhall;

import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void printsFizzWhenMultipleOf3() {
        assertThat(fizzBuzz.print(), containsString("12Fizz4"));
    }

    @Test
    public void printsBuzzWhenMultipleOf5() {
        assertThat(fizzBuzz.print(), containsString("4Buzz"));
    }

    @Test
    public void printsPopWhenMultipleOf7() {
        assertThat(fizzBuzz.print(), containsString("FizzPop8"));
    }

    @Test
    public void printsFizzBuzzWhenMultipleOf3And5() {
        assertThat(fizzBuzz.print(), containsString("PopFizzBuzz16"));
    }

    @Test
    public void printsFrom1To100() {
        assertThat(fizzBuzz.print(), startsWith("12Fizz"));
        assertThat(fizzBuzz.print(), endsWith("97PopFizzBuzz"));
    }
}