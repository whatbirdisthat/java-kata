class BowlingGame {

    private int[] rolls = new int[21];

    private int frameIndex = 0;

    int score() {
        int theScore = 0;
        for (int roll = 0; roll < rolls.length; roll++) {
            if (isStrike(frameIndex)) {
                int strikeBonus = rolls[frameIndex] + rolls[frameIndex + 1] + rolls[frameIndex + 2];
                theScore += strikeBonus;
            } else if (isSpare(frameIndex)) {
                int spareBonus = rolls[frameIndex] + rolls[frameIndex + 1];
                theScore += spareBonus;
            } else {
                theScore += rolls[frameIndex];
            }
            frameIndex++;
        }
        return theScore;
    }

    private boolean isStrike(int i) {
        return rolls[i] == 10 && frameIndex < 9;
    }

    private boolean isSpare(int i) {
        if (i == 0) {
            return false;
        }
        return rolls[i - 1] + rolls[i] == 10;
    }

    private int bowlCounter = 0;

    void bowl(int pins) {
        rolls[bowlCounter] = pins;
        bowlCounter++;
    }
}
