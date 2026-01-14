package junit.date_formatter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DateFormatConverterTest {
    DateFormatConverter date = new DateFormatConverter();

    // This test is used to check the formatDate method of DateFormatConverter class with valid dates
    @Test
    public void testValidDate() throws RuntimeException {
        assertEquals("04-08-2004", date.formatDate("2004-08-04"));
    }

    // This test is used to check the formatDate method of DateFormatConverter class with different invalid dates
    @ParameterizedTest
    @ValueSource(strings = {"2031/01/04", "20-11-41", "14-01-2026"})
    public void invalidFormate(String d) throws RuntimeException {
        assertThrows(RuntimeException.class, () -> date.formatDate(d));
    }
}
