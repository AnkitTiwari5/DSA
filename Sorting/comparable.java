package Sorting;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{

    int age;
    public int getAge() {
        return age;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    String name;




    @Override
    public int compareTo(Student that) {
        if (this.age>that.age) 
        return 1;
        else
        return -1;
    }

}
public class comparable {
    public static void main(String[] args) {
       
        ArrayList<Student> studs=new ArrayList<Student>();
        studs.add(new Student(100, "qwerty"));
        studs.add(new Student(11, "dsewa"));
        studs.add(new Student(16, "ffff"));
        studs.add(new Student(9, "aaaa"));

        for (Student s : studs) {
            System.out.println(s.getName() + " - " + s.getAge());
        }

        Collections.sort(studs);
     
        for (Student s : studs) {
            System.out.println(s.getName() + " - " + s.getAge());
        }

    }
}
