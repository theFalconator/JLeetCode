import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<Integer, String> cols;

    public Solution() {
        cols = new HashMap<>();

        cols.put(1, "A");
        cols.put(2, "B");
        cols.put(3, "C");
        cols.put(4, "D");
        cols.put(5, "E");
        cols.put(6, "F");
        cols.put(7, "G");
        cols.put(8, "H");
        cols.put(9, "I");
        cols.put(10, "J");
        cols.put(11, "K");
        cols.put(12, "L");
        cols.put(13, "M");
        cols.put(14, "N");
        cols.put(15, "O");
        cols.put(16, "P");
        cols.put(17, "Q");
        cols.put(18, "R");
        cols.put(19, "S");
        cols.put(20, "T");
        cols.put(21, "U");
        cols.put(22, "V");
        cols.put(23, "W");
        cols.put(24, "X");
        cols.put(25, "Y");
        cols.put(26, "Z");
    }

    public String convertToTitle(int n) {
        if (n < 27) {
            return cols.get(n);
        }
        return "";
    }
}
