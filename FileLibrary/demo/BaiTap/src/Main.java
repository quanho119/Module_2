import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            UserManager.Refresh();
            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            while (choice != 3) {
                System.out.println("1. Hien thi danh sach");
                System.out.println("2. Them User");
                System.out.println("3. Thoat");
                String Input = scanner.nextLine();
                if (Input == null) {
                    System.out.println("khong co lua chon, vui long nhap lai");
                    continue;
                }
                choice = Integer.parseInt(Input);
                switch (choice) {
                    case 1:
                        ArrayList<User> users = UserManager.Read();
                        for (User user : users) {
                            System.out.println(user);
                        }
                        break;
                    case 2:
                        System.out.println("Nhap id: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhap name: ");
                        String name = scanner.nextLine();
                        User userAdd = new User(id, name);
                        UserManager.Write(userAdd);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("khong co lua chon, vui long nhap lai");
                        break;
                }
            }
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }
}