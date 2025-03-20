/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import CertificationAuthority.CertificationAuthorityDirectory;
import Degree.DegreeDirectory;
import Professor.ProfessorDirectory;

import Student.Course;
import Student.CourseDirectory;
import Student.StudentDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author renuka
 */
public class Business {

    private UserAccountDirectory commonUserAccountDirectory;
    private StudentDirectory studentDirectory;
    private ProfessorDirectory professorDirectory;
    private CertificationAuthorityDirectory certificationAuthorityDirectory ;
    private DegreeDirectory degreeDirectory;
    private CourseDirectory globalCourseDir;

    public Business() {
    this.studentDirectory = new StudentDirectory();
    this.commonUserAccountDirectory = new UserAccountDirectory();
    this.professorDirectory = new ProfessorDirectory();
    this.certificationAuthorityDirectory = new CertificationAuthorityDirectory();

    // Initialize the list of degree approval requests for certificationAuthorityDirectory
    this.certificationAuthorityDirectory.setDegreeApprovalRequests(new ArrayList<>());

    this.globalCourseDir = new CourseDirectory();
    this.degreeDirectory = new DegreeDirectory();

    this.commonUserAccountDirectory.createUserAccount("admin", "admin");
}




   
 
   
    
    public static Business getBusinessInstance() {
        
        return new Business();
    }
    
   
  

       public boolean isAccountUniquecommondir(String username,String password)
   {  
      
      UserAccountDirectory commonud = commonUserAccountDirectory ;
      
       for(UserAccount u: commonud.getUseraccountlist())
       {
         if(u.getUsername().equals(username) && u.getPassword().equals(password))
         {
             //JOptionPane.showMessageDialog(null, "Entered username or password is not unique");
             return false ;
         }
       }
         
      return true ;
     
   }
       
      
  


  
    
     public static Business getInstance() {
        return new Business();
    }

    public UserAccountDirectory getCommonUserAccountDirectory() {
        return commonUserAccountDirectory;
    }

    public void setCommonUserAccountDirectory(UserAccountDirectory commonUserAccountDirectory) {
        this.commonUserAccountDirectory = commonUserAccountDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public ProfessorDirectory getProfessorDirectory() {
        return professorDirectory;
    }

    public void setProfessorDirectory(ProfessorDirectory professorDirectory) {
        this.professorDirectory = professorDirectory;
    }

    public CertificationAuthorityDirectory getCertificationAuthorityDirectory() {
        return certificationAuthorityDirectory;
    }

    public void setCertificationAuthorityDirectory(CertificationAuthorityDirectory certificationAuthorityDirectory) {
        this.certificationAuthorityDirectory = certificationAuthorityDirectory;
    }

    public DegreeDirectory getDegreeDirectory() {
        return degreeDirectory;
    }

    public void setDegreeDirectory(DegreeDirectory degreeDirectory) {
        this.degreeDirectory = degreeDirectory;
    }

    public CourseDirectory getGlobalCourseDir() {
        return globalCourseDir;
    }

    public void setGlobalCourseDir(CourseDirectory globalCourseDir) {
        this.globalCourseDir = globalCourseDir;
    }

 
     
}    
    

