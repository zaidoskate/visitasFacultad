/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
/**
 *
 * @author zaido
 */
public class DataValidation {
    
    public static boolean visitorValidation(Visitor visitor) {
        return !visitor.getEmail().isEmpty() &&
               !visitor.getName().isEmpty() &&
               !visitor.getLastName1().isEmpty() &&
               !visitor.getLastName2().isEmpty();
    }
    
    public static boolean visitValidation(Visit visit) {
        return !visit.getPersonVisited().isEmpty() &&
               !visit.getArrivalTime().isEmpty() &&
               !visit.getMatter().isEmpty() &&
               visit.getVisitor() != null &&
               visit.getDepartment() != null;
    }
    
    public static boolean departmentValidation(Department department) {
        return !department.getDepartmentCode().isEmpty() &&
               !department.getDepartmentName().isEmpty();
    }
    
    public static boolean CivilValidation(Civil civil) {
        return visitorValidation(civil) && 
               !civil.getIdentificationType().isEmpty() &&
               !civil.getIdentificationCode().isEmpty();       
    }
    
    public static boolean UvCommunityValidation(UvCommunity uvcommunity) {
        return visitorValidation(uvcommunity) &&
               !uvcommunity.getMiembroUv().isEmpty();
    }
    
    
}
