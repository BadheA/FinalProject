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
import userinterface.ResearchAssistantRole.ResearchAssistantWorkAreaJPanel;

/**
 *
 * @author Abhishek Badhe
 */
public class ResearchAssistantRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ResearchAssistantWorkAreaJPanel(userProcessContainer, account, organization,enterprise, business);
    }
    
}
