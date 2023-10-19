package test;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private  int age;

    public int getAge() {
        return age;
    }

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if( o1.getAge()>o2.getAge()){
            return 1;
        }
        else if (o1.getAge()<o2.getAge()){
            return -1;
        }
        {
            return 0;
        }
    }
}
