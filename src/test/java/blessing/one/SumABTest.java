package blessing.one;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SumABTest {

    private SumAB sumAB = new SumAB();

    @Test
    public void test() throws Exception {
        assertEquals(23388, sumAB.sum(8825, 14563));
    }

}