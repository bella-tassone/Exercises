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
            this.points+=3;
        }
        else if (myScore < otherScore) {
            this.losses++;
            other.wins++;
            other.points+=3;
        }
        else {
            this.ties++;
            other.ties++;
            this.points++;
            other.points++;
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

    public static void main(String[] args) {
        SoccerTeam red = new SoccerTeam(0, 0,0);
        SoccerTeam blue = new SoccerTeam(0, 0,0);
        SoccerTeam yellow = new SoccerTeam(0, 0,0);
        SoccerTeam green = new SoccerTeam(0, 0,0);
        startTournament();
        red.played(blue, 3, 2); //red wins, blue loses
        yellow.played(green, 1, 1); //yellow and green tie
        red.played(green, 4, 4); //red and green tie
        yellow.played(blue, 1, 2); //yellow loses, blue wins
        System.out.println("Team Red has " + red.numberPoints() + " points.");
        System.out.println("Team Blue has " + blue.numberPoints() + " points.");
        System.out.println("Team Yellow has " + yellow.numberPoints() + " points.");
        System.out.println("Team Green has " + green.numberPoints() + " points.");
        System.out.println(getTotalGames() + " games have been played.");
        System.out.println(getTotalGoals() + " total goals have been scored.");
















    }
}
