import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testChant() {
        // Given
        int number = 2;
        String expected1 = "1 Abracadabra";
        String expected2 = "2 Abracadabra";

        // When
        ArrayList actual = Main.chant(number);
        // this error is because the method
        // isnt returning anything and is void, no return means nothing to store in
        // actual
        // so we need to somehow return something, that we can save here, and verify in the Then

        // Then

        assertEquals(actual.size(), number);
        assertEquals(actual.get(0), expected1);
        assertEquals(actual.get(1), expected2);
    }
}
