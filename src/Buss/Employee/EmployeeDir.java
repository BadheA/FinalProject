/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buss.Employee;

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
