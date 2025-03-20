/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseOffer;

import Professor.Professor;
import Student.Course;

/**
 *
 * @author renuka
 */

public class CourseOffer {
    Course course;
    String language;
    Professor professor;
    //Boolean feesPaid;
    //float gradePerCourse;
    double price;
    String time;
    public CourseOffer(Course course,Professor professor, String language, double price, String time) {
        this.course = course ;
        this.professor = professor;
        this.language = language;
        this.price = price;
        this.time = time;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
//    public float getGradePerCourse() {
//        return gradePerCourse;
//    }
//
//    public void setGradePerCourse(float gradePerCourse) {
//        this.gradePerCourse = gradePerCourse;
//    }
//
//    
//    public String getFeesPaid() {
//        return feesPaid;
//    }
//
//    public void setFeesPaid(String feesPaid) {
//        this.feesPaid = feesPaid;
//    }

    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    
    
    @Override
    public String toString() {
        return String.valueOf(course.getId()) ;
    }

  

  
    
    
    
}
