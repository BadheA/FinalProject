/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Buss.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek Badhe
 */
public class UserAccDirectory {
    
    private ArrayList<UserAcc> userAccountList;

    public UserAccDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAcc> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAcc authenticateUser(String username, String password){
        for (UserAcc ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAcc createUserAccount(String username, String password, Employee employee, Role role){
        if(checkIfUsernameIsUnique(username)){
            UserAcc account = new UserAcc();
            account.setUsername(username);
            account.setPassword(password);
            account.setEmployee(employee);
            account.setRole(role);
            userAccountList.add(account);
            return account;
        }else 
            return null;   
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAcc ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
