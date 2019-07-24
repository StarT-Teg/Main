import javax.xml.transform.SourceLocator;
import java.io.*;
import java.util.*;

public class lesson_4 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

/*
        String d = reader.readLine();
        int a = Integer.parseInt(reader.readLine());
        Double a = Double.parseDouble(reader.readLine());
        boolean a = Boolean.parseBoolean(reader.readLine());
*/

/*      int[] myArray = new int [11]; //Фиксированный массив
        for (int i = 0; i < 3; i++) {
            myArray[i] = Integer.parseInt(reader.readLine()); }
        Arrays.sort(myArray); //Сортировка массива от макс - мин*/

        ArrayList<Integer> dList = new ArrayList<Integer>(); //Динамический массив
        float sum = 0;

        for (int i = 0; i >= 0; i++) {
            dList.add(Integer.parseInt(reader.readLine()));

            if (dList.get(i) != -1) {
                sum += dList.get(i);
            } else {
                System.out.println(sum / (dList.size() - 1));
                break;
            }

        }
    }
}

