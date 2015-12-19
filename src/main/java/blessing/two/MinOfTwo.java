package blessing.two;

import model.IntegerPair;
import util.TestData;

import java.util.List;

public class MinOfTwo {

    public String loop(String file, boolean hasHeader, String seperator) {
        List<Integer[]> list = TestData.loadTestData(file, hasHeader, seperator);

        StringBuilder sb = new StringBuilder();
        for (Integer[] pairs : list) {
            if (pairs[0] < pairs[1]) {
                sb.append(pairs[0]);
            } else {
                sb.append(pairs[1]);
            }

            sb.append(" ");
        }

        return sb.toString();
    }
}
