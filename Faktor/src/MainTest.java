import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test() {
        int expected = 875;
        double actual = Main.solve(38, 24);

        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test
    public void test2() {
        int expected = 100;
        double actual = Main.solve(1, 100);

        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test
    public void test3() {
        int expected = 91;
        double actual = Main.solve(10, 10);

        Assert.assertEquals(actual, expected, 0.1);
    }

}