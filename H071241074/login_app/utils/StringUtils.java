package login_app.utils;

public class StringUtils {
    public static String generateNickName(String fullName) {
        String[] parts = fullName.trim().split(" ");
        return parts[0].toLowerCase(); 
    }
}





