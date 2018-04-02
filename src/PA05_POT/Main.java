package PA05_POT;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        int[] results = new int[count];
        int[][] lastsNumbers = {
                {0, 0, 0, 0},
                {1, 1, 1, 1},
                {6, 2, 4, 8},
                {1, 3, 9, 7},
                {6, 4, 6, 4},
                {5, 5, 5, 5},
                {6, 6, 6, 6},
                {1, 7, 9, 3},
                {6, 8, 4, 2},
                {1, 9, 1, 9}
        };

        for (int i = 0; i < count; i++) {

            String[] numbers = reader.readLine().split(" ");

            int a = Integer.parseInt(numbers[0]);

            int b = Integer.parseInt(numbers[1]);

            int lastNumber = lastsNumbers[a % 10][b % 4];

            results[i] = lastNumber;

        }
        for (int res : results) {
            System.out.println(res);
        }
    }
}
