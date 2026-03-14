/**
 * Enhanced interface for PremierLeagueTable.
 */
public interface PremierLeagueTable extends PremierLeagueTableKernel {

    /**
     * Reports the number of points for a team.
     *
     * @param team
     *            the team to check
     * @return the number of points for team
     * @requires team is in this
     * @ensures getPoints = points for team in this
     */
    int getPoints(String team);

    /**
     * Reports the current leader of the table.
     *
     * @return the team with the most points
     * @requires this /= empty
     * @ensures getLeader = leader of this
     */
    String getLeader();

    /**
     * Reports the number of teams in the table.
     *
     * @return the number of teams
     * @ensures size = number of teams in this
     */
    int size();
}