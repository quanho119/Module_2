/*
khai bao class person: id,name,email.address,role;
Cac thuoc tinh deu la private
Khai bao cac phuong thuc get/set cho tung thuoc tinh
*main
tao 1 mang chua 5 object person
in ra ds co role =2
 */
public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0]=new Person(1,"nam","nam@gmail.com","1 Pham",1);
        people[1]=new Person(2,"dung","dung@gmail.com","2 Nguyen",3);
        people[2]=new Person(3,"cuong","cuong@gmail.com","3 Ly",2);
        people[3]=new Person(4,"dat","dat@gmail.com","4 Tran",1);
        people[4]=new Person(5,"Long","Long@gmail.com","7 Ho",2);
        Person[] peopleRole2=new Person[5];
        int count=0;
        for(Person p: people) {
            if(p.getRole()==2){
                peopleRole2[count].setId(p.getId());
                peopleRole2[count].setName(p.getName());
                peopleRole2[count].setEmail(p.getEmail());
                peopleRole2[count].setAddress(p.getAddress());
                peopleRole2[count].setRole(p.getRole());
            }
        }
        for(Person p: peopleRole2)
        {
            System.out.println(p);
        }
    }

}