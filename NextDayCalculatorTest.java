import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
    @Test
    public void testNgay1Thang1Nam2018() {
        String expected = "2/1/2018";
        String result = NextDayCaculator.showNextDay(1, 1, 2018);
        assertEquals(expected, result);
    }

    @Test
    public void testNgay31Thang1Nam2018() {
        String expected = "1/2/2018";
        String result = NextDayCaculator.showNextDay(31, 1, 2018);
        assertEquals(expected, result);
    }

    @Test
    public void testNgay30Thang4Nam2018() {
        String expected = "1/5/2018";
        String result = NextDayCaculator.showNextDay(30, 4, 2018);
        assertEquals(expected, result);
    }

    @Test
    public void testNgay28Thang2Nam2018() {
        String expected = "1/3/2018";
        String result = NextDayCaculator.showNextDay(28, 2, 2018);
        assertEquals(expected, result);
    }

    @Test
    public void testNgay29Thang2Nam2020() {
        String expected = "1/3/2020";
        String result = NextDayCaculator.showNextDay(29, 2, 2020);
        assertEquals(expected, result);
    }

    @Test
    public void testNgay31Thang12Nam2019() {
        String expected = "1/1/2020";
        String result = NextDayCaculator.showNextDay(31, 12, 2019);
        assertEquals(expected, result);
    }
}
