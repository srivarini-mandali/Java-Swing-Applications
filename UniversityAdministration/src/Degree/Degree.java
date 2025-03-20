/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Degree;

/**
 *
 * @author renuka
 */
public class Degree {
    String name;
    int creditRequirement;
    Float gpaRequirement;

    public Degree(String name, int creditRequirement, float gpaRequirement){
        this.name = name;
        this.creditRequirement = creditRequirement;
        this.gpaRequirement = gpaRequirement;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditRequirement() {
        return creditRequirement;
    }

    public void setCreditRequirement(int creditRequirement) {
        this.creditRequirement = creditRequirement;
    }

    public float getGpaRequirement() {
        return gpaRequirement;
    }

    public void setGpaRequirement(float gpaRequirement) {
        this.gpaRequirement = gpaRequirement;
    }

        public String toString() {
                return name; // Or however you want to represent the Degree object as a String
            }

}
