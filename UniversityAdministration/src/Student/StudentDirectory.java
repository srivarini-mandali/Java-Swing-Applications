/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import Degree.Degree;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class StudentDirectory {
    ArrayList<Student> studentList;

    public StudentDirectory() {
        this.studentList = new ArrayList<Student>() ;
        
    }

    public Student addStudent(String username,String password,long id,String firstName,String lastName,String emailId, Degree degree)
    {
     Student s = new Student( username,password,id, firstName, lastName, emailId, degree) ;
     studentList.add(s) ;
     return s;
    }
    
      public Student findByUserName(String username)
    {
      for(Student c:this.studentList)
      {
        if(c.getUsername().equals(username))
        {
        return c ;
        }
      }
      return null ;
    }
    
    
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    
    
    
}
