package com.bxlFormation.coursAlex.coursJDBC;

import java.sql.*;
import java.util.*;

public class SectionDAO {
    String url = "jdbc:mysql://127.0.0.1:3306/dbslide";
    String username = "root";
    String password = "";

    ArrayList<Section> sections = new ArrayList<Section>();

    public List<Section> getAllSections() {
        try (
                Connection connection = DriverManager.getConnection(url,username,password);
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery("SELECT * FROM section");
        ){
            while ( result.next()){
                Section section = new Section(result.getInt("section_id"),result.getString("section_name"),result.getInt("delegate_id"));
                sections.add(section);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (new ArrayList<Section>(sections)).stream().toList();
    }
    public Section getSectionWithId(int id){
        try(
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM section");
        ){
            while ( result.next()){
                if(result.getInt("section_id") == id) {
                    Section section = new Section(result.getInt("section_id"),result.getString("section_name"),result.getInt("delegate_id"));
                    return section;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
