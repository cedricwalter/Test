import org.junit.*;
import com.test.Test;

public class TestTest {

    @org.junit.Test
    public void ctor_expectValue() {
        Test test = new Test("123");

        Assert.assertEquals("123", test.getField());
    }


}
