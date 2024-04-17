import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File input = new File("input.txt");
        ArrayList<Integer> depth = new ArrayList<>();
        try {
            Scanner sc = new Scanner(input);
            while (sc.hasNextLine()) {
                depth.add(Integer.parseInt(sc.nextLine()));
            }
            sc.close();
        } catch (FileNotFoundException fnfe) {

        }

        System.out.println(depth.size() + " lines loaded.");

        int count = 0;
        int prev = -1;
        for (int current : depth) {
            if (prev != -1 && current > prev) {
                count++;
            }
            prev = current;
        }

        System.out.println(count + " increases.");
    }
}