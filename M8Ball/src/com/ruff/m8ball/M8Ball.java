package com.ruff.m8ball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class M8Ball {
	
	private String question;
	private List<String> answers;
	Random rand = new Random(); 
	int choice = (int) (Math.random()*4);
	
	
	public M8Ball() {
		this.question = null;
		answers = new ArrayList<String>(); 
		answers.add("Yes");
		answers.add("As I see it yes.");
		answers.add("Ask again later.");
		answers.add("No");
		
	}

	public String getQuestion() {
		return this.question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	boolean askQuestion(String question) {
		if(question instanceof String) {
			this.question = question;
			return true;
		}
		else {
			return false;
	}

}

	public String shake() {
	//	String randomElement = answers.get(rand.nextInt(answers.size())); 
	//	System.out.println(randomElement);
	//	System.out.println(choice);
	//	System.out.println(answers[rnd]);
	//	return answers.get(choice); 
		
		Random r = new Random();
		int randomIndex=r.nextInt(4);
		System.out.println("Your answer is: " + answers.get(randomIndex));
		return answers.get(randomIndex);

		
	
	}

	
}