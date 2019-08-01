import java.util.HashMap;
import java.util.Map;

public class lambda {

        public static Map<String, Integer> createMap() {

            Map<String, Integer> map = new HashMap<String, Integer>();

            map.put("Аврамишин", 100);
            map.put("Бернадский", 200);
            map.put("Котик", 300);
            map.put("Царук", 400);
            map.put("fgdgк", 500);
            map.put("Бартош", 600);
            map.put("Жмурак", 700);
            map.put("Красько", 800);
            map.put("Ковальчук", 900);
            map.put("Волошин", 1000);

            return map;
        }

        public static void removeItemFromMap(Map<String, Integer> map) {

            map.values().removeIf(x -> x < 500);

            /*
            map. - обращение к списку;
            values() - поулчение всех значений списка;
            removeIf - вызов "удалить если";
            (x -> x < 500) - первый х = перебор values;
            -> = выполнить следующее условие;
            x < 500 = условие)
            */

        }

        public static void main(String[] args) {

        }
    }
