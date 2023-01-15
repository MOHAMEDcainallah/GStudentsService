package ma.gstudents.student.repositories;

import ma.gstudents.student.models.Student;

import java.util.List;

public interface IStudentRepository {
    boolean create (Student s);
    boolean update (Student s);
    boolean delete (long id);
    List <Student> select();


}
