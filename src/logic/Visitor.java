/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author zaido
 */
public class Visitor {
    protected String email;
    protected String name;
    protected String lastName1;
    protected String lastName2;
    
    public Visitor(String email, String name, String lastName1, String lastName2) {
        this.email = email;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastName1() {
        return this.lastName1;
    }
    
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    
    public String getLastName2() {
        return this.lastName2;
    }
    
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    
    public String toString(){
        return this.name + " " + this.lastName1 + " " + this.lastName2 + "\n\t" + this.email;
    }
}
