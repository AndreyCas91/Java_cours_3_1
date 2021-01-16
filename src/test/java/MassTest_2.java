import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MassTest_2 {
    private int[] actuals;
    IntegerArrays integerArrays;

    public MassTest_2(int[] actuals) {
        this.actuals = actuals;
    }

    @Parameterized.Parameters
    public static int[][] data(){
        return new int[][]{
                {1, 1, 1, 4, 1, 4},
                {1, 1, 1, 1, 1, 1},
                {4, 4, 1, 4, 1, 4},
                {1, 2, 1, 4, 1, 4}
        };
    }

    @Before
    public void init(){
        integerArrays = new IntegerArrays();
    }

    @Test
    public void arrTest(){
        Assert.assertTrue(integerArrays.intArray(actuals));
    }

}
