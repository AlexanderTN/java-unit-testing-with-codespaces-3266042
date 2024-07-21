import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        String[] expectedDays = new String[]{"Monday", "Tuesday"};
        String[] actualDays = hairSalon.getOpeningDays();
        assertArrayEquals(expectedDays, actualDays);
    }

    @Test
    public void testSalonIsOpenOnMonday() {
        boolean actual = hairSalon.isOpen("Monday");
        assertTrue(actual);
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
        boolean actual = hairSalon.isOpen("Wednesday");
        assertFalse(actual);
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            hairSalon.isOpen("bandeau") );
        String expectedMessage = "You need to input a weekday";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

}