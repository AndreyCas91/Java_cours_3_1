import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestArray {
    IntegerArrays integerArrays;

    @Before
    public void init(){
        integerArrays = new IntegerArrays();
    }

    @Test
    public void arrTestCrop1(){
        final int[] actuals = new int[]{1, 2, 3, 6, 5};
        Assert.assertThrows(RuntimeException.class, () -> {integerArrays.intArrayCrop(actuals);});
    }

}
