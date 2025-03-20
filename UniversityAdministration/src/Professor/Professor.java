
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import CourseOffer.CourseOfferDirectory;
import Student.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renuka
 */
public class Professor {
    ArrayList<Course> courseList;
     private CourseOfferDirectory professorCourseOfferDir;
     private static int count = 1 ;
     private String id;
    String name;
    String email;
    double reputationIndex;
    String username;
    String password;
    String firstName;
    String lastName;
    boolean feesPaid;
    private List<Feedback> feedbackList;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public Professor(String username,String password,String firstName,String lastName,String email) {
        this.courseList = new ArrayList<Course>();
        this.professorCourseOfferDir = new CourseOfferDirectory();
         this.id = "prof " + this.count++;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.name = firstName + " "+ lastName ;
        this.feesPaid = false;
        this.feedbackList = new ArrayList<>();

    }

    public CourseOfferDirectory getProfessorCourseOfferDir() {
        return professorCourseOfferDir;
    }

    public void setProfessorCourseOfferDir(CourseOfferDirectory professorCourseOfferDir) {
        this.professorCourseOfferDir = professorCourseOfferDir;
    }

    public boolean isFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(boolean feesPaid) {
        this.feesPaid = feesPaid;
    }

    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Professor.count = count;
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

    public double getReputationIndex() {
        return reputationIndex;
    }

    public void setReputationIndex(double reputationIndex) {
        this.reputationIndex = reputationIndex;
    }
    public void addFeedback(Feedback feedback) {
            feedbackList.add(feedback);
        }

    public List<Feedback> getFeedback() {
            return feedbackList;
        }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    
}
