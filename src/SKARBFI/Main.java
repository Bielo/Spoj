package SKARBFI;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(reader.readLine());
        List<String> results = new ArrayList<>();

        for (int i = 0; i < caseNum; i++) {
            int hintNum = Integer.parseInt(reader.readLine());
            int direction;
            int steps;
            int x = 0;
            int y = 0;

            for (int j = 0; j < hintNum; j++) {

                String[] numbers = reader.readLine().split(" ");

                direction = Integer.parseInt(numbers[0]);

                steps = Integer.parseInt(numbers[1]);

                switch (direction) {
                    case 0:
                        y += steps;
                        break;
                    case 1:
                        y -= steps;
                        break;
                    case 2:
                        x -= steps;
                        break;
                    case 3:
                        x += steps;
                        break;
                }
            }

            if (x == 0 && y == 0) {
                results.add("studnia");
            }

            if (x != 0 && y == 0) {
                if (x > 0) {
                    results.add("3 " + x);
                } else {
                    results.add("2 " + (-x));
                }
            }

            if (x == 0 && y != 0) {
                if (y > 0) {
                    results.add("0 " + y);
                } else {
                    results.add("1 " + (-y));
                }
            }

            if (x != 0 && y != 0) {
                if (y > 0) {
                    results.add("0 " + y);
                } else {
                    results.add("1 " + (-y));
                }
                if (x > 0) {
                    results.add("3 " + x);
                } else {
                    results.add("2 " + (-x));
                }
            }
        }
        for (String list : results) {
            System.out.println(list);
        }
    }
}
