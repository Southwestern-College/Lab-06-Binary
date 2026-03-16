import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinaryTest {

    @Test
    void Zero() {
        assertEquals("0", Binary.toBinaryString(0));
    }

    @Test
    void One() {
        assertEquals("1", Binary.toBinaryString(1));
    }

    @Test
    void Two() {
        assertEquals("10", Binary.toBinaryString(2));
    }

    @Test
    void Three() {
        assertEquals("11", Binary.toBinaryString(3));
    }

    @Test
    void Four() {
        assertEquals("100", Binary.toBinaryString(4));
    }

    @Test
    void Five() {
        assertEquals("101", Binary.toBinaryString(5));
    }

    @Test
    void Six() {
        assertEquals("110", Binary.toBinaryString(6));
    }

    @Test
    void Seven() {
        assertEquals("111", Binary.toBinaryString(7));
    }

    @Test
    void Eight() {
        assertEquals("1000", Binary.toBinaryString(8));
    }

    @Test
    void Eleven() {
        assertEquals("1011", Binary.toBinaryString(11));
    }


    @Test
    void Max_Integer() {
        assertEquals("1111111111111111111111111111111", Binary.toBinaryString(Integer.MAX_VALUE));
    }
}
