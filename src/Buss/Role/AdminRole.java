/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Buss.Role;

import Bus.EcoSystem;
import Buss.Enterprise.Enterprise;
import Buss.Organiztion.Organization;
import Buss.UserAccount.UserAccount;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek Badhe
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}
