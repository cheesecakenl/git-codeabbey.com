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
}
