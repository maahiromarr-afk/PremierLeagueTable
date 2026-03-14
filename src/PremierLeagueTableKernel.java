import components.standard.Standard;

/**
 * Kernel interface for PremierLeagueTable.
 */
public interface PremierLeagueTableKernel extends Standard<PremierLeagueTable> {

    /**
     * Adds a team to the table.
     *
     * @param team
     *            the team to add
     * @updates this
     * @ensures team is added to this
     */
    void addTeam(String team);

    /**
     * Records the result of a match.
     *
     * @param home
     *            the home team
     * @param away
     *            the away team
     * @param homeGoals
     *            goals scored by the home team
     * @param awayGoals
     *            goals scored by the away team
     * @updates this
     * @requires home and away are in this
     * @ensures this is updated with the match result
     */
    void recordMatch(String home, String away, int homeGoals, int awayGoals);

    /**
     * Reports whether a team is in the table.
     *
     * @param team
     *            the team to check
     * @return true if team is in this, false otherwise
     * @ensures containsTeam = (team is in this)
     */
    boolean containsTeam(String team);
}
