/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Buss.Organization;

import Buss.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Abhishek Badhe
 */
public class OrganizationDir {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDir() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Visitor.getValue())){
            organization = new VisitorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Screening.getValue())){
            organization = new ScreeningOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Radiology.getValue())){
            organization = new RadiologyOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.ResearchScientist.getValue())){
            organization = new ResearchScientistOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.ResearchAssistant.getValue())){
            organization = new ResearchAssistantOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}