
package net.codetojoy.waro.domain

import net.codetojoy.waro.strategy.*

class Player {
    final String name
    final Strategy strategy 
    final PlayerStats playerStats = new PlayerStats()
    final Integer maxCard 
    List<Integer> hand = []

    Player(String name, Strategy strategy, Integer maxCard) {
        this.name = name
        this.strategy = strategy
        this.maxCard = maxCard
    }
        
    Bid getBid(int prizeCard) {
        def unmodifiableHand = Collections.unmodifiableList(hand)
        def offer = strategy.selectCard(prizeCard, unmodifiableHand, maxCard)

        def bid = new Bid(offer, this)        
        assert hand.contains(bid.offer)

        hand.remove(bid.offer as Object)
        
        return bid
    }
    
    void clear() {
        hand = []
        playerStats.clear()
    }
}
