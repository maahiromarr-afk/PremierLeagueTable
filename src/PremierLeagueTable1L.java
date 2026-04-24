import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Kernel implementation of PremierLeagueTable.
 *
 * Convention: - points is not null. - Every team name in points is non-null and
 * not empty. - Every point value in points is non-negative.
 *
 * Correspondence: - this represents a PremierLeagueTable where each key in
 * points is a team, and each value is that team's current points.
 */
public class PremierLeagueTable1L extends PremierLeagueTableSecondary {

    private Map<String, Integer> points;

    public PremierLeagueTable1L() {
        this.points = new HashMap<>();
    }

    private void createNewRep() {
        this.points = new HashMap<>();
    }

    @Override
    public void clear() {
        this.createNewRep();
    }

    @Override
    public PremierLeagueTable newInstance() {
        return new PremierLeagueTable1L();
    }

    @Override
    public void transferFrom(PremierLeagueTable source) {
        PremierLeagueTable1L localSource = (PremierLeagueTable1L) source;
        this.points = localSource.points;
        localSource.createNewRep();
    }

    @Override
    public void addTeam(String team) {
        if (team == null || team.isEmpty()) {
            throw new IllegalArgumentException("team must not be empty");
        }
        if (!this.points.containsKey(team)) {
            this.points.put(team, 0);
        }
    }

    @Override
    public void recordMatch(String home, String away, int homeGoals,
            int awayGoals) {
        if (!this.containsTeam(home) || !this.containsTeam(away)) {
            throw new IllegalArgumentException("teams must be in table");
        }
        if (homeGoals < 0 || awayGoals < 0) {
            throw new IllegalArgumentException("goals must be non-negative");
        }

        if (homeGoals > awayGoals) {
            this.points.put(home, this.points.get(home) + 3);
        } else if (awayGoals > homeGoals) {
            this.points.put(away, this.points.get(away) + 3);
        } else {
            this.points.put(home, this.points.get(home) + 1);
            this.points.put(away, this.points.get(away) + 1);
        }
    }

    @Override
    public boolean containsTeam(String team) {
        return this.points.containsKey(team);
    }

    @Override
    public Set<String> getTeams() {
        return new HashSet<>(this.points.keySet());
    }

    @Override
    public int getPoints(String team) {
        if (!this.containsTeam(team)) {
            throw new IllegalArgumentException("team must be in table");
        }
        return this.points.get(team);
    }
}
