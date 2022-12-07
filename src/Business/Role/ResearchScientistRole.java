/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Bus.EcoSystem;
import Buss.Enterprise.Enterprise;
import Buss.Organiztion.Organization;
import Buss.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ResearchScientistRole.ResearchScientistWorkAreaJPanel;

/**
 *
 * @author Abhishek Badhe
 */
public class ResearchScientistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ResearchScientistWorkAreaJPanel(userProcessContainer,enterprise, account, organization, business);
    }
    
}
