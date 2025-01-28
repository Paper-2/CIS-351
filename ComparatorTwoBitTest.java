import org.junit.Assert;
import org.junit.Test;

import static edu.gvsu.dlunit.DLUnit.*;

public class ComparatorTwoBitTest {

    @Test
    public void zero_is_lower_zero() {
        setPinUnsigned("InputA", 0);
        setPinUnsigned("InputB", 0);
        run();
        Assert.assertEquals(0, readPinUnsigned("Output"));
    }

    @Test
    public void zero_one() {
        setPinUnsigned("InputA", 0);
        setPinUnsigned("InputB", 1);
        run();
        Assert.assertEquals(1, readPinUnsigned("Output"));
    }

    @Test
    public void zero_two() {
        setPinUnsigned("InputA", 0);
        setPinUnsigned("InputB", 2);
        run();
        Assert.assertEquals(1, readPinUnsigned("Output"));
    }

    @Test
    public void zero_three() {
        setPinUnsigned("InputA", 0);
        setPinUnsigned("InputB", 3);
        run();
        Assert.assertEquals(1, readPinUnsigned("Output"));
    }

    @Test
    public void three_three() {
        setPinUnsigned("InputA", 3);
        setPinUnsigned("InputB", 3);
        run();
        Assert.assertEquals(0, readPinUnsigned("Output"));
    }


}