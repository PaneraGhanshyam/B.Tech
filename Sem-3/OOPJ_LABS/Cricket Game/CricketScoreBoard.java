import java.util.*;

abstract class CricketMatch {
    protected String team1;
    protected String team2;
    protected final int overs;
    protected int totalScore1;
    protected int totalScore2;
    protected int totalWicket1;
    protected int totalWicket2;
    protected int ballsPlayed1;
    protected int ballsPlayed2;


    public CricketMatch(String team1, String team2, int overs) {
        this.team1 = team1;
        this.team2 = team2;
        this.overs = overs;
    }

    public abstract void startMatch();
}

class Player {
    private String name;
    private int runs;
    private int ballsFaced;

    public Player(String name) {
        this.name = name;
        this.runs = 0;
        this.ballsFaced = 0;
    }

    public void addRuns(int runs) {
        this.runs += runs;
    }

    public void addBallFaced() {
        this.ballsFaced++;
    }

    public int getRuns() {
        return this.runs;
    }

    public int getBallsFaced() {
        return this.ballsFaced;
    }

    public double getStrikeRate() {
        return (ballsFaced > 0) ? (runs * 100.0 / ballsFaced) : 0.0;
    }

    public String getName() {
        return this.name;
    }
}

class Team {
    private String teamName;
    private Player[] players;
    private int totalRuns;
    private int wickets;
    private int ballsPlayed;
    protected int num4s=0;
    protected int num6s=0;
    protected int numWide=0;
    protected int numNoBall=0;

