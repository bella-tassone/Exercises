public class SoccerTeam {

    private int wins;
    private int losses;
    private int ties;
    private int points;
    private static int totalGames = 0;
    private static int totalGoals = 0;

    public SoccerTeam() {
        wins = 0;
        losses = 0;
        ties = 0;
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
        return points;
    }

    public void reset() {
        wins = 0;
        ties = 0;
        losses = 0;
        points = 0;
    }

    public static void main(String[] args) {
        SoccerTeam red = new SoccerTeam();
        SoccerTeam blue = new SoccerTeam();
        SoccerTeam yellow = new SoccerTeam();
        SoccerTeam green = new SoccerTeam();
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
        red.reset(); blue.reset(); yellow.reset(); green.reset();
        startTournament();
        System.out.println();
        red.played(yellow, 2, 5); //yellow wins, red loses
        blue.played(green, 3,2); //blue wins, green loses
        red.played(blue, 1, 1); //red and blue tie
        green.played(yellow, 4, 3); //green wins, yellow loses
        System.out.println("Team Red has " + red.numberPoints() + " points.");
        System.out.println("Team Blue has " + blue.numberPoints() + " points.");
        System.out.println("Team Yellow has " + yellow.numberPoints() + " points.");
        System.out.println("Team Green has " + green.numberPoints() + " points.");
        System.out.println(getTotalGames() + " games have been played.");
        System.out.println(getTotalGoals() + " total goals have been scored.");
    }
}

/* OUTPUT:

Team Red has 4 points.
Team Blue has 3 points.
Team Yellow has 1 points.
Team Green has 2 points.
4 games have been played.
18 total goals have been scored.

Team Red has 1 points.
Team Blue has 4 points.
Team Yellow has 3 points.
Team Green has 3 points.
4 games have been played.
21 total goals have been scored.

 */