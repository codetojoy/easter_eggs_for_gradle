
package net.codetojoy.waro.domain

class Table {
    final List<Player> players 
    final List<Integer> kitty
    
    Table(List<Player> players, List<Integer> kitty) {
        this.players = players
        this.kitty = kitty
    }
    
    void assertTotals() {
        def playerTotal = 0
        def roundsTotal = 0
                
        players.each { p ->
            playerTotal += p.playerStats.total
            roundsTotal += p.playerStats.numRoundsWon
        }

        assert kitty.sum() == playerTotal
        assert kitty.size() == roundsTotal        
    }
}
