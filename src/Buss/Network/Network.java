/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buss.Network;

import Buss.Enterprise.EnterpriseDir;

/**
 *
 * @author Abhishek Badhe
 */
public class Network {
    private String name;
    private EnterpriseDir enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDir();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDir getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
