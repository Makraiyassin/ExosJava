package com.bxlFormation.coursAlex.coursJDBC.models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        String query = "SELECT * "+
                "FROM student "+
                "JOIN section on student.section_id = section.section_id ";
        return searchWithQuery(query);
    }

    public Student getStudentWithId(int id){
        String query = "SELECT * "+
                "FROM student "+
                "JOIN section on student.section_id = section.section_id "+
                "WHERE student_id = "+id;
        this.searchWithQuery(query);
        return this.students.size() > 0 ? this.students.get(0) : null;
    }

    private List<Student> searchWithQuery(String query){
        this.students = new ArrayList<>();
        try(
                Connection connection = ConnectionFactory.connection();
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(query)
        ){
            while ( result.next()){
                this.students.add(new Student(
                        result.getInt("student_id"),
                        result.getString("first_name"),
                        result.getString("last_name"),
                        result.getDate("birth_date").toLocalDate(),
                        result.getString("login"),
                        new Section(result.getInt("section_id"),result.getString("section_name"), result.getInt("delegate_id")),
                        result.getInt("year_result"),
                        result.getString("course_id")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return this.students.stream().toList();
        }
        return this.students.stream().toList();
    }

    public Student insert(Student student){
        if (student == null)
            throw new IllegalArgumentException("la student en parametre est null");

        String query= "INSERT INTO student VALUES (?,?,?,?,?,?,?,?)";
        try(
            Connection connection = ConnectionFactory.connection();
            PreparedStatement statement = connection.prepareStatement(query);
        ){
            statement.setInt(1,student.getStudent_id());
            statement.setString(2,student.getFirst_name());
            statement.setString(3,student.getLast_name());
            statement.setDate(4,Date.valueOf(student.getBirth_date()));
            statement.setString(5,student.getLogin());
            statement.setInt(6,student.getSection().getSection_id());
            statement.setInt(7,student.getYear_result());
            statement.setString(8,student.getCourse_id());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    public Student delete(int id){
        String query= "DELETE FROM student WHERE student_id=" + id;
        try(
            Connection connection = ConnectionFactory.connection();
            Statement statement = connection.createStatement();
        ){
            Student student = this.getStudentWithId(id);
            if(statement.executeUpdate(query) != 1)
                throw new IllegalArgumentException("cet student n'existe pas dans la DB");
            return student;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean update (Student student){
        if (student == null)
            throw new IllegalArgumentException("la student en parametre est null");

        String query= """
                UPDATE student 
                SET first_name=?,
                last_name=?,
                birth_date=?,
                login=?,
                section_id=?,
                year_result=?,
                course_id=? 
                WHERE student_id=?
""";

        try(
            Connection connection = ConnectionFactory.connection();
            PreparedStatement statement = connection.prepareStatement(query);
        ){
            statement.setString(1,student.getFirst_name());
            statement.setString(2,student.getLast_name());
            statement.setDate(3,Date.valueOf(student.getBirth_date()));
            statement.setString(4,student.getLogin());
            statement.setInt(5,student.getSection().getSection_id());
            statement.setInt(6,student.getYear_result());
            statement.setString(7,student.getCourse_id());
            statement.setInt(8,student.getStudent_id());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void transfertFromSectionToSection(Section s1, Section s2){
        String query = """
                SELECT * FROM student
                JOIN section on student.section_id = section.section_id
                WHERE student.section_id ="""+s1.getSection_id();
        List<Student> students = searchWithQuery(query);
        students.forEach(s->{
            this.update(
                    new Student(
                            s.getStudent_id(),
                            s.getFirst_name(),
                            s.getLast_name(),
                            s.getBirth_date(),
                            s.getLogin(),
                            s2,
                            s.getYear_result(),
                            s.getCourse_id()
                    )
            );
        });
    }
}
