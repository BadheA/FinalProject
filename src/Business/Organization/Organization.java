/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDir;
import Business.Role.Role;
import Business.UserAccount.UserAccountDir;
import Business.Visitor.VisitorDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
/**
 *
 * @author Abhishek Badhe
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDir employeeDirectory;
    private UserAccountDir userAccountDirectory;
    private VisitorDirectory visitorDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Receptionist("Receptionist Organization"),Visitor("Visitor Organization"), Doctor("Doctor Organization"), Screening("Screening Organization"),
        Radiology("Radiology Organization"),ResearchScientist("ResearchScientist Organization"),ResearchAssistant("ResearchAssistant Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDir();
        userAccountDirectory = new UserAccountDir();
        visitorDirectory=new VisitorDirectory();
        organizationID = counter;
        ++counter;
    }

    public VisitorDirectory getVisitorDirectory() {
        return visitorDirectory;
    }

    public void setVisitorDirectory(VisitorDirectory visitorDirectory) {
        this.visitorDirectory = visitorDirectory;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDir getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDir getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
