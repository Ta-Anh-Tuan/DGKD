import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerArrayTest {
    private IntegerArray integerArray;

    @BeforeEach
    void setUp() {
        Integer[] arr = {1, 2, 3, 4, 5};
        integerArray = new IntegerArray(arr);
    }

    @Test
    void testCount() {
        assertEquals(5, integerArray.Count());
    }

    @Test
    void testSearchExistingElement() {
        assertTrue(integerArray.Search(3));
    }

    @Test
    void testSearchNonExistingElement() {
        assertFalse(integerArray.Search(6));
    }

    @Test
    void testDeleteElement() {
        integerArray.Delete(2);
        assertEquals(4, integerArray.Count());
        assertFalse(integerArray.Search(3));
    }

    @Test
    void testDeleteOutOfBoundsIndex() {
        integerArray.Delete(10); // Index out of bounds
        assertEquals(5, integerArray.Count()); // Size should remain the same
    }
}