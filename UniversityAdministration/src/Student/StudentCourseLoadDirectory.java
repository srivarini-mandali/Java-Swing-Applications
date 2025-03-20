/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import CourseOffer.CourseOffer;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class StudentCourseLoadDirectory {
    ArrayList<StudentCourseLoad> courseLoadList;

    public StudentCourseLoadDirectory(){
        this.courseLoadList = new ArrayList<StudentCourseLoad>();
    }

    public ArrayList<StudentCourseLoad> getCourseLoadList() {
        return courseLoadList;
    }

    public void setCourseLoadList(ArrayList<StudentCourseLoad> courseLoadList) {
        this.courseLoadList = courseLoadList;
    }

    public StudentCourseLoad addCourseLoad(CourseOffer courseOffer){
        StudentCourseLoad scl = new StudentCourseLoad(courseOffer);
        this.courseLoadList.add(scl);
        return scl;
    }
}
