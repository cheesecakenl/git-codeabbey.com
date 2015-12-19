package blessing.two;

import model.IntegerPair;
import util.TestData;

import java.util.List;

public class MinOfTwo {

    public String loop(String file, boolean hasHeader, String seperator) {
        List<IntegerPair> list = TestData.loadTestData(file, hasHeader, seperator);

        StringBuilder sb = new StringBuilder();
        for (IntegerPair pair : list) {
            if (pair.getNumber1() < pair.getNumber2()) {
                sb.append(pair.getNumber1());
            } else {
                sb.append(pair.getNumber2());
            }

            sb.append(" ");
        }

        return sb.toString();
    }
}
