import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    private void bowlMany(int bowls, int pins) {
        for (int i = 0; i < bowls; i++) {
            bowlingGame.bowl(pins);
        }
    }

    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void testZeroGame() {

        bowlMany(20, 0);
        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void testGameOfOnes() {
        bowlMany(20, 1);
        assertEquals(20, bowlingGame.score());
    }

    @Test
    public void testOneSpare() {
        bowlingGame.bowl(5);
        bowlingGame.bowl(5);
        bowlingGame.bowl(4);
        bowlingGame.bowl(1);

        bowlMany(16, 0);
        assertEquals(19, bowlingGame.score());
    }

    @Test
    public void testTwoSpares() {

        bowlingGame.bowl(5);
        bowlingGame.bowl(5);
        bowlingGame.bowl(4);
        bowlingGame.bowl(5);
        bowlingGame.bowl(6);
        bowlingGame.bowl(4);
        bowlMany(13, 0);
        assertEquals(33, bowlingGame.score());
    }

    @Test
    public void testTwoSparesAndNonZeroGame() {

        bowlingGame.bowl(7);
        bowlingGame.bowl(2);
        bowlingGame.bowl(3);
        bowlingGame.bowl(7);
        bowlingGame.bowl(6);
        bowlingGame.bowl(2);
        bowlingGame.bowl(5);
        bowlingGame.bowl(5);
        bowlingGame.bowl(8);
        bowlingGame.bowl(1);
        bowlingGame.bowl(3);
        bowlingGame.bowl(2);
        bowlingGame.bowl(4);
        bowlingGame.bowl(1);
        bowlingGame.bowl(1);
        bowlingGame.bowl(6);
        bowlingGame.bowl(8);
        bowlingGame.bowl(0);
        bowlingGame.bowl(5);
        bowlingGame.bowl(3);

        assertEquals(93, bowlingGame.score());
    }

    @Test
    public void testOneStrike() {

        bowlingGame.bowl(10);
        bowlingGame.bowl(5);
        bowlingGame.bowl(5);
        bowlMany(16, 0);
        assertEquals(30, bowlingGame.score());
    }

    @Test
    public void testTwoStrikes() {

        bowlingGame.bowl(10);
        bowlingGame.bowl(5);
        bowlingGame.bowl(4);
        bowlingGame.bowl(10);
        bowlingGame.bowl(3);
        bowlingGame.bowl(2);
        bowlMany(12, 0);
        assertEquals(48, bowlingGame.score());
    }

    @Test
    public void testPerfectGame() {
        bowlMany(12, 10);
        assertEquals(300, bowlingGame.score());
    }

}
