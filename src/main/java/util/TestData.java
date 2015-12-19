package util;

import model.IntegerPair;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static List<IntegerPair> loadTestData(String file, boolean hasHeader, String seperator) {
        List<IntegerPair> list = new ArrayList<IntegerPair>();
        try {
            FileInputStream fstream = new FileInputStream(file);

            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;
            while ((strLine = br.readLine()) != null) {

                if (hasHeader) {
                    hasHeader = false;
                    continue;
                }

                if (seperator != null && !seperator.isEmpty()) {
                    String[] arr = strLine.split(seperator);
                    Integer nr1 = new Integer(arr[0]);
                    Integer nr2 = new Integer(arr[1]);

                    list.add(new IntegerPair(nr1, nr2));
                }
            }

            in.close();
        } catch (Exception e) {
            System.out.println("Error reading file " + file);
        }

        return list;
    }

    public static List<Integer[]> loadTestData(String file, boolean hasHeader, String seperator, int rowSize) {
        List<Integer[]> list = new ArrayList<Integer[]>();
        try {
            FileInputStream fstream = new FileInputStream(file);

            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;
            while ((strLine = br.readLine()) != null) {

                if (hasHeader) {
                    hasHeader = false;
                    continue;
                }

                if (seperator != null && !seperator.isEmpty() && rowSize > 0) {
                    String[] strings = strLine.split(seperator);
                    Integer[] ints = convertToIntArray(strings);

                    list.add(ints);
                }
            }

            in.close();
        } catch (Exception e) {
            System.out.println("Error reading file " + file);
        }

        return list;
    }

    private static Integer[] convertToIntArray(String[] items) {
        Integer[] results = new Integer[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                results[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {};
        }

        return results;
    }
}
