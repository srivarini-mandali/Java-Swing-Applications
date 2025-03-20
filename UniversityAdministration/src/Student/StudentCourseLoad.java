/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import CourseOffer.CourseOffer;

/**
 *
 * @author renuka
 */
public class StudentCourseLoad {
    CourseOffer courseOffer;
    Boolean isFeePaid;
    float grade;

    public StudentCourseLoad(CourseOffer courseOffer){
        this.courseOffer = courseOffer;
        this.isFeePaid = false;
        this.grade = 0;
    }
    
    public CourseOffer getCourseOffer() {
        return courseOffer;
    }

    public void setCourseOffer(CourseOffer courseOffer) {
        this.courseOffer = courseOffer;
    }

    public Boolean getIsFeePaid() {
        return isFeePaid;
    }

    public void setIsFeePaid(Boolean isFeePaid) {
        this.isFeePaid = isFeePaid;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
    
    
}
