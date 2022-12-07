/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buss.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek Badhe
 */
public class LaboratoryEnt  extends Enterprise{
     public LaboratoryEnt(String name){
        super(name,EnterpriseType.Laboratory);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
