/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

/**
 *
 * @author srivarinimandali
 */
public class Feedback {
    private String professorName;
    private String courseName;
    private String feedbackText;

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getFeedbackText() {
        return feedbackText;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public Feedback(String professorName,String courseName, String feedbackText) {
        this.professorName = professorName;
        this.courseName = courseName;
        this.feedbackText = feedbackText;
    }
}
