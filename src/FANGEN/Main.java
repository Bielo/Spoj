package FANGEN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        List<Integer> cases = new ArrayList<>();

        while ((number = Integer.parseInt(reader.readLine())) != 0) {
            cases.add(number);
        }

        Fan fan = new Fan();

        fan.fanCreate(cases);

        System.exit(0);
    }
}
