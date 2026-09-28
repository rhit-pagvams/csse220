import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class is used to demonstrate a functional design involving Quizzes and
 * Questions which can be updated and displayed
 * 
 * 
 *************************************************************************************** 
 *         REQUIRED HELP CITATION
 * 
 *         DONE: cite your help here or say "only used CSSE220 materials"
 *************************************************************************************** 
 */

import java.util.HashMap;
import java.util.Map;


public class QuizMain {
	
	//DONE add instance variables here

	private Map<Integer, Question> questions;
	private Map<Integer, Quiz> quizzes;

	public QuizMain() {
		// DONE In order to demonstrate functionality, please follow the TODOs below
		// You will have to create questions and quizzes when a QuizMain is created

		questions = new HashMap<Integer, Question>();
		quizzes = new HashMap<Integer, Quiz>();
		
		// DONE 1 Create five questions (can be silly/basic questions) use id 1,2,3,4,5 ...

		Question q1 = new Question(1, "Where is Rose-Hulman?");
		Question q2 = new Question(2, "6 + 7?");
		Question q3 = new Question(3, "What color is the sky?");
		Question q4 = new Question(4, "Capital of Indiana?");
		Question q5 = new Question(5, "Best rapper ever?");

		questions.put(1, q1);
		questions.put(2, q2);
		questions.put(3, q3);
		questions.put(4, q4);
		questions.put(5, q5);


		// DONE 2 Create three or more quizzes  use id 1,2,3...
		//      (One quiz should share at least one question with another )

		Quiz quiz1 = new Quiz(1);
		Quiz quiz2 = new Quiz(2);
		Quiz quiz3 = new Quiz(3);

		quiz1.addQuestion(q1);
		quiz1.addQuestion(q2);

		quiz2.addQuestion(q1);
		quiz2.addQuestion(q3);
		quiz2.addQuestion(q4);

		quiz3.addQuestion(q3);
		quiz3.addQuestion(q5);


		quizzes.put(1, quiz1);
		quizzes.put(2, quiz2);
		quizzes.put(3, quiz3);
		
	}
	
	
	
	public static void main(String[] args) {
		//We want to use instance variables of the QuizMain class so we need to construct a QuizMain object
		QuizMain myQuizSimulator = new QuizMain();
		
		// DONE 3 Display three or more different quizzes
		System.out.println("--------------------------------------------------");
		System.out.println("Showing three or more original quizzes:");
		System.out.println("--------------------------------------------------");
		myQuizSimulator.handleDisplayQuiz(1);
		myQuizSimulator.handleDisplayQuiz(2);
		myQuizSimulator.handleDisplayQuiz(3);
		
		
		
		// DONE 4 Change two quiz questions
		// A. (One should be shared with two or more quizzes)
		// B. (One should be unique to one quiz)
		myQuizSimulator.handleUpdateQuizQuestion(1,"What is different 1?");
		myQuizSimulator.handleUpdateQuizQuestion(2,"What is different 2?");

		
		// DONE 5 Display the same three (or more) quizzes
		//	   A. One that has a unique question which changed
		//	   B. Two which share a question that has been changed		
		System.out.println("--------------------------------------------------");
		System.out.println("Showing three or more changed quizzes:");
		System.out.println("--------------------------------------------------");
		myQuizSimulator.handleDisplayQuiz(1);
		myQuizSimulator.handleDisplayQuiz(2);
		myQuizSimulator.handleDisplayQuiz(3);
		
	}
	
	/**
	 *  This method should display a quiz in a very similar fashion to the output provided
	 *  in exampleOutput.txt, which is located in your repository
	 * 
	 * 
	 * @param quizId
	 */
	public void handleDisplayQuiz(int quizId) {
		//DONE complete this method

		Quiz quiz = quizzes.get(quizId);

		System.out.println("Quiz ID: " + quiz.getId());

		for (Question question : quiz.getQuestions()) {
			System.out.println("Question ID: " + question.getId()
			+ " Question: " + question.getQuestionQuery());
		}

	}
	
	/**
	 * 
	 * This method should replace the data in the question with id=questionId with the new questionData 
	 * 
	 * @param questionId
	 * @param questionData
	 */
	public void handleUpdateQuizQuestion(int questionId, String questionData) {
		//DONE complete this method

		Question question = questions.get(questionId);

		question.setQuestionQuery(questionData);

	}

}
