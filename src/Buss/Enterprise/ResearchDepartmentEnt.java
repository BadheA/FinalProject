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
public class ResearchDepartmentEnt  extends Enterprise{
 private String vaccinename;
 private int volunteerNo;
 private String vaccineType;
 private int minimumAge;
 private int maximumAge;
 private ArrayList<String> doseList;
 
  
     public ResearchDepartmentEnt(String name){
        super(name,Enterprise.EnterpriseType.ResearchDepartment);
        this.doseList=new ArrayList<String>();
    }
     
      public void createDose( String dose){
  
    this.doseList.add(dose);
    }

    public String getVaccinename() {
        return vaccinename;
    }

    public void setVaccinename(String vaccinename) {
        this.vaccinename = vaccinename;
    }

    public int getVolunteerNo() {
        return volunteerNo;
    }

    public void setVolunteerNo(int volunteerNo) {
        this.volunteerNo = volunteerNo;
    }

    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public int getMaximumAge() {
        return maximumAge;
    }

    public void setMaximumAge(int maximumAge) {
        this.maximumAge = maximumAge;
    }

    public ArrayList<String> getDoseList() {
        return doseList;
    }

    public void setDoseList(ArrayList<String> doseList) {
        this.doseList = doseList;
    }
 
    
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
