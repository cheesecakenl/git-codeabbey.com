package blessing.two;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MaxMinOfArrayTest {
    private MaxMinOfArray solution = new MaxMinOfArray();

    @Test
    public void test() throws Exception {
        String answer = solution.loop("input/max-min-array.txt", false, " ");
        assertEquals("79707 -79317", answer);
    }
}