public class User {
    //ds thuoc tinh
    // thuoc tinh: id, name,email,password
    public int id;
    public String name;
    public String email;
    public String password;
    // phuong thuc khoi tao -> khoi tao doi tuong
    // dat gia tri ban dau cho thuoc tinh
    // nhieu phuong thuc khoi tao (khac nhau boi gia tri nhap vao)
    public User() {

    }
    public User(int id, String name, String email, String password) {
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
    }
    public User(int id, String name, String email) {
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public String getName() {
        return this.name;
    }
    public String getInfo(){
        return "ID: "+this.id+" Name: "+this.name+" Email: "+this.email+" Password: "+this.password;
    }
    public void setname(String Name)
    {
        this.name=Name;
    }
}
