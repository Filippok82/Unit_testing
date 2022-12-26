package tdd;

public class MoodAnalysis {
    public String analysisMood(String message) {
        if (message.contains("грустное")) {
            return "SAD";
        } else return "HAPPY";
    }
}
