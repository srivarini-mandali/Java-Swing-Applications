/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CertificationAuthority;

import DegreeRequest.DegreeRequestDirectory;

/**
 *
 * @author renuka
 */
public class CertificationAuthority {
    String name ;
    String userName;
    String password;
    DegreeRequestDirectory degreeRequestDirectory;
    public CertificationAuthority(String userName,String password,String name) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.degreeRequestDirectory = new DegreeRequestDirectory() ;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public DegreeRequestDirectory getDegreeRequestDirectory() {
        return degreeRequestDirectory;
    }

    public void setDegreeRequestDirectory(DegreeRequestDirectory degreeRequestDirectory) {
        this.degreeRequestDirectory = degreeRequestDirectory;
    }
    
    
}
