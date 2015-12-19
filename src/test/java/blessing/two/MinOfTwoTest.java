package blessing.two;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by admin on 12/19/2015.
 */
public class MinOfTwoTest {

    private MinOfTwo solution = new MinOfTwo();

    @Test
    public void test() throws Exception {
        String answer = solution.loop("input/min-of-two.txt", true, " ", 2);
        assertEquals("362695 -2469666 -4168879 -5627753 403440 -5041032 -6401431 -6475526 -9927176 -9005860 -7281620 " +
                "-6622582 -2228495 -2014982 4898417 3289256 -2507002 -9180409 -4808162 -3530517 -9651397 -2910037 " +
                "-6052829 -5980006 543601 -4985866 -7456370 -8135834 -9849197 ", answer);
    }

}