/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Buss.Role;

import Bus.EcoSystem;
import Buss.Enterprise.Enterprise;
import Buss.Organiztion.DoctorOrg;
import Buss.Organiztion.Organization;
import Buss.UserAccount.UserAccount;
import userinterface.DoctorRole.ManagePatientsJPanel;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author Abhishek Badhe
 */
public class DoctorRole extends Role{

    @Override
    /*public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrg)organization, enterprise);
    }*/
    public JPanel createWorkArea(JPanel rightPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorWorkAreaJPanel(rightPanel, enterprise,account, business);
    }
    
}
