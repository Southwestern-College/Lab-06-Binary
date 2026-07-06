import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BinaryTest {
    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 10",
            "3, 11",
            "4, 100",
            "5, 101",
            "6, 110",
            "7, 111",
            "8, 1000",
            "2147483647, 1111111111111111111111111111111"
    })
    void test(int input, String expected) {
        assertEquals(expected, Binary.toBinaryString(input));
    }
}
