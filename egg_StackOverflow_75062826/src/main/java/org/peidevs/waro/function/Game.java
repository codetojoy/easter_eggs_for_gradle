package org.peidevs.waro.function;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import static java.util.stream.Collectors.toList;
import static java.util.Comparator.comparing;

import org.peidevs.waro.player.*;
import org.peidevs.waro.table.*;
import org.peidevs.waro.util.*;

public class Game implements UnaryOperator<List<Player>> {
    private final Log logger;
    private final int numPlayers;
    private final int numCards;

    public Game(int numPlayers, int numCards, boolean isVerbose) {
        this.numPlayers = numPlayers;
        this.numCards = numCards;
        this.logger = new Log(isVerbose);
    }

    @Override
    public List<Player> apply(List<Player> players) {
        var dealer = new Dealer();
        var table = dealer.deal(numPlayers, numCards, players.stream());

        var kitty = table.kitty();
        var readyPlayers = table.players();

        logger.log("INIT", kitty, readyPlayers);

        Stream<Player> newPlayers = play(kitty, readyPlayers.stream());

        var newPlayers2 = determineWinner(newPlayers.collect(toList()));

        logger.log("FINAL", newPlayers2);

        return newPlayers2;
    }

    protected Stream<Player> play(Hand kitty, Stream<Player> players) {
        Stack<Stream<Player>> results = new Stack<>();
        results.push(players);

        kitty.cardsAsIntStream()
             .boxed()
             .map(prizeCard -> new Round(prizeCard))
             .forEach(round -> results.push(round.apply(results.pop())));

        return results.pop();
    }

    // ---- internal

    protected List<Player> determineWinner(List<Player> players) {
        var winner = players.stream()
                               .max( comparing(Player::getTotal).reversed() )
                               .get()
                               .winsGame();

        var winnerName = winner.getName();
        var newPlayers = players.stream()
                                .filter(p->!p.getName().equals(winnerName))
                                .collect(toList());
        newPlayers.add(winner);
        return newPlayers;
    }

}
