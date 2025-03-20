/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import CourseOffer.CourseOffer;
import CourseOffer.CourseOfferDirectory;
import Degree.Degree;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private Degree degree;
    private String degreeEarned;
    private float gpa;
    private int totalCreditsCompleted ;
    //private ArrayList<Course> courseList;
    //private ArrayList<StudentCourseLoad> courseLoadList;
    private StudentCourseLoadDirectory studentCourseLoadDirectory;
    String username;
    String password;
	
        
	
	public Student(String username,String password,long id,String firstName,String lastName,String emailId, Degree degree) {
		this.id = id;
                this.firstName = firstName;
                this.lastName = lastName;
                this.emailId = emailId;
                this.degree = degree;
//		this.courseList = new ArrayList<Course>();
//              this.courseOfferList = new ArrayList<CourseOffer>();		
                this.studentCourseLoadDirectory = new StudentCourseLoadDirectory();
                this.username = username;
                this.password = password;
                this.totalCreditsCompleted = 0;
                this.degreeEarned = "None";
                this.gpa = 0;
        }

    public StudentCourseLoadDirectory getStudentCourseLoadDirectory() {
        return studentCourseLoadDirectory;
    }

    public void setStudentCourseLoadDirectory(StudentCourseLoadDirectory studentCourseLoadDirectory) {
        this.studentCourseLoadDirectory = studentCourseLoadDirectory;
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

        
    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getTotalCreditsCompleted() {
        return totalCreditsCompleted;
    }

    public void setTotalCreditsCompleted(int totalCreditsCompleted) {
        this.totalCreditsCompleted = totalCreditsCompleted;
    }

        
        
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getDegreeEarned() {
        return degreeEarned;
    }

    public void setDegreeEarned(String degreeEarned) {
        this.degreeEarned = degreeEarned;
    }

  
	
	
	
	

    @Override
    public String toString() {
        return String.valueOf(id);
    }
	
	
}
