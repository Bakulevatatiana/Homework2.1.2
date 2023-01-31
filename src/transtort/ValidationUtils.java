package transtort;

public class ValidationUtils {
    public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public static int validOrDefault(int value, int defaultValue) {
        if (value == 0) {
            return defaultValue;
        } else {
            return value;
        }
    }
}
