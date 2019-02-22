import org.junit.Assert;
import org.junit.Test;


public class MainTest {

    @Test
    public void doesItFit() {
        String actual = Main.doesItFit(3, 4, 4);
        String actual2 = Main.doesItFit(3, 4, 5);
        String actual3 = Main.doesItFit(3, 4, 6);


        Assert.assertEquals("DA", actual);
        Assert.assertEquals("DA", actual2);
        Assert.assertEquals("NE", actual3);

        // so, 4 and 5 should be "DA" and 6 should be "NE"
        // we expect 4 to pass regardless, 5 if diagnol works, and 6 should verify
        // that it doesnt pass because its actually broken
    }
}