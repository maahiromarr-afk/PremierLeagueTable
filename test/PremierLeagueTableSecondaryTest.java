public class PremierLeagueTableSecondaryTest {

    @Test
    public void testSize() {
        PremierLeagueTable table = new PremierLeagueTable1L();

        table.addTeam("Arsenal");
        table.addTeam("Chelsea");

        assertEquals(2, table.size());
    }

    @Test
    public void testGetLeader() {
        PremierLeagueTable table = new PremierLeagueTable1L();

        table.addTeam("Arsenal");
        table.addTeam("Chelsea");

        table.recordMatch("Arsenal", "Chelsea", 2, 1);

        assertEquals("Arsenal", table.getLeader());
    }

    @Test
    public void testToStringNotNull() {
        PremierLeagueTable table = new PremierLeagueTable1L();

        table.addTeam("Arsenal");

        assertEquals(true, table.toString() != null);
    }

    @Test
    public void testEqualsSameSize() {
        PremierLeagueTable table1 = new PremierLeagueTable1L();
        PremierLeagueTable table2 = new PremierLeagueTable1L();

        table1.addTeam("Arsenal");
        table2.addTeam("Arsenal");

        assertEquals(true, table1.equals(table2));
    }
}
