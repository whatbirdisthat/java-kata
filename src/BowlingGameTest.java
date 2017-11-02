import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    Game game = new Game();

    @Test
    public void testZeroGame() {
        bowlMany(20, 0);
        assertEquals(0, game.score());
    }

    private void bowlMany(int bowls, int pins) {
        for (int i = 0; i < bowls; i++) {
            game.bowl(pins);
        }
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
        game.bowl(5);
        bowlMany(17, 0);
        assertEquals(20, game.score());
    }

}
