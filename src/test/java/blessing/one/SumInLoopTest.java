package blessing.one;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SumInLoopTest {
    private SumInLoop solution = new SumInLoop();

    @Test
    public void test() throws Exception {
        int[] numbers = {358, 376, 352, 1012, 1149, 1025, 29, 1145, 307, 412, 860, 56, 329, 865, 1107, 913, 946, 819,
                363, 1027, 932, 461, 108, 833, 903, 627, 534, 690, 14, 357, 197, 363, 724, 540, 74, 572, 264, 93,
                417, 562, 495, 1268};

        assertEquals(24478, solution.loop(numbers));
    }
}