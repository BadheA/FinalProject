/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.ResearchScientistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek Badhe
 */
public class ResearchScientistOrg extends Organization{

    public ResearchScientistOrg() {
        super(Type.ResearchScientist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ResearchScientistRole());
        return roles;
    }
     
}
