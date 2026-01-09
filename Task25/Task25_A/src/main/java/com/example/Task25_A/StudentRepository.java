package com.example.Task25_A;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Student student) {
        String sql="INSERT INTO student(name,email,age) VALUES (?,?,?)";
        return jdbcTemplate.update(sql,student.getName(),student.getEmail(),student.getAge());
    }

    // READ ALL
    public List<Student> findAll() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setAge(rs.getInt("age"));
            return s;
        });
    }

    // READ BY ID
    public Student findById(int id) {
        String sql = "SELECT * FROM student WHERE id=?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setAge(rs.getInt("age"));
            return s;
        }, id);
    }

    // UPDATE
    public int update(Student student) {
        String sql = "UPDATE student SET name=?, email=?, age=? WHERE id=?";
        return jdbcTemplate.update(sql,
                student.getName(),
                student.getEmail(),
                student.getAge(),
                student.getId());
    }

    // DELETE
    public int delete(int id) {
        String sql = "DELETE FROM student WHERE id=?";
        return jdbcTemplate.update(sql, id);
    }

}
