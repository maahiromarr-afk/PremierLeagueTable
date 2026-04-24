public class PremierLeagueTable1LTest {

    @Test
    public void testAddTeam() {
        PremierLeagueTable table = new PremierLeagueTable1L();
        table.addTeam("Arsenal");
        assertEquals(true, table.containsTeam("Arsenal"));
    }

    @Test
    public void testPointsStartAtZero() {
        PremierLeagueTable table = new PremierLeagueTable1L();
        table.addTeam("Chelsea");
        assertEquals(0, table.getPoints("Chelsea"));
    }

    @Test
    public void testRecordWin() {
        PremierLeagueTable table = new PremierLeagueTable1L();
        table.addTeam("Arsenal");
        table.addTeam("Chelsea");

        table.recordMatch("Arsenal", "Chelsea", 2, 1);

        assertEquals(3, table.getPoints("Arsenal"));
        assertEquals(0, table.getPoints("Chelsea"));
    }

    @Test
    public void testRecordDraw() {
        PremierLeagueTable table = new PremierLeagueTable1L();
        table.addTeam("Liverpool");
        table.addTeam("ManCity");

        table.recordMatch("Liverpool", "ManCity", 1, 1);

        assertEquals(1, table.getPoints("Liverpool"));
        assertEquals(1, table.getPoints("ManCity"));
    }

    @Test
    public void testClear() {
        PremierLeagueTable table = new PremierLeagueTable1L();
        table.addTeam("Arsenal");

        table.clear();

        assertEquals(false, table.containsTeam("Arsenal"));
    }
}
