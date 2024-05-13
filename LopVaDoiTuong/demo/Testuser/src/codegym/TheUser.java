package codegym;

public class TheUser {
    public int id;
    public String name;
    public static String group="C0224M1";
    private String email;
    String password;
    public TheUser(int id, String name,String email,String password) {
        this.id = id;
        this.name = name;
        this.email=email;
        this.password=password;
    }
    public static String getGroup() {
        return TheUser.group;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}
