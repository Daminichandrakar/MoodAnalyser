package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void giveMessageWhichContainSadAndReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyser("I am sad");
		Assert.assertEquals("SAD", mood);
	}
	
	@Test
	public void giveMessageWhichContainHappyAndReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyser("I am in Any Mood");
		Assert.assertEquals("HAPPY", mood);
	}
}
