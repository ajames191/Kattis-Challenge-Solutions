import org.junit.Assert;
import org.junit.Test;


public class MainTest {

    @Test
    public void test() {
        //we want to call a method and store the value in a variable
        int expected = 1;
        int actual = Main.solve(10, 6);

        int expected2 = 4;
        int actual2 = Main.solve(9, -13);

        //then ensure that the data returned is correct
        Assert.assertEquals(actual, expected);
        Assert.assertEquals(actual2, expected2);
    }

}