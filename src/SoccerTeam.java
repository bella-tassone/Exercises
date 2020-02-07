public class SoccerTeam {

    private int wins;
    private int losses;
    private int ties;
    private int points;
    private static int totalGames = 0;
    private static int totalGoals = 0;

    public SoccerTeam(int w, int l, int t) {
        wins = w;
        losses = l;
        ties = t;
        points = 0;
    }

    public static void startTournament() {
        totalGames = 0;
        totalGoals = 0;
    }

    public static int getTotalGames() {
        return totalGames;
    }

    public static int getTotalGoals() {
        return totalGoals;
    }

    public void played(SoccerTeam other, int myScore, int otherScore) {
        totalGames++;
        totalGoals+=(myScore+otherScore);
        if (myScore > otherScore) {
            this.wins++;
            other.losses++;
        }
        else if (myScore < otherScore) {
            this.losses++;
            other.wins++;
        }
        else {
            this.ties++;
            other.ties++;
        }
    }

    public int numberPoints() {
        points = wins*3 + ties;
        return points;
    }

    public void reset() {
        wins = 0;
        ties = 0;
        losses = 0;
        points = 0;
    }

































}
