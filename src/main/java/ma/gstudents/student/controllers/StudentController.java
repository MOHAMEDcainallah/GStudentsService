package ma.gstudents.student.controllers;

import ma.gstudents.student.models.Student;
import ma.gstudents.student.services.IStudentService;
import ma.gstudents.student.services.StudentServiceImpl;

public class StudentController {
    IStudentService s=new StudentServiceImpl();

    public boolean create(Student O) {
        System.out.println("controller:create:student" + O);
        return s.create(O);
    }
    public boolean update(Student O) {
        System.out.println("controller:update:student" + O);
        return s.update(O);
    }
    public boolean delete(long id) {
        System.out.println("controller:delete:student" + id);
        return s.delete(id);


    }
}
