package com.bxlFormation.coursAlex.coursJDBC;

import com.bxlFormation.coursAlex.coursJDBC.models.Section;
import com.bxlFormation.coursAlex.coursJDBC.models.SectionDAO;
import com.bxlFormation.coursAlex.coursJDBC.models.Student;
import com.bxlFormation.coursAlex.coursJDBC.models.StudentDAO;
import com.mysql.cj.protocol.a.LocalDateTimeValueEncoder;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //        region Demo (en commentaire)
//        String url = "jdbc:mysql://127.0.0.1:3306/dbslide";
//        String username = "root";
//        String password = "";
//
//        try (
//                Connection connection = DriverManager.getConnection(url,username,password);
//                Statement statement = connection.createStatement();
//                ResultSet result = statement.executeQuery("SELECT * FROM student");
//        ){
//            while ( result.next()){
//                System.out.printf("\nnom : %s  -  resultat annuel : %s",result.getString("first_name"), result.getString("year_result"));
//            }
//        } catch (SQLException e) {
//            System.out.println("echec connection");
//            e.printStackTrace();
//        }
        //    endregion

        SectionDAO sectionDAO = new SectionDAO();
        StudentDAO studentDAO = new StudentDAO();

        //region sectionDao exos (en commentaire)
//        System.out.println(sectionDAO.getAllSections());
//        System.out.println("===================================");
//        System.out.println(sectionDAO.getSectionWithId(1320));
//        System.out.println("===================================");
//        Section section1 = new Section(1111,"injection1,1010),(5,injection2,1030),(10,nom",123);
//        Section section2 = new Section(1111,"nom",123);
//        sectionDAO.insert(section1);
//        sectionDAO.update(section2);
//        sectionDAO.delete(1111);
        //endregion

        //region studentDao exos (en commentaire)
//        System.out.println(studentDAO.getAllStudents());
//        System.out.println("===================================");
//        System.out.println(studentDAO.getStudentWithId(26));
//        System.out.println("===================================");
//        Student student1 = new Student(
//                26,
//                "yassin",
//                "makrai",
//                LocalDate.of(1992, 06, 21),
//                "yaya",
//                sectionDAO.getSectionWithId(1020),
//                100,
//                "EG2050"
//        );
//        Student student2 = new Student(
//                26,
//                "hello",
//                "world",
//                LocalDate.of(1992, 06, 21),
//                "yaya",
//                sectionDAO.getSectionWithId(1020),
//                100,
//                "EG2050"
//        );
//        studentDAO.insert(student1);
//        studentDAO.update(student2);
//        studentDAO.delete(26);
        //endregion

        studentDAO.transfertFromSectionToSection(sectionDAO.getSectionWithId(1111),sectionDAO.getSectionWithId(1020));
    }
}
