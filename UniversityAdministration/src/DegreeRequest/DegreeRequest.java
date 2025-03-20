/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DegreeRequest;

import CertificationAuthority.CertificationAuthority;
import Degree.Degree;
import Student.Student;

/**
 *
 * @author renuka
 */
public class DegreeRequest {
    Student student;
    Degree degree;
    String status  ;
    public DegreeRequest(Student student,Degree degree ) {
        
        this.student = student;
        this.degree = degree;
        
        
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

   

   
    
    
    
}
