class Student {
    String name;
    int age;
    String DOB;

    Student(String name, int age, String DOB) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("DOB: " + DOB);
    }
}

public class Demo {

    public static void main(String[] args) {

        Student s1 = new Student("Shambhureddy", 19, "011/012/2005");
        s1.display();

    }

}