package org.peidevs.waro;

import org.peidevs.waro.function.Tourney;
import org.peidevs.waro.player.Player;
import org.peidevs.waro.player.PlayerStats;
import org.peidevs.waro.config.ConfigService;

import java.util.List;
import static java.util.Comparator.comparing;

// To configure players, numGames, etc, see org.peidevs.waro.config.Config
// This is compile-time configuration

public class Main {

    public static void main(String... args) {
        // read configuration
        var configService = new ConfigService();
        int numPlayers = configService.getNumPlayers();
        int numCards = configService.getNumCards();
        int numGames = configService.getNumGames();
        boolean isVerbose = configService.isVerbose();
        var players = configService.getPlayers();

        // play the games
        var tourney = new Tourney(numPlayers, numCards, numGames, isVerbose);

        tourney.apply(players)
               .stream()
               .sorted(comparing(Player::getNumGamesWon).reversed())
               .forEach(p -> System.out.println(p.toString(numGames)));
    }
}
