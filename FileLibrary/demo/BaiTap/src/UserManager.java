import java.io.*;
import java.util.ArrayList;

public class UserManager {
    public static void Refresh() throws IOException{
        File userData = new File("./src/data.txt");
        FileWriter fw = new FileWriter(userData);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("");
        bw.close();
    }
    public static void Write(User userAdd) throws IOException{
        File userData = new File("./src/data.txt");
        FileWriter fw = new FileWriter(userData,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(userAdd.getInfo());
        bw.close();
    }
    public static ArrayList<User> Read() throws IOException{
        
        File userData = new File("./src/data.txt");
        FileReader fr = new FileReader(userData);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<User> users = new ArrayList<User>();
        String contentOfLine=null;
        while((contentOfLine = br.readLine()) != null){
            int id= Integer.parseInt(contentOfLine.split(",")[0]);
            String name= contentOfLine.split(",")[1];
            users.add(new User(id, name));
        }
        return users;
    }
}
