/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Buss.Role;

import Bus.EcoSystem;
import Buss.Enterprise.Enterprise;
import Buss.Organiztion.Organization;
import Buss.UserAccount.UserAccount;
import javax.swing.JPanel;
/**
 *
 * @author Abhishek Badhe
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        Receptionist("Receptionist"),
        RadiologyAssistant("Radiology Assistant"),
        ScreeningAssistant("Screening Assistant"),
        ResearchAssistant("Research Assistant"),
        ResearchScientist("Research Scientist"),
        Visitor("Visitor");
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}