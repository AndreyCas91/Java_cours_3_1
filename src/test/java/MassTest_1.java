import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MassTest_1 {
    private int[] expecteds;
    private int[] actuals;
    IntegerArrays integerArrays;

    public MassTest_1(int[] expecteds, int[] actuals) {
        this.expecteds = expecteds;
        this.actuals = actuals;
    }

    @Parameterized.Parameters
    public static int[][][] data(){
        return new int[][][]{
                {{5}, {1, 4, 5}},
                {{3, 2}, {1, 2, 3, 4, 3, 2}}
        };
    }

    @Before
    public void init(){
        integerArrays = new IntegerArrays();
    }

    @Test
    public void arrTestCrop(){
        Assert.assertArrayEquals(expecteds, integerArrays.intArrayCrop(actuals));
    }
}
