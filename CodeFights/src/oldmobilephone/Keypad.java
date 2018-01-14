package oldmobilephone;

import java.util.HashMap;
import java.util.Map;

public class Keypad {

    private static Map<Character, Integer> keys;

    private static void BuildKeys() {
        keys = new HashMap<>();
        keys.put('A', 1);
        keys.put('D', 1);
        keys.put('G', 1);
        keys.put('J', 1);
        keys.put('M', 1);
        keys.put('P', 1);
        keys.put('T', 1);
        keys.put('W', 1);
        keys.put(' ', 1);

        keys.put('B', 2);
        keys.put('E', 2);
        keys.put('H', 2);
        keys.put('K', 2);
        keys.put('N', 2);
        keys.put('Q', 2);
        keys.put('U', 2);
        keys.put('X', 2);

        keys.put('C', 3);
        keys.put('F', 3);
        keys.put('I', 3);
        keys.put('L', 3);
        keys.put('O', 3);
        keys.put('R', 3);
        keys.put('V', 3);
        keys.put('Y', 3);

        keys.put('S', 4);
        keys.put('Z', 4);

        keys.put('1', 1);
        keys.put('2', 4);
        keys.put('3', 4);
        keys.put('4', 4);
        keys.put('5', 4);
        keys.put('6', 4);
        keys.put('7', 5);
        keys.put('8', 4);
        keys.put('9', 5);
        keys.put('0', 2);

        keys.put('*', 1);
        keys.put('#', 1);
    }

    public static int presses(String phrase) {
        if (phrase == null)
            return 0;

        BuildKeys();
        int sum = 0;
        for (Character c : phrase.toCharArray()) {

            if(keys.containsKey(Character.toUpperCase(c)))
                sum += keys.get(c);

        }
        return sum;
    }
}
