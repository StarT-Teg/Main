import javax.xml.transform.SourceLocator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;
import java.text.*;


public class WOrk_Space {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] myArray = new int [5];
        for (int i = 0; i < 5; i++) {
            myArray[i] = Integer.parseInt(reader.readLine()); }

        System.out.println("Minimum = " + min(myArray));
    }

    public static int min(int [] minArray) {
        return Arrays.stream(minArray).min().getAsInt();
    }
}