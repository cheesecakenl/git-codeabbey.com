package blessing.two;

import model.IntegerPair;
import util.TestData;

import java.util.List;

public class MinOfThree {

    public String loop(String file, boolean hasHeader, String seperator) {
        List<Integer[]> list = TestData.loadTestData(file, hasHeader, seperator);

        StringBuilder sb = new StringBuilder();
        for (Integer[] pairs : list) {
            Integer a = pairs[0];
            Integer b = pairs[1];
            Integer c = pairs[2];

            if (a < b && a < c) {
                sb.append(a);
            } else if (b < a && b < c) {
                sb.append(b);
            } else {
                sb.append(c);
            }

            sb.append(" ");
        }

        return sb.toString();
    }
}
