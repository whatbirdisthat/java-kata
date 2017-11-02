public class Game {

    private int score;

    public int score() {
        return score;
    }

    public void bowl(int pins) {
        score += pins;
    }
}
