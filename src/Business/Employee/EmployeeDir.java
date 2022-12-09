/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Abhishek Badhe
 */
public class EmployeeDir {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDir() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
     public boolean searchEmployee(String employeeName){
      for (Employee employee: this.getEmployeeList()) {
           if (employee.getName().equals(employeeName) ) {
         return true;
       }
      }
           return false;
}
}