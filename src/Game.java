public class Game {


    private int[] frames = new int[20];

    public int score() {
        int theScore = 0;
        for (int i = 0; i < frames.length; i++) {
            if (i == frames.length-1) {
                theScore += frames[i];
                return theScore;
            }
            if (frames[i] + frames[i + 1] == 10) {
                theScore += frames[i];
                theScore += frames[i+1];
                theScore += frames[i+2];
                i++;
            } else {
                theScore += frames[i];
            }
        }
        return theScore;
    }

    int bowlCounter = 0;

    public void bowl(int pins) {
        frames[bowlCounter] = pins;
        bowlCounter++;
    }
}
