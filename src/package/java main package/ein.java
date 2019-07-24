import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ein {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Я буду зарабатывать $" + reader.readLine() + " в час");
        }
}