    public Team(String teamName, int numberOfPlayers) {
        this.teamName = teamName;
        players = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            
            players[i] = new Player("Player " + (i + 1));
        }
        totalRuns = 0;
        wickets = 0;
        ballsPlayed = 0;
    }

    public Player getPlayer(int index) {
        return players[index];
    }

    public void addRun(int runs) {
        this.totalRuns += runs;
    }

    public void addWicket() {
        this.wickets++;
    }

    public void addBall() {
        this.ballsPlayed++;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public int getWickets() {
        return wickets;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public String getTeamName() {
        return teamName;
    }
}

class Match extends CricketMatch {
    private Team teamBatting;

    public Match(String team1, String team2, int overs) {
        super(team1, team2, overs);
    }

    @Override
    public void startMatch() {
        teamBatting = new Team(team1, 11);
        System.out.println("\n\n"+team1 + " is batting.");

        playInnings(teamBatting,1000);

        System.out.println("\n\nTeam "+teamBatting.getTeamName()+" Data");
        System.out.println("**************************************************************************************************");
        System.out.println("Name\t\t\t\tBall Faced\t\tRuns\t\t\tStrike Rate\n");
        for(int i=0;i< 11;i++){
            Player p=teamBatting.getPlayer(i);
            System.out.print(p.getName());
            System.out.print("\t\t\t"+p.getBallsFaced());
            System.out.print("\t\t\t"+p.getRuns());
            System.out.print("\t\t\t"+p.getStrikeRate()+"\n");
        }
        System.out.println("**************************************************************************************************");

        totalScore1 = teamBatting.getTotalRuns();
        totalWicket1=teamBatting.getWickets();
        ballsPlayed1=teamBatting.getBallsPlayed();

        System.out.println("No of wide balls:"+teamBatting.numWide);
        System.out.println("No of No-Balls:"+teamBatting.numNoBall);
        System.out.println("No of 6's:"+teamBatting.num6s);
        System.out.println("No of 4's:"+teamBatting.num4s);
        System.out.println("Extra's:"+(teamBatting.numNoBall+teamBatting.numWide));
        System.out.println("\nTeam " + teamBatting.getTeamName() + " scored: " + totalScore1+"/" + totalWicket1+"\n\n\n\n\n");

        teamBatting = new Team(team2, 11);
        System.out.println(team2 + " is batting.");

        playInnings(teamBatting,totalScore1);

        System.out.println("\n\nTeam "+teamBatting.getTeamName()+" Data");
        System.out.println("**************************************************************************************************");
        System.out.println("Name\t\t\t\tBall Faced\t\tRuns\t\t\tStrike Rate\n");
        for(int i=0;i< 11;i++){
            Player p=teamBatting.getPlayer(i);
            System.out.print(p.getName());
            System.out.print("\t\t\t"+p.getBallsFaced());
            System.out.print("\t\t\t"+p.getRuns());
            System.out.print("\t\t\t"+p.getStrikeRate()+"\n");
        }
        System.out.println("**************************************************************************************************");

        totalScore2 = teamBatting.getTotalRuns();
        totalWicket2=teamBatting.getWickets();
        ballsPlayed2=teamBatting.getBallsPlayed();

        System.out.println("No of wide balls:"+teamBatting.numWide);
        System.out.println("No of No-Balls:"+teamBatting.numNoBall);
        System.out.println("No of 6's:"+teamBatting.num6s);
        System.out.println("No of 4's:"+teamBatting.num4s);
        System.out.println("Extra's:"+(teamBatting.numNoBall+teamBatting.numWide));
        System.out.println("Team " + teamBatting.getTeamName() + " scored: " + totalScore2+"/" + totalWicket2);
    }

    private void playInnings(Team teamBatting, int target) {
        boolean isFreeHit = false;
        int strikerIndex = 0;  
        int nonStrikerIndex = 1;  
        Player striker = teamBatting.getPlayer(strikerIndex);
        Player nonStriker = teamBatting.getPlayer(nonStrikerIndex);
    
        for (int over = 0; over < overs; over++) {
            if (teamBatting.getWickets() == 10 || (target != -1 && teamBatting.getTotalRuns() > target)) {
                break;      
            }
            System.out.println("\n\n***************** Over " + (over + 1)+" ******************\n");
            int ballsInOver = 0;
    
            while (ballsInOver < 6) {
                if (teamBatting.getWickets() == 10 || (target != -1 && teamBatting.getTotalRuns() > target)) {
                    break;  
                }
    
                double ballType = Math.random();
    
                if (ballType < 0.1) {
                    teamBatting.addRun(1);
                    teamBatting.numWide++;
                    System.out.println("Ball " + (ballsInOver + 1) + ": Wide ball! 1 extra run.");
                    continue;
                } else if (ballType < 0.15) {
                    teamBatting.addRun(1);
                    teamBatting.numNoBall++;
                    System.out.println("Ball " + (ballsInOver + 1) + ": No ball! 1 extra run and free hit.");
                    isFreeHit = true;
                    continue;
                }
    
                int runs = generateRuns();
                teamBatting.addRun(runs);
                teamBatting.addBall();
    
                striker.addRuns(runs);
                striker.addBallFaced();
    
                if (runs == 0 && Math.random() < 0.1 && !isFreeHit) {
                    teamBatting.addWicket();
                    System.out.println("Ball " + (ballsInOver + 1) + ": Wicket!");
                    strikerIndex++;
                    if (teamBatting.getWickets() < 10) {
                        striker = teamBatting.getPlayer(strikerIndex);
                    }
                } else {
                    System.out.println("Ball " + (ballsInOver + 1) + ": " + runs + " runs.");
                    if (runs == 1 || runs == 3) {
                        Player temp = striker;
                        striker = nonStriker;
                        nonStriker = temp;
                    }
                }
    
                ballsInOver++;
                isFreeHit = false;
            }
            System.out.println("Score after " + (over + 1) + " overs: " + teamBatting.getTotalRuns() + "/" + teamBatting.getWickets());
    
            if (target != -1 && teamBatting.getTotalRuns() > target) {
                break;  
            }
        }
    }
    
    
    public String getWinner() {
        System.out.println("\n\n***************** Team "+team1+" Data ******************");
        System.out.println(""+team1+" Score Is : "+totalScore1+"/"+totalWicket1);
        System.out.println("Average runs per over: " + (totalScore1 / (ballsPlayed1 / 6.0)));

        System.out.println();

        System.out.println("\n\n***************** Team "+team2+" Data ******************");
        System.out.println(team2+" Score Is : "+totalScore2+"/"+totalWicket2);
        System.out.println("Average runs per over: " + (totalScore2 / (ballsPlayed2 / 6.0)));

        if (totalScore1 > totalScore2) {
            return "\n***************** Team "+team1+" Wins! *****************";
        } else if (totalScore2 > totalScore1) {
            return "\n***************** Team "+team2+" Wins! *****************";
        } else {
            return "\n***************** Match Tie! ******************";
        }
    }
    private int generateRuns() {
        double randomValue = Math.random(); 
    
        if (randomValue < 0.40) {
            return 0;  
        } else if (randomValue < 0.75) {
            return 1;  
        } else if (randomValue < 0.70) {
            return 2;  
        } else if (randomValue < 0.80) {
            return 3;  
        } else if (randomValue < 0.85) {
            teamBatting.num4s++;
            return 4;  
        } else {
            teamBatting.num6s++;
            return 6; 
        }
    }
}

public class CricketScoreBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter team 1 name:");
            String team1 = scanner.nextLine();

            System.out.print("Enter team 2 name:");
            String team2 = scanner.nextLine();

            System.out.print("Enter number of overs:");
            int overs = scanner.nextInt();

            if (overs != 20 && overs !=50) {
                throw new InvalidOversException("Number of overs must be either 20 or 50.");
            }

            Match match = new Match(team1, team2, overs);
            match.startMatch();

            System.out.println(match.getWinner());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter the correct type of values.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
class InvalidOversException extends IllegalArgumentException {
    public InvalidOversException(String message) {
        super(message);
    }
}
