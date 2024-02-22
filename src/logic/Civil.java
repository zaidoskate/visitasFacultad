/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package logic;
/**
 *
 * @author zaido
 */
public class Civil extends Visitor{

    private String identificationType;
    private String identificationCode;
    
    public Civil(String email, String name, String lastName1, String lastName2, String identificationType, String identificationCode) {
        super(email, name, lastName1, lastName2);
        this.identificationType = identificationType;
        this.identificationCode = identificationCode;
    }
    
    public String getIdentificationType() {
        return this.identificationType;
    }
    
    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }
    
    public String getIdentificationCode() {
        return this.identificationCode;
    }
    
    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }
}
