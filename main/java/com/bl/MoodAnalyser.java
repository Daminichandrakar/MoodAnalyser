package com.bl;

public class MoodAnalyser {
	String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyser() {
		if (message.contains("sad")) {
			System.out.println("sad");
			return "SAD";
		}
		System.out.println("happy");
		return "HAPPY";
	}
}
