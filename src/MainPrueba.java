/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import logic.*;
import dataaccess.*;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author zaido
 */
public class MainPrueba {
    public static void printVisitorsPerDate() {
        DatabaseQueries visitorsPerDate =  new DatabaseQueries();
        String date = "2024-02-21";
        List <Visitor>visitors = visitorsPerDate.getVisitorsByDate(date);
        if(visitors != null) {
            for( Visitor visitor : visitors) {
                System.out.println("Visitantes de la fecha "+date);
                System.out.println("Visitante: " + visitor.toString());
                System.out.println("------------------------");
            }
        } else {
            System.out.println("No hay visitantes en esta fecha");
        }
    }
    
public static void main(String[] args) {
    DatabaseInsertion insertionData = new DatabaseInsertion();
    Visitor visitor = new UvCommunity("zs22013693@estudiantes.uv.mx", "Zaid Alexis", "Vazquez", "Ramirez", "S22013693");
    
    Department facultadFei = new Department("FEI", "Facultad de estadistica e informatica");
    Visit visit = new Visit(visitor, facultadFei, "2024-02-21 09:23:00", "Reunion", "Secretaria academica");

    /* Probar las inserciones a la base de datos Visitor, Department y Visit */
    try {
        insertionData.insertDepartment(facultadFei);
        insertionData.insertVisitor(visitor);
        insertionData.insertVisit(visit);
    } catch (SQLException exception) {
        /* Manejo de la excepcion
         Se esta manejando por boolean retornados en las funciones
         Con el fin de pasar esas excepciones a la capa gui proxima
         a implementar
        */
    }
    /* Probar la funcionalidad de consultar visitantes por fecha */
    printVisitorsPerDate();
}

}
