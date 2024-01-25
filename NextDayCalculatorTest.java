import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
    @Test
    public void testNgay1Thang1Nam2018(){
        int day = 1;
        int thang = 1;
        int nam = 2018;
        String expected = "2/1/2018";
        String result = NextDayCaculator.showNextDay(1, 1, 2018);
        assertEquals(expected, result);
    }
    @Test
    public void testNgay31Thang1Nam2018(){
        int day = 31;
        int thang = 1;
        int nam = 2018;
        String expected = "1/2/2018";
        String result = NextDayCaculator.showNextDay(31, 1, 2018);
        assertEquals(expected, result);
    }
}
