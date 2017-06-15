package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.experimental.theories.Theories.TheoryAnchor;

public class QuizMaker {

	public static void main(String[] args) {

		File file = getFileFromUser();
		List<QuestionsAndAnswers> questions = new ArrayList<QuestionsAndAnswers>();
		int correctAnswers = 0;
		
		try (Scanner fileInput = new Scanner(file)) {
			while (fileInput.hasNextLine()) {
				String line = fileInput.nextLine();
				String[] parts = line.split("\\|");

				String prompt = parts[0];
				List<String> answers = new ArrayList<String>();
				int theAnswer = 0;
				for (int i = 1; i < parts.length; i++) {
					String answer = parts[i];

					if (answer.contains("*")) {
						theAnswer = i - 1;
						answer = answer.replace("*", "");
					}

					answers.add(answer);
				}

				questions.add(new QuestionsAndAnswers(prompt, answers, theAnswer));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (QuestionsAndAnswers question : questions) {
			System.out.println(question.getQuestion());
			System.out.println(question.getAnswers());

			System.out.println("What's your guess?");
			Scanner input = new Scanner(System.in);
			String userGuess = input.nextLine();

			if (userGuess.equals(question.getAnswers().get(question.getCorrectAnswer()))) {
				System.out.println("Great! you got it");
				correctAnswers += 1;

			} else {
				System.out.println("...Nice try, maybe next time.");

			}
		}
		System.out.println("You got " + correctAnswers + " answer(s) correct out of the total " + questions.size() + " questions asked");
	}

	private static File getFileFromUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please tell me where your file is?");
		String path = input.nextLine();

		File file = new File(path);
		if (!file.exists()) {
			System.out.println("Sorry, That file doesn't exist");
			System.exit(1);
		} else if (!file.isFile()) {
			System.out.println(path + " is a directory.");
			System.exit(1);
		}
		return file;
	}

}
