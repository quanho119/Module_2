public class Main {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean check = emailExample.checkEmail(email);
            System.out.println(email + ": " + check);
        }
        for (String email : invalidEmail) {
            boolean check = emailExample.checkEmail(email);
            System.out.println(email + ": " + check);
        }
    }
}