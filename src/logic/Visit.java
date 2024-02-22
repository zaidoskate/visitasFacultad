/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author zaido
 */
public class Visit {
    private Visitor visitor;
    private Department department;
    private String arrivalTime;
    private String departureTime;
    private String matter;
    private String personVisited;

    public Visit(Visitor visitor, Department department, String arrivalTime, String matter, String personVisited) {
        this.visitor = visitor;
        this.department = department;
        this.arrivalTime = arrivalTime;
        this.matter = matter;
        this.personVisited = personVisited;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public String getPersonVisited() {
        return personVisited;
    }

    public void setPersonVisited(String personVisited) {
        this.personVisited = personVisited;
    }
}

