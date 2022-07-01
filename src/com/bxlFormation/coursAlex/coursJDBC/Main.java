package com.bxlFormation.coursAlex.coursJDBC;

import java.sql.*;

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
        System.out.println(sectionDAO.getAllSections());
        System.out.println("===================================");
        System.out.println(sectionDAO.getSectionWithId(1020));
    }
}
