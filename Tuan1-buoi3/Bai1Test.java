import org.junit.Test;
import static org.junit.Assert.*;

public class Bai1Test {

    @Test
    public void testConversionWithSingleDigitNumber() {
        assertEquals("Expected conversion of single digit number is incorrect", "1", convertToBase16(1));
    }

    @Test
    public void testConversionWithMultipleDigitNumber() {
        assertEquals("Expected conversion of multiple digit number is incorrect", "1E", convertToBase16(30));
    }

    @Test
    public void testConversionWithLargeNumber() {
        assertEquals("Expected conversion of large number is incorrect", "7FFFFFFF", convertToBase16(Integer.MAX_VALUE));
    }

    private String convertToBase16(int n) {
        int b = 16;
        String s = "";
        while (n > 0) {
            int r = n % b;
            if (r < 10) {
                s = r + s;
            } else {
                s = (char) (r + 55) + s;
            }
            n /= b;
        }
        return s;
    }
}
