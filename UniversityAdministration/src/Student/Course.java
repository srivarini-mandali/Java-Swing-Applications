/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import Professor.Professor;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class Course {
    private String id;
    private String name;
    
    private int credits;
    private String duration;
   ArrayList<Professor> professorList;
   
    
    public Course(String id,String name,int credits,String duration) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.professorList = new ArrayList<Professor>() ;
        this.duration = duration;
    }
    
    

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

   
    
    public ArrayList<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(ArrayList<Professor> professorList) {
        this.professorList = professorList;
    }

    
    
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
  
    
    
    

    @Override
    public String toString() {
        return id;
    }

    public void setDuration(int updatedDuration) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isFeePaid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
