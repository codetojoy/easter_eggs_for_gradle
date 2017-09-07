
package net.codetojoy.waro.domain

class PlayerStats {
    def total = 0
    def numGamesWon = 0
    def numRoundsWon = 0
            
    void clear() {
        total = 0
        numRoundsWon = 0
    }
}
