/**
  * 
  * DONE (1) Implement this class and (2) Document using Javadoc comments as well as regular comments
  *
  * If you are running a recent version of Eclipse, you can command Eclipse to generate the Javadoc .html file
  * by using the command from the menu bar: Project | Generate Javadoc...
  * 
 */
public class Question {

    private int id;
    private String questionQuery;

    /**
     * Creates a question
     * Creates an id unique question id
     * questionQuery text of the equation
     */

    public Question(int id, String questionQuery) {
        this.id = id;
        this.questionQuery = questionQuery;
    }

    /**
     * Returns question id
     */

    public int getId() {
        return id;
    }

    /**
     * Returns the question
     */

    public String getQuestionQuery() {
        return questionQuery;
    }

    /**
     * Changes question
     */

    public void setQuestionQuery(String questionQuery) {
        this.questionQuery = questionQuery;
    }
}
