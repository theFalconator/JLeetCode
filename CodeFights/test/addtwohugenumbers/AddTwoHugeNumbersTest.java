package addtwohugenumbers;

import org.junit.Test;

import static org.junit.Assert.*;
import static addtwohugenumbers.AddTwoHugeNumbers.addTwoHugeNumbers;
import static addtwohugenumbers.AddTwoHugeNumbers.buildFromIntArray;
import static addtwohugenumbers.AddTwoHugeNumbers.reverse;

public class AddTwoHugeNumbersTest {

    @Test
    public void addSingleDigitNumber() {
        assertEquals((Integer)3, addTwoHugeNumbers(buildFromIntArray(new int[] {1}), buildFromIntArray(new int[] {2})).value);
    }
}