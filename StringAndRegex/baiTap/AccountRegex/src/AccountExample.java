import java.util.regex.Pattern;

public class AccountExample {
    private static final String pattern = "[_a-z0-9]{6,}";
    public AccountExample() {}
    public boolean checkAccount(String account) {
        return Pattern.matches(pattern,account);
    }
}
