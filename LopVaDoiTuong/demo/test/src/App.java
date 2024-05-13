public class App {
    public static void main(String[] args) {
        User user =new User(1,"John","John@gmail.com","1234");
        User user2=new User(2,"nam","nam@gmail.com","1234");
        User[] lis= new User[10];
        lis[0]=user;
        lis[1]=user2;
        for (User u:lis)
        {
            if(u!=null){
                System.out.println(u.getInfo());
            }
        }
    }

}