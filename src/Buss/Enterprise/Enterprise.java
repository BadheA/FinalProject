 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buss.Enterprise;

import Buss.Organiztion.Organization;
import Buss.Organiztion.OrganizationDir;

/**
 *
 * @author Abhishek Badhe
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDir organizationDirectory;

    public OrganizationDir getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Laboratory("Laboratory"),
        ResearchDepartment("ResearchDepartment");
        
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDir();
    }
}
