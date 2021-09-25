package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void giveMessageWhichContainSadAndReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am sad");
		String mood = moodAnalyser.analyser();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void giveMessageWhichContainHappyAndReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analyser();
		Assert.assertEquals("HAPPY", mood);
	}
}
