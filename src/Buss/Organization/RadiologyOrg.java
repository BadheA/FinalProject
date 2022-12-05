/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Buss.Organization;

import Business.Role.AdminRole;
import Business.Role.RadiologyAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek Badhe
 */
public class RadiologyOrg extends Organization{

    public RadiologyOrg() {
        super(Type.Radiology.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RadiologyAssistantRole());
        return roles;
    }
     
}
