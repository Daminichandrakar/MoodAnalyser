package com.bl;

public class MoodAnalyser {
	public String analyser(String message) {
		if (message.contains("sad")) {
			System.out.println("sad");
			return "SAD";
		}
			System.out.println("happy");
			return "HAPPY";
	}
}
