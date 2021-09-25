package com.bl;

public class MoodAnalyser {
	String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}


	public String analyser() {
			try {

				if (message.contains("sad")) {
					System.out.println("sad");
					return "SAD";
				} 
				return "HAPPY";
			} catch (NullPointerException e) {

				return "HAPPY";
			}
	}
}
