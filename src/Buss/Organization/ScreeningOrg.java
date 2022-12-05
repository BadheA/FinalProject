/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Buss.Organization;

import Business.Role.ResearchAssistantRole;
import Business.Role.Role;
import Business.Role.ScreeningAssistantRole;
import java.util.ArrayList;

/**
 *
 * @author Abhishek Badhe
 */
public class ScreeningOrg extends Organization{

    public ScreeningOrg() {
        super(Organization.Type.Screening.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ScreeningAssistantRole());
        return roles;
    }
     
   
    
    
}
