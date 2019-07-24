import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class max_in_array {

        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
/*        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());*/

            int[] myArray = new int [4];
            for (int i = 0; i < 4; i++) {
                myArray[i] = Integer.parseInt(reader.readLine()); }

            System.out.println(Arrays.stream(myArray).max().getAsInt());
        }
    }