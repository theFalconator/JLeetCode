package daily347;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class Daily347 {
    public static int getLights(String[] input) {
        List<BitSet> roomTimes = new ArrayList<>();
        for (String line : input) {
            Scanner sc = new Scanner(line);
            BitSet bs = new BitSet();
            bs.set(sc.nextInt(), sc.nextInt());
            roomTimes.add(bs);
        }

        BitSet times = new BitSet();
        for (BitSet bs : roomTimes) {
            times.or(bs);
        }

        return times.cardinality();
    }
}
