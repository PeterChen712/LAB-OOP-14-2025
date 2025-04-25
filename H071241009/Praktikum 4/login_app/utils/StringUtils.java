package utils;

public class StringUtils {
    public static String getNickName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        if (parts.length == 1) {
            return fullName;
        } else {
            return parts[1];
        }
    }
}

