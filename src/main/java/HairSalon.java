import java.util.Arrays;
import java.util.List;

public class HairSalon {

    private final String[] openingDays = {"Monday", "Tuesday"};

    // This method should return the openingDays array.
    public String[] getOpeningDays() {
        return openingDays;
    }

    // This method should return true if the weekday passed in is present in the openingDays array.
    // If not it should return false. If the String passed in does not end in the letters "day",
    // it should throw an IllegalArgumentException with a message explaining that only weekdays are valid.
    public boolean isOpen(String weekDay) {
        if (!weekDay.endsWith("day")) {
            throw new IllegalArgumentException("You need to input a weekday");
        }
        List<String> openingList = Arrays.asList(openingDays);
        return openingList.contains(weekDay);
    }






}
