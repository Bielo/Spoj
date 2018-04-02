package FZI_STEF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int numberOfCities;
        int concert;
        int sum = 0;
        int profit = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        numberOfCities = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numberOfCities; i++) {

            concert = Integer.parseInt(reader.readLine());
            sum += concert;
            if (sum < 0) {
                sum = 0;
            }
            if (sum > profit) {
                profit = sum;
            }
        }
        System.out.println(profit);
    }
}
