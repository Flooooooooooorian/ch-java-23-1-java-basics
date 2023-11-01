import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingTest {


    @Test
    public void multiplyTest_when5Times6_thenReturn30() {
        //GIVEN
        int value1 = 5;
        int value2 = 6;

        //WHEN
        int actual = Testing.multiply(value1, value2);

        //THEN
        assertEquals(30, actual);
    }
}