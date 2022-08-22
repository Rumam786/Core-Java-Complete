class Students {
    String name;
    int age;
    public void Printinfo(String name) {
        System.out.println(name);
    }
}
class Students1 extends Students {
    public void Printinfo(int age) {
        System.out.println(age);
    }
}
class Students2 extends Students1 {
    public void Printinfo(String name, int age) {
        System.out.println(name+age);
    }
}
class Overloading {
    public static void main(String[] args) {
        Students2 s1 = new Students2();
        s1.name = "Ruman Ali";
        s1.age = 17;
        s1.Printinfo(s1.name);
        s1.Printinfo(s1.age);
        s1.Printinfo(s1.name, s1.age);
    }
}