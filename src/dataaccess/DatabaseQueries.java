/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logic.Visitor;
/**
 *
 * @author zaido
 */
public class DatabaseQueries {
    private DatabaseConnection databaseConnection;
    
    public DatabaseQueries() {
        databaseConnection = new DatabaseConnection();
    }
    
    public List<Visitor> getVisitorsByDate(String date) {
        List<Visitor> visitors = new ArrayList<>();
        String query = "SELECT * FROM Visit INNER JOIN Visitor ON Visit.idVisitor = Visitor.idVisitor WHERE DATE(arrivalTime) = ?";
        try {
            Connection connection = databaseConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, date);
            
            ResultSet visitorsOfDate = statement.executeQuery();
            while(visitorsOfDate.next()) {
                Visitor visitor = new Visitor(visitorsOfDate.getString("email"), visitorsOfDate.getString("name"), visitorsOfDate.getString("lastname1"), visitorsOfDate.getString("lastname2"));
                visitors.add(visitor);
            }
        } catch (SQLException exception) {
            return null;
        } finally {
            databaseConnection.closeConnection();
        }
        return visitors;
    }
}
