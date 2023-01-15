package ma.gstudents.student.repositories;

import ma.gstudents.student.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository{


    List<Student> data = new ArrayList<Student>();
    public boolean create(Student s){
        System.out.println("Repository:creat:Student "+s);
        data.add(s);
        System.out.println("DATA"+data);return true;
   }

    public List<Student> select() {
        return null;
    }

    public boolean update (Student s){
        System.out.println("Repository:update:Student "+s);

        System.out.println("DATA"+data);return true;
    }
    public boolean delete (long id){
        System.out.println("Repository:delete:Student "+id);
        System.out.println("DATA"+data);return true;
    }
}

