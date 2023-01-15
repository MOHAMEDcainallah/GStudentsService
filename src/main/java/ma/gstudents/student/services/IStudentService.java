package ma.gstudents.student.services;

import ma.gstudents.student.models.Student;

import java.util.List;

public interface IStudentService {
    boolean create(Student s );
    boolean update (Student s);
    boolean delete (long id );
    List <Student> select();
}
