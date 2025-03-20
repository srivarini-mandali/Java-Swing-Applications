/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class UserAccountDirectory {

    ArrayList<UserAccount> useraccountlist;
    
    public UserAccountDirectory() {
        this.useraccountlist = new ArrayList<UserAccount>();

    }
    
    
     
    public UserAccount createUserAccount(String username, String password){
        UserAccount user = new UserAccount(username, password);

        useraccountlist.add(user);
        return user;
    }
    public void addUserAccount(UserAccount useraccount)
    {
      useraccountlist.add(useraccount);
    }
    
    public UserAccount findById(String id) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getAccountId().equals(id)) {
                return u;
            }
        }
        
        return null;
    }
    
    public UserAccount getUserAccount(String username, String password, String role) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) ) {
                return u;
            }
        }
        
        return null;
    }
    
    public Boolean accountExists(String username, String password, String role) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return true;
            }
        }
        
        return false;
    }

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
     public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.useraccountlist) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }


     
 
    
}
