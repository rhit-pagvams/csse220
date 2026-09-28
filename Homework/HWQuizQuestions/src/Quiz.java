/**
  * 
  * Done (1) Implement this class and (2) Document using Javadoc comments as well as regular comments
  * 
  * If you are running a recent version of Eclipse, you can command Eclipse to generate the Javadoc .html file
  * by using the command from the menu bar: Project | Generate Javadoc...
  *
  * 
 */

import java.util.ArrayList;

public class Quiz {

    private int id;
    private ArrayList<Question> questions;

    /**
     * Create an empty quiz
     */

    public Quiz(int id) {
        this.id = id;
        this.questions = new ArrayList<Question>();
    }

    /**
     * Return the quiz id
     */

    public int getId() {
        return id;
    }

    /**
     * Adds question to this quiz
     */

    public void addQuestion(Question question) {
        questions.add(question);
    }

    /**
     * Returns all questions in the quiz
     */

    public ArrayList<Question> getQuestions() {
        return questions;
    }
}
