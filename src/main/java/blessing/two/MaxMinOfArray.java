package blessing.two;

import util.TestData;

import java.util.Arrays;
import java.util.List;

public class MaxMinOfArray {

    public String loop(String file, boolean hasHeader, String seperator) {
        List<Integer[]> list = TestData.loadTestData(file, hasHeader, seperator);

        Integer[] numbers = list.get(0);
        Arrays.sort(numbers);

        Integer lowest = numbers[0];
        Integer highest = numbers[numbers.length-1];

        StringBuilder sb = new StringBuilder();
        sb.append(highest + " " + lowest);

        return sb.toString();
    }
}
