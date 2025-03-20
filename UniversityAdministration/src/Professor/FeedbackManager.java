/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author srivarinimandali
 */
public class FeedbackManager {

    private List<Feedback> allFeedbacks;
    private List<Professor> professors;

    public FeedbackManager() {
          this.allFeedbacks = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public void addFeedback(Feedback feedback) {
        allFeedbacks.add(feedback);
    }
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }
    public List<Feedback> getFeedbackForProfessor(String professorName) {
        List<Feedback> professorFeedback = new ArrayList<>();
        for (Feedback feedback : allFeedbacks) {
            if (feedback.getProfessorName().equals(professorName)) {
                professorFeedback.add(feedback);
            }
        }
        return professorFeedback;
    }

}


