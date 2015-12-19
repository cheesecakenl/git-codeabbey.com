package blessing.two;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinOfThreeTest {
    private MinOfThree solution = new MinOfThree();

    @Test
    public void test() throws Exception {
        String answer = solution.loop("input/min-of-three.txt", true, " ", 3);
        assertEquals("2760685 -3545453 805809 5959076 -4665752 -8782717 -9004560 -7031390 -7271088 -4063114 -4263597 " +
                "-9893302 -3969871 -5662344 -328097 -8449790 741731 -8984450 -7902279 -5421263 315139 -6380355 " +
                "-350226 ", answer);
    }
}