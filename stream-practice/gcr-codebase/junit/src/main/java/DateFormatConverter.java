import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormatConverter {
    // This method is used to convert Date format from yyyy-MM-dd to dd-MM-yyyy
    public String formatDate(String inputDate) throws RuntimeException {
        String regex = "^\\b\\d{4}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputDate);
        if (matcher.matches()) {
            StringBuilder date = new StringBuilder();
            String year = inputDate.substring(0, 4);
            String month = inputDate.substring(5, 7);
            String day = inputDate.substring(8, 10);
            date.append(day);
            date.append("-");
            date.append(month);
            date.append("-");
            date.append(year);
            return date.toString();
        } else {
            throw new RuntimeException("Format not Matches");
        }
    }
}
