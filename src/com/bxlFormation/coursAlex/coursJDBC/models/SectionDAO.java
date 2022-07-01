package com.bxlFormation.coursAlex.coursJDBC.models;

import java.sql.*;
import java.util.*;

public class SectionDAO {
    private ArrayList<Section> sections = new ArrayList<>();

    public List<Section> getAllSections() {
        String query = "SELECT * FROM section";
        return searchWithQuery(query);
    }
    public Section getSectionWithId(int id){
        String query = "SELECT * FROM section as s WHERE s.section_id = "+id;
        this.searchWithQuery(query);
        return this.sections.size() > 0 ? this.sections.get(0) : null;
    }

    public List<Section> searchWithQuery(String query){
        this.sections = new ArrayList<>();
        try(
                Connection connection = ConnectionFactory.connection();
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(query)
        ){
            while ( result.next()){
                this.sections.add(new Section(result.getInt("section_id"),result.getString("section_name"),result.getInt("delegate_id")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return this.sections.stream().toList();
        }
        return this.sections.stream().toList();
    }
}
