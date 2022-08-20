public class Encapsulation {
    private String myname;
    private int myage;
    private String myaddress;
    //getters
    public String getname() {
        return myname;
    }
    public int getage() {
        return myage;
    }
    public String getaddress() {
        return myaddress;
    }
    //setters
    public void setname(String newName) {
        myname = newName;
    }
    public void setage(int newAge) {
        myage = newAge;
    }
    public void setaddress(String newAddress) {
        myaddress = newAddress;
    }
} 
class Printinfo {
    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();
        myObj.setname("Ruman Sukhera");
        myObj.setage(17);
        myObj.setaddress("Islamabad");
        System.out.println("My Name is "+myObj.getname());
        System.out.println("My Age is "+myObj.getage());
        System.out.println("My Address is "+myObj.getaddress());
    }
}