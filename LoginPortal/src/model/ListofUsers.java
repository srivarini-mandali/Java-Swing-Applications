/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author srivarinimandali
 */
public class ListofUsers {
    
    private ArrayList<Login> listOfUsers;
    
    private ArrayList<String> passwordHistory;
    
    public ListofUsers(){
        this.listOfUsers=new ArrayList<Login>();
        this.passwordHistory = new ArrayList<>();
    }

    /**
     * @return the listOfUsers
     */
    public ArrayList<Login> getListOfUsers() {
        return listOfUsers;
    }

    /**
     * @param listOfUsers the listOfUsers to set
     */
    public void setListOfUsers(ArrayList<Login> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }
 
    public Login addUser(String newPassword){
        Login newUser=new Login();
        String hashedPassword = PasswordHasher.hashPassword(newPassword);
        
        // Check if the hashed password is already in the password history
        if (!isPasswordInHistory(hashedPassword)) {
            newUser.setPassword(hashedPassword);
            newUser.setOriginalPassword(newPassword); // Store the original password
            listOfUsers.add(newUser);
            passwordHistory.add(hashedPassword);
            return newUser;
        } else {
            // Password is a duplicate, handle this as needed (e.g., show an error message)
            return null;
        }
    }
    
    public void deleteUser(Login login){
        listOfUsers.remove(login);
    }
    
    public Login searchUser(int nuid){
        for(Login login:listOfUsers){
            if(login.getNuid()== nuid){
                return login;
            }
        }
        return null;
    }
     public boolean isPasswordInHistory(String newPassword) {
        return passwordHistory.contains(PasswordHasher.hashPassword(newPassword));
    }
    
    /**
     * @return the passwordHistory
     */
    public ArrayList<String> getPasswordHistory() {
        return passwordHistory;
    }

    /**
     * @param passwordHistory the passwordHistory to set
     */
    public void setPasswordHistory(ArrayList<String> passwordHistory) {
        this.passwordHistory = passwordHistory;
    }
    
}
