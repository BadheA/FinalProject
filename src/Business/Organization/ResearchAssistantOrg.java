/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.ResearchAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek Badhe
 */
public class ResearchAssistantOrg extends Organization{

    public ResearchAssistantOrg() {
        super(Type.ResearchAssistant.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ResearchAssistantRole());
        return roles;
    }
     
}
