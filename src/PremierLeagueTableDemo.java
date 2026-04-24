public final class PremierLeagueTableDemo {

    private PremierLeagueTableDemo() {
    }

    public static void main(String[] args) {
        PremierLeagueTable table = new PremierLeagueTable1L();

        table.addTeam("Arsenal");
        table.addTeam("Chelsea");

        table.recordMatch("Arsenal", "Chelsea", 2, 1);

        System.out.println("Arsenal points: " + table.getPoints("Arsenal"));
        System.out.println("Chelsea points: " + table.getPoints("Chelsea"));
        System.out.println("Leader: " + table.getLeader());
    }
}