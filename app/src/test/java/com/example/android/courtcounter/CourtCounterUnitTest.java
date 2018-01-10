package com.example.android.courtcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CourtCounterUnitTest {
//   @Before
//   public void setup() throws Exception {
//       // Setup before running tests
//       int numPtsA = 0;
       MainActivity mymain = new MainActivity();
       MainActivity.Team teamA = new MainActivity.Team();
       MainActivity.Team teamB = new MainActivity.Team();

    @Test
    //Canary test
    public void addition_isCorrect() throws Exception {
//       setup();
       assertEquals(4, 2 + 2);
    }

    @Test
    public void test_add3pt_to_TeamsAorB() throws Exception {
        assertEquals(3, mymain.add3PtsToTeam(teamA));
        assertEquals(3, mymain.add3PtsToTeam(teamB));
        assertEquals(6, mymain.add3PtsToTeam(teamA));
        assertEquals(6, mymain.add3PtsToTeam(teamB));
    }
    @Test
    public void test_add2pt_to_TeamsAorB() throws Exception {
        mymain.teamA.setPoints(0);
        mymain.teamB.setPoints(0);
        assertEquals(2, mymain.add2PtsToTeam(teamA));
        assertEquals(4, mymain.add2PtsToTeam(teamA));
        assertEquals(2, mymain.add2PtsToTeam(teamB));
        assertEquals(4, mymain.add2PtsToTeam(teamB));
    }
    @Test
    public void test_FreeThrow_to_TeamsAorB() throws Exception {
        mymain.teamA.setPoints(0);
        mymain.teamB.setPoints(0);
        assertEquals(1, mymain.addFreeThrowToTeam(teamA));
        assertEquals(2, mymain.addFreeThrowToTeam(teamA));
        assertEquals(1, mymain.addFreeThrowToTeam(teamB));
        assertEquals(2, mymain.addFreeThrowToTeam(teamB));
    }
    @Test
    public void test_resetButton() throws Exception {
        mymain.resetPoints();
        assertEquals(0,mymain.teamA.getPoints());
        assertEquals(0,mymain.teamB.getPoints());
    }
}