package ru.shumovdenis.journal.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;
import ru.shumovdenis.journal.entity.Student;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbcTemplate;

    public StudentRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public SqlRowSet getStudents() {
        SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet("SELECT * FROM student");
        return sqlRowSet;
    }

    public void add(Student student) {
        jdbcTemplate.update("INSERT INTO student (name, surname, middlename, bDay, groupName)" +
                        " VALUES (?,?,?,?,?)",
                student.getName(),
                student.getSurname(),
                student.getMiddlename(),
                student.getbDay(),
                student.getGroup());
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM student WHERE id = ?", id);
    }
}
