package com.bxlFormation.coursAlex.coursJDBC;

import com.bxlFormation.coursAlex.coursJDBC.models.Section;
import com.bxlFormation.coursAlex.coursJDBC.models.SectionDAO;

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

        SectionDAO dao = new SectionDAO();
//        System.out.println(dao.getAllSections());
//        System.out.println("===================================");
//        System.out.println(dao.getSectionWithId(1320));
//        System.out.println("===================================");
        Section section1 = new Section(2222,"injection1,1010),(5,injection2,1030),(10,nom",123);
        Section section2 = new Section(1111,"nom",123);
        Section section3 = new Section(1111,"new name",null);
        Section section4 = new Section(2222,"new name2",null);
        dao.delete(1111);
        dao.delete(2222);
        dao.insert(section1);
        dao.insert(section2);
        dao.update(section3);
        dao.update(section4);
    }
}
