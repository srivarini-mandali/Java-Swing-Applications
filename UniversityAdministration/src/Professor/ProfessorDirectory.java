/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class ProfessorDirectory {
    ArrayList<Professor> professorList;

    public ProfessorDirectory() {
        this.professorList = new ArrayList<Professor>() ;
        
    }
    
    public Professor addProfessor(String username,String password,String firstName,String lastName,String email)
    {
      Professor p = new Professor(username,password,firstName,lastName,email) ;
      this.professorList.add(p) ;
      return p;
    }

    public ArrayList<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(ArrayList<Professor> professorList) {
        this.professorList = professorList;
    }
    
     public Professor findByUserName(String username)
    {
      for(Professor c:this.professorList)
      {
        if(c.getUsername().equals(username))
        {
        return c ;
        }
      }
      return null ;
    }
}
