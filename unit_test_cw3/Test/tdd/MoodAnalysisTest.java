package tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;


public class MoodAnalysisTest {

    @Test
    void testMoodAnalysis() {
        MoodAnalysis moodAnalysis = new MoodAnalysis();
        String mood = moodAnalysis.analysisMood("Это грустное сообщение");

        assertThat(mood).isEqualTo("SAD");

    }

    @Test
    void testHappyMoodAnalysis(){
        MoodAnalysis moodAnalysis = new MoodAnalysis();
        String mood = moodAnalysis.analysisMood("Это веселое сообщение");

        assertThat(mood).isEqualTo("HAPPY");
    }
}