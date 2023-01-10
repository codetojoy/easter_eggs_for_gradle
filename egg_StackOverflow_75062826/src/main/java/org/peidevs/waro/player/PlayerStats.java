package org.peidevs.waro.player;

public record PlayerStats (int total, int numGamesWon, int numRoundsWon) {
    
    public PlayerStats() {
        this(0, 0, 0);
    }

    public String toString() {
        return " total: " + total + " # games: " + numGamesWon + " # rounds: " + numRoundsWon;
    }
    
    public PlayerStats winsGame() {
        var newPlayerStats = new PlayerStats(this.total, this.numGamesWon + 1, this.numRoundsWon);
        return newPlayerStats;
    }

    public PlayerStats winsRound(int prizeCard) {
        var newPlayerStats = new PlayerStats(this.total + prizeCard, this.numGamesWon, this.numRoundsWon + 1);
        return newPlayerStats;
    }
    
    public PlayerStats reset() {
        var newPlayerStats = new PlayerStats(0, this.numGamesWon, 0);
        return newPlayerStats;
    }
}
