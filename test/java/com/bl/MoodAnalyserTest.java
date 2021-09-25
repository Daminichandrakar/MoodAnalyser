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

	@Test(expected = MoodAnalyserException.class)
	public void givenMessage_WhenNull_ShouldReturnNull() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String result = moodAnalyser.analyser();
		Assert.assertEquals("Enter Proper Message. NULL Not Allowed", result);
	}

	@Test(expected = MoodAnalyserException.class)
	public void givenMessage_WhenEmpty_ShouldReturnEmpty() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		String result = moodAnalyser.analyser();
		Assert.assertEquals("Enter Proper Message. EMPTY Not Allowed", result);
	}
}
