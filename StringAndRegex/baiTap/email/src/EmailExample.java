import java.util.regex.Pattern;

public class EmailExample {
    private static final String pattern="[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)";
    public EmailExample() {}

    public boolean checkEmail(String regex) {
        return Pattern.matches(pattern,regex);
    }
}
