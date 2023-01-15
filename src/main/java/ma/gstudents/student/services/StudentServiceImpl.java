package ma.gstudents.student.services;

import ma.gstudents.student.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService{
List<Student> data = new ArrayList<Student>();
public boolean create(Student s){
    System.out.println("service:creat:Student "+s);
    data.add(s);
    System.out.println("DATA"+data);return true;
}
    public List<Student> select() {
        return null;
    }
    public boolean update (Student s){
        System.out.println("service:update:Student "+s);

        System.out.println("DATA"+data);return true;
    }
    public boolean delete (long id){
        System.out.println("service:delete:Student "+id);
        System.out.println("DATA"+data);return true;
    }
}
