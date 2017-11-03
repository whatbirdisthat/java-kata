import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    private Game game;

    private void bowlMany(int bowls, int pins) {
        for (int i = 0; i < bowls; i++) {
            game.bowl(pins);
        }
    }

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void testZeroGame() {

        bowlMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void testGameOfOnes() {
        bowlMany(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void testOneSpare() {
        game.bowl(5);
        game.bowl(5);
        game.bowl(4);
        game.bowl(1);

        bowlMany(16, 0);
        assertEquals(19, game.score());
    }

    @Test
    public void testTwoSpares() {

        game.bowl(5);
        game.bowl(5);
        game.bowl(4);
        game.bowl(5);
        game.bowl(6);
        game.bowl(4);
        bowlMany(13, 0);
        assertEquals(33, game.score());
    }

    @Test
    public void testTwoSparesAndNonZeroGame() {

        game.bowl(7);
        game.bowl(2);
        game.bowl(3);
        game.bowl(7);
        game.bowl(6);
        game.bowl(2);
        game.bowl(5);
        game.bowl(5);
        game.bowl(8);
        game.bowl(1);
        game.bowl(3);
        game.bowl(2);
        game.bowl(4);
        game.bowl(1);
        game.bowl(1);
        game.bowl(6);
        game.bowl(8);
        game.bowl(0);
        game.bowl(5);
        game.bowl(3);

        assertEquals(93, game.score());
    }

    @Test
    public void testOneStrike() {

        game.bowl(10);
        game.bowl(5);
        game.bowl(5);
        bowlMany(16, 0);
        assertEquals(30, game.score());
    }

    @Test
    public void testTwoStrikes() {

        game.bowl(10);
        game.bowl(5);
        game.bowl(4);
        game.bowl(10);
        game.bowl(3);
        game.bowl(2);
        bowlMany(12, 0);
        assertEquals(48, game.score());
    }

    @Test
    public void testPerfectGame() {
        bowlMany(12, 10);
        assertEquals(300, game.score());
    }

}
