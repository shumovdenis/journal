package ru.shumovdenis.journal.service;

import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;
import ru.shumovdenis.journal.entity.Student;
import ru.shumovdenis.journal.repository.StudentRepo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    public List<Student> getStudents() {
        SqlRowSet result = studentRepo.getStudents();
        List<Student> studentsList = new ArrayList<>();
        while (result.next()) {
            Student student = new Student(
                    result.getInt(1),
                    result.getString(2),
                    result.getString(3),
                    result.getString(4),
                    result.getDate(5),
                    result.getString(6)
            );
            studentsList.add(student);
        }
        return studentsList;
    }


    public void add(String name, String surname, String middlename, Date bDay, String group) {
        Student student = new Student(name, surname, middlename, bDay, group);
        studentRepo.add(student);
    }

    public void delete(int id) {
        studentRepo.delete(id);
    }

}
