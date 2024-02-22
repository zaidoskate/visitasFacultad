/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import logic.Visit;
import logic.Visitor;
import logic.Department;
import logic.DataValidation;
/**
 *
 * @author zaido
 */
public class DatabaseInsertion {
    private DatabaseConnection databaseConnection;
    
    public DatabaseInsertion() {
        databaseConnection =  new DatabaseConnection();
    }
    
    /* INSERT INTO VISITOR */
    public int insertVisitor (Visitor visitor) throws SQLException {
        String query = "INSERT INTO Visitor (email, name, lastname1, lastname2) VALUES (?, ?, ?, ?)";
        if(DataValidation.visitorValidation(visitor)){
            try {
                Connection connection = databaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
                statement.setString(1, visitor.getEmail());
                statement.setString(2, visitor.getName());
                statement.setString(3, visitor.getLastName1());
                statement.setString(4, visitor.getLastName2());
                statement.executeUpdate();
                ResultSet idVisitor = statement.getGeneratedKeys();
                if (idVisitor.next()) {
                    return idVisitor.getInt(1);
                }
            } catch (SQLException exception) {
                return -1;
            } finally {
                databaseConnection.closeConnection();
            }
        }
        return -1;
    }
    
     /* INSERT INTO DEPARTMENT */ 
    public int insertDepartment(Department department) {
        int idDepartmentResult = -1;
        String query = "INSERT INTO Department (departmentCode, departmentName) VALUES (?, ?)";
        if(DataValidation.departmentValidation(department)){
            try {
                Connection connection = databaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement (query, PreparedStatement.RETURN_GENERATED_KEYS);
                statement.setString(1, department.getDepartmentCode());
                statement.setString(2, department.getDepartmentName());
                statement.executeUpdate();
                ResultSet idDepartment = statement.getGeneratedKeys();
                if(idDepartment.next()) {
                    return idDepartment.getInt(1);
                }
            } catch (SQLException exception) {
                return -1;
            } finally {
                databaseConnection.closeConnection();
            }
        }
        return -1;
    }
    
    /* INSERT INTO VISIT */
    public boolean insertVisit(Visit visit) throws SQLException {
        try {
            int idVisitor = insertVisitor(visit.getVisitor());
            if (idVisitor == -1) {
                return false;
            }
        
            int idDepartment = insertDepartment(visit.getDepartment());
            if (idDepartment == -1) {
                return false;
            }
        
            String query = "INSERT INTO Visit (idVisitor, idDepartment, arrivalTime, departureTime, matter, personVisited) VALUES (?, ?, ?, ?, ?, ?)";
            if(DataValidation.visitValidation(visit)) {
                Connection connection = databaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, idVisitor);
                statement.setInt(2, idDepartment);
                statement.setString(3, visit.getArrivalTime());
                statement.setString(4, visit.getDepartureTime());
                statement.setString(5, visit.getMatter());
                statement.setString(6, visit.getPersonVisited());
                statement.executeUpdate();
                return true;
            }
        } catch (SQLException exception) {
            return false;
        } finally {
            databaseConnection.closeConnection();
        }
        return false;
    }
}