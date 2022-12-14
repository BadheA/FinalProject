/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDir;
import java.util.ArrayList;

/**
 *
 * @author Abhishek Badhe
 */
public class EnterpriseDir {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDir(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
    
      if(type==Enterprise.EnterpriseType.Laboratory){
            enterprise=new LabEnterprise(name);
            enterpriseList.add(enterprise);
        }
    
  if(type==Enterprise.EnterpriseType.ResearchDepartment){
            enterprise=new ResearchDeptEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
