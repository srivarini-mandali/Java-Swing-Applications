/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package model;

import java.util.ArrayList;
import java.util.List;


/**
*
* @author srivarinimandali
*/
public class Login {

private String username;
private String password;
private String studentName;
private String originalPassword;
private String role;
private String emailID;
private int nuid;
private List<String> passwordHistory;
private String hashedPassword; 

public int getNuid() {
    return nuid;
}

public void setNuid(int nuid) {
    this.nuid = nuid;
}

public Login(){
    passwordHistory= new ArrayList<>();

}

    public String getOriginalPassword() {
        return originalPassword;
    }

    public void setOriginalPassword(String originalPassword) {
        this.originalPassword = originalPassword;
    }

public void addToPasswordHistory(String newPassword) {
    if (getPasswordHistory() == null) {
        setPasswordHistory(new ArrayList<>());
    }
    getPasswordHistory().add(newPassword);
}
public boolean changePassword(String newPassword, List<String> passwordHistory) {
        if (passwordHistory.contains(PasswordHasher.hashPassword(newPassword))) {
            return false; // New password is in the history
        }
        setPassword(PasswordHasher.hashPassword(newPassword));
        return true;
    }

/**
 * @return the username
 */
public String getUsername() {
    return username;
}
@Override
public String toString() {
    return String.valueOf(nuid);
}

/**
 * @param username the username to set
 */
public void setUsername(String username) {
    this.username = username;
}

/**
 * @return the password
 */
public String getPassword() {
    return hashedPassword;
}

/**
 * @param password the password to set
 */
public void setPassword(String password) {
    this.hashedPassword = password; // Store the hashed password
}

/**
 * @return the studentName
 */
public String getStudentName() {
    return studentName;
}

/**
 * @param studentName the studentName to set
 */
public void setStudentName(String studentName) {
    this.studentName = studentName;
}

/**
 * @return the emailID
 */
public String getEmailID() {
    return emailID;
}

/**
 * @param emailID the emailID to set
 */
public void setEmailID(String emailID) {
    this.emailID = emailID;
}


/**
 * @return the passwordHistory
 */
public List<String> getPasswordHistory() {
    return passwordHistory;
}

/**
 * @param passwordHistory the passwordHistory to set
 */
public void setPasswordHistory(List<String> passwordHistory) {
    this.passwordHistory = passwordHistory;
}

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }


}