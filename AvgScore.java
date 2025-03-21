public class AvgScore {
    public static void playerName(String name, int numberOfMatches, int totalRuns) {
        System.out.println("Player Name: " + name);
        double avgScore = (double) totalRuns / numberOfMatches;
        System.out.println("Average Score: " + avgScore);
    }
}