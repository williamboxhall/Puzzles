package williamboxhall;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SubstringTest {
    private final Substring substring = new Substring();

    @Test
    public void trueWhenCandidateEmpty() {
        assertThat(substring.isSubstring("", "foo"), is(true));
    }

    @Test
    public void falseWhenCandidateLargerThanSource() {
        assertThat(substring.isSubstring("foobar", "foo"), is(false));
    }

    @Test
    public void trueForSingleInstanceOfFirstLetter() {
        assertThat(substring.isSubstring("cat", "acat"), is(true));
    }

    @Test
    public void trueForMultipleInstancesOfFirstLetter() {
        assertThat(substring.isSubstring("cat", "acacat"), is(true));
    }

    @Test
    public void falseWhenNoMatch() {
        assertThat(substring.isSubstring("foo", "barbaz"), is(false));
    }
}
