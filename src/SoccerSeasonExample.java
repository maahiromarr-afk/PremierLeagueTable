public final class SoccerSeasonExample {

    private SoccerSeasonExample() {
    }

    public static void main(String[] args) {
        PremierLeagueTable table = new PremierLeagueTable1L();

        table.addTeam("ManCity");
        table.addTeam("Liverpool");
        table.addTeam("Tottenham");

        table.recordMatch("ManCity", "Liverpool", 1, 1);
        table.recordMatch("Tottenham", "ManCity", 0, 2);
        table.recordMatch("Liverpool", "Tottenham", 3, 1);

        System.out.println("ManCity points: " + table.getPoints("ManCity"));
        System.out.println("Liverpool points: " + table.getPoints("Liverpool"));
        System.out.println("Tottenham points: " + table.getPoints("Tottenham"));
        System.out.println("Leader: " + table.getLeader());
    }
}