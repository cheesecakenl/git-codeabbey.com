package blessing.two;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SumsInLoopTest {
    private SumsInLoop solution = new SumsInLoop();

    @Test
    public void test() throws Exception {
        String answer = solution.loop("input/sums-in-loop.txt", true, " ");
        assertEquals("858235 1590918 1272578 1081428 1845241 699520 1104395 817698 1494198 596926 1125190 1024300 " +
                "768573 1349361 ", answer);
    }
}