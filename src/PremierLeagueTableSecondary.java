public abstract class PremierLeagueTableSecondary
        implements PremierLeagueTable {

    @Override
    public String getLeader() {
        String leader = null;
        int maxPoints = -1;

        for (String team : this.getTeams()) {
            int pts = this.getPoints(team);
            if (pts > maxPoints) {
                maxPoints = pts;
                leader = team;
            }
        }

        return leader;
    }

    @Override
    public int size() {
        return this.getTeams().size();
    }
}