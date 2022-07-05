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
        String query = "SELECT * FROM section WHERE section_id = "+id;
        this.searchWithQuery(query);
        return this.sections.size() > 0 ? this.sections.get(0) : null;
    }

    private List<Section> searchWithQuery(String query){
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

    public void insert(Section section){
        if (section == null)
            throw new IllegalArgumentException("la section en parametre est null");

        String query= "INSERT INTO section VALUES (?,?,?)";
        try(
            Connection connection = ConnectionFactory.connection();
            PreparedStatement statement = connection.prepareStatement(query);
        ){
            statement.setInt(1,section.getSection_id());
            statement.setString(2,section.getSectionName());
            if(section.getDelegate_id() == null)
                statement.setNull(3,section.getDelegate_id());
            else
                statement.setInt(3,section.getDelegate_id());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void delete(int id){
        String query= "DELETE FROM section WHERE section_id=" + id;
        try(
            Connection connection = ConnectionFactory.connection();
            Statement statement = connection.createStatement();
        ){
            if(statement.executeUpdate(query) != 1)
                throw new IllegalArgumentException("cette section n'existe pas dans la DB");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update (Section section){
        if (section == null)
            throw new IllegalArgumentException("la section en parametre est null");

        String query= "UPDATE section "+
                "SET section_name=?,delegate_id=? "+
                "WHERE section_id=?";
        try(
            Connection connection = ConnectionFactory.connection();
            PreparedStatement statement = connection.prepareStatement(query);
        ){
            statement.setString(1,section.getSectionName());
            if(section.getDelegate_id() == null)
                statement.setNull(2,Types.INTEGER);
            else
                statement.setInt(2,section.getDelegate_id());
            statement.setInt(3,section.getSection_id());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}