package home.oxana;

import org.junit.Assert;
import org.junit.Test;

import static home.oxana.Runner.getStringToPrint;
import static org.hamcrest.CoreMatchers.is;


/**
 * Unit test for simple App.
 */
public class RunnerTest {
    private static final String TEST_STRING = "Hello world!";

    @Test
    public void testHelloWorld() {
        Assert.assertThat(getStringToPrint(), is(TEST_STRING));
    }
}
