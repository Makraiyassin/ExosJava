package com.bxlFormation.coursAlex.coursJDBC;

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
        System.out.println(dao.getAllSections());
        System.out.println("===================================");
        System.out.println(dao.getSectionWithId(1320));
    }
}
