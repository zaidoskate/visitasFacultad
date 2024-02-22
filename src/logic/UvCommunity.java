/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author zaido
 */
public class UvCommunity extends Visitor{
    
    private String miembroUv;
    
    public UvCommunity(String email, String name, String lastName1, String lastName2, String miembroUv) {
        super(email, name, lastName1, lastName2);
        this.miembroUv = miembroUv;
    }
    
    public String getMiembroUv() {
        return this.miembroUv;
    }
    
    public void setMiembroUv(String miembroUv) {
        this.miembroUv = miembroUv;
    }
}
