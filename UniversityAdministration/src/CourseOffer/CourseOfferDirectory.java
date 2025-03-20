/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseOffer;

import Professor.Professor;
import Student.Course;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class CourseOfferDirectory {
    
    ArrayList<CourseOffer> courseOfferList;

    public CourseOfferDirectory() {
        
        this.courseOfferList = new ArrayList<CourseOffer>() ;
    }

    public ArrayList<CourseOffer> getCourseOfferList() {
        return courseOfferList;
    }

    public void setCourseOfferList(ArrayList<CourseOffer> courseOfferList) {
        this.courseOfferList = courseOfferList;
    }
    
      public CourseOffer addCourseOffer(Course course,Professor professor, String language, Double price, String time)
    {
        CourseOffer c = new CourseOffer(course, professor, language, price, time);
        this.courseOfferList.add(c) ;
        return c;
    }
    
      public CourseOffer findCourseOfferByID(String id){
          for(CourseOffer c: this.courseOfferList){
              if(c.getCourse().getId()==id){
                  return c;
              }
              
          }
          return null;
      }
}
