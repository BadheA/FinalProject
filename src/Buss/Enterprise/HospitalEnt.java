/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buss.Enterprise;

import Buss.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Abhishek Badhe
 */
public class HospitalEnt extends Enterprise {
    
    public HospitalEnt(String name){
        super(name,EnterpriseType.Hospital);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
