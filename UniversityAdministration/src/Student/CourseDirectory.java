/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class CourseDirectory {
    
    ArrayList<Course> courseList ;

    public CourseDirectory() {
        this.courseList = new ArrayList<Course>() ;
        
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
     public Course addCourse(String id,String name,int credits,String duration)
    {
        Course c = new Course(id,name,credits,duration) ;
        this.courseList.add(c) ;
        return c;
    }
      
     public Course findCourseById(String id)
    {
      for(Course c:this.courseList)
      {
        if(c.getId().equals(id))
        { return c ; }
      }      
      return null;
    }
    
}
