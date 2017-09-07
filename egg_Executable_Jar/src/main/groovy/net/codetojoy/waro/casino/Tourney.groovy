
package net.codetojoy.waro.casino

import net.codetojoy.waro.domain.*
import net.codetojoy.waro.Config

class Tourney {
    final List<Player> players = []
    final int numGames
    final int numCards
    
    Tourney(Config config) {
        players = config.players
        numGames = config.numGames
        numCards = config.numCards
    }
    
    void playGames() {
        numGames.times {
            playGame(numCards)
        }

        println "\nTourney summary:  "

        players.each { p ->
            println "${p.name} has ${p.playerStats.numGamesWon} wins over ${numGames} games"
        }        
    }
    
    // ------- internal 
    
    protected void playGame(int numCards) {
        def game = new Game()
        // game.verbose = false
        game.playGame(numCards, players)    
        players.each { p -> p.clear() }        
    }
    
}
