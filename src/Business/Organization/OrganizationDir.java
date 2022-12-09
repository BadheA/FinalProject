/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
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
            organization = new VisitorOrg();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Screening.getValue())){
            organization = new ScreeningOrg();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Radiology.getValue())){
            organization = new RadiologyOrg();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.ResearchScientist.getValue())){
            organization = new ResearchScientistOrg();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.ResearchAssistant.getValue())){
            organization = new ResearchAssistantOrg();
            organizationList.add(organization);
        }
        return organization;
    }
}