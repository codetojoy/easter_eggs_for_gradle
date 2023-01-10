package org.peidevs.waro.player;

import java.util.List;

import org.peidevs.waro.strategy.Strategy;
import org.peidevs.waro.table.Hand;

public class Player {
    private final String name;
    private final Strategy strategy;
    private final PlayerStats playerStats;
    private final int maxCard;
    private final Hand hand;

    public Player(String name, Strategy strategy, int maxCard) {
        this(name, strategy, maxCard, new Hand(), new PlayerStats());
    }

    public Player(String name, Strategy strategy, int maxCard, Hand hand) {
        this(name, strategy, maxCard, hand, new PlayerStats());
    }

    private Player(String name, Strategy strategy, int maxCard, Hand hand, PlayerStats playerStats) {
        this.name = name;
        this.strategy = strategy;
        this.maxCard = maxCard;
        this.hand = hand;
        this.playerStats = playerStats;
    }

    public PlayerStats getPlayerStats() {
        return playerStats;
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("name: " + name);
        buffer.append(" stats: " + playerStats.toString());
        buffer.append(" hand: " + hand.toString());
        return buffer.toString();
    }

    public String toString(int numGames) {
        return "name: " + name + " won: " + playerStats.numGamesWon() + " of " + numGames + " games";
    }

    public int getNumGamesWon() { return playerStats.numGamesWon(); }

    public int getTotal() { return playerStats.total(); }

    public String getName() { return name; }

    public Player winsGame() {
        var newPlayerStats = playerStats.winsGame();
        var newPlayer = new Player(name, strategy, maxCard, hand, newPlayerStats);
        return newPlayer;
    }

    public Player winsRound(Bid bid) {
        var newHand = hand.select(bid.offer());
        var newPlayerStats = playerStats.winsRound(bid.prizeCard());
        var newPlayer = new Player(name, strategy, maxCard, newHand, newPlayerStats);
        return newPlayer;
    }

    public Player losesRound(Bid bid) {
        var newHand = hand.select(bid.offer());
        var newPlayer = new Player(name, strategy, maxCard, newHand, this.playerStats);
        return newPlayer;
    }

    public Bid getBid(int prizeCard) {
        int offer = strategy.selectCard(prizeCard, hand.cardsAsIntStream(), maxCard);
        // TODO: ensure that offer is contained in hand ! (no cheaters)

        var bid = new Bid(prizeCard, offer, this);

        return bid;
    }

    public long getNumCardsInHand() {
        return hand.cardsAsIntStream().boxed().count();
    }

    public Player reset(Hand newHand) {
        var newPlayerStats = playerStats.reset();
        var newPlayer = new Player(name, strategy, maxCard, newHand, newPlayerStats);
        return newPlayer;
    }
}
