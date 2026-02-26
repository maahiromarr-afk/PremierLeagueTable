import java.util.HashMap;
import java.util.Map;

public class PremierLeagueTable {

    private final Map<String, Integer> points;

    public PremierLeagueTable() {
        this.points = new HashMap<>();
    }

    public void addTeam(String team) {
        if (team == null || team.isBlank()) {
            throw new IllegalArgumentException("Team name is invalid");
        }

        if (!this.points.containsKey(team)) {
            this.points.put(team, 0);
        }
    }

    public boolean containsTeam(String team) {
        return this.points.containsKey(team);
    }

    public void recordMatch(String home, String away, int homeGoals,
            int awayGoals) {
        if (!this.containsTeam(home) || !this.containsTeam(away)) {
            throw new IllegalArgumentException("Team not found");
        }

        if (homeGoals > awayGoals) {
            this.points.put(home, this.points.get(home) + 3);
        } else if (homeGoals < awayGoals) {
            this.points.put(away, this.points.get(away) + 3);
        } else {
            this.points.put(home, this.points.get(home) + 1);
            this.points.put(away, this.points.get(away) + 1);
        }
    }

    public int getPoints(String team) {
        if (!this.containsTeam(team)) {
            throw new IllegalArgumentException("Team not found");
        }

        return this.points.get(team);
    }

    public String getLeader() {
        String leader = null;
        int max = -1;

        for (String team : this.points.keySet()) {
            int currentPoints = this.points.get(team);
            if (currentPoints > max) {
                max = currentPoints;
                leader = team;
            }
        }

        return leader;
    }

    public int size() {
        return this.points.size();
    }

    public static void main(String[] args) {
        PremierLeagueTable table = new PremierLeagueTable();

        table.addTeam("Arsenal");
        table.addTeam("Chelsea");
        table.addTeam("Liverpool");

        table.recordMatch("Arsenal", "Chelsea", 2, 1);
        table.recordMatch("Liverpool", "Arsenal", 1, 1);

        System.out.println("Total teams: " + table.size());
        System.out.println("Arsenal points: " + table.getPoints("Arsenal"));
        System.out.println("Chelsea points: " + table.getPoints("Chelsea"));
        System.out.println("Liverpool points: " + table.getPoints("Liverpool"));
        System.out.println("Current leader: " + table.getLeader());
    }
}