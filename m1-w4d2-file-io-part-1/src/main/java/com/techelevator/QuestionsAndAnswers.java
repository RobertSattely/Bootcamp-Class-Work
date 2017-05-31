package com.techelevator;

import java.util.List;

public class QuestionsAndAnswers {
	private String question;
	private List<String> answers;
	private int correctAnswer;
	
	public QuestionsAndAnswers(String question, List<String> answers, int correctAnswer) {
		this.question = question;
		this.answers = answers;
		this.correctAnswer = correctAnswer;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public List<String> getAnswers() {
		return answers;
	}
	
	public int getCorrectAnswer() {
		return correctAnswer;
	}

}

