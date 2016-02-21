import edu.petrov.lessons.generics.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 21/02/16.
 */
public class ArrayAlgTest {

    @Test
    public void testMin() throws Exception {

    }

    @Test
    public void testMinmax() throws Exception {
        Integer[] numbers = { 1, 2, 3, 4, 5 };
        Pair<Integer> result = ArrayAlg.minmax(numbers);

        final int[] expecteds = {1, 5};
        final int[] actuals = new int[2];
        actuals[0] = result.getFirst();
        actuals[1] = result.getSecond();

        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testGetMiddle() throws Exception {

    }
}