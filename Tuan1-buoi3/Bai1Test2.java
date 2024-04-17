import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class Bai1Test2 {

    @Test
    public void testInputLessThan10() {
        ByteArrayInputStream in = new ByteArrayInputStream("7".getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Bai1.main(new String[]{});
        assertEquals("Conversion of single digit number is incorrect", "So vua nhap o he co so B la: 7\n", out.toString());
    }

    @Test
    public void testInputGreaterThan10() {
        ByteArrayInputStream in = new ByteArrayInputStream("15".getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Bai1.main(new String[]{});
        assertEquals("Conversion of two digit number is incorrect", "So vua nhap o he co so B la: F\n", out.toString());
    }

    @Test
    public void testMaxInput() {
        ByteArrayInputStream in = new ByteArrayInputStream("2147483647".getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Bai1.main(new String[]{});
        assertEquals("Conversion of large number is incorrect", "So vua nhap o he co so B la: 7FFFFFFF\n", out.toString());
    }
}
