import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    @Test
    public void testZeroGame() {

        Game game = new Game();

        for (int i = 0; i < 20; i++) {
            game.bowl(0);
        }

        assertEquals(0, game.score());
    }

    @Test
    public void testGameOfOnes() {
        Game game = new Game();
        for (int i = 0; i < 20; i++) {
            game.bowl(1);
        }
        assertEquals(20, game.score());
    }

}
