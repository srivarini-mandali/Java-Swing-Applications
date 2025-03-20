/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Degree;

import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class DegreeDirectory {
    ArrayList<Degree> degreeList;
    
    public DegreeDirectory(){
        this.degreeList = new ArrayList<Degree>();
    }

    public ArrayList<Degree> getDegreeList() {
        return degreeList;
    }

    public void setDegreeList(ArrayList<Degree> degreeList) {
        this.degreeList = degreeList;
    }
    
    public Degree findByName(String name)
    {
        for(Degree d:this.degreeList){
            if(d.getName().equals(name)){
                return d ;
            }
        }
      return null ;
    }

    public Degree addDegree(String name, int creditRequirement, float gpaRequirement)
    {
     Degree d = new Degree(name, creditRequirement, gpaRequirement);
     degreeList.add(d) ;
     return d;
    }
}
