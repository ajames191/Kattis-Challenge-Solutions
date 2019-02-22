import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void forgotTheSyntax() {
        int[] expected = {1, 0, 0, 0, 0, 1};
        int[] actual = Main.solve(0, 1, 2, 2, 2, 7);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void minusTest() {
        int[] expected = {-1, 0, 0, 1, 0, 7};
        int[] actual = Main.solve(2, 1, 2, 1, 2, 1);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

}