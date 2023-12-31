package OOP.Chapter8.Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
    }
}

public class ObjectSerialization {

    public static void main(String[] args) {
        try {
            Student s1 = new Student("John", 18, 5);
            System.out.println(s1);
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("obj.dat"));
            out.writeObject(s1);
            out.close();
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("obj.dat"));
            Student s2 = (Student) in.readObject();
            in.close();
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
