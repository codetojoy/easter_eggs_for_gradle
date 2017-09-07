
package net.codetojoy.waro.domain

import net.codetojoy.waro.strategy.*

class PlayerTestCase extends GroovyTestCase {

    def strategy = new PopCard()
    def player = new Player('Peterborough Pete', strategy, 60)

    void testGetBid() {
        player.hand = [10,20,30]
        
        // test
        def bid = player.getBid(9)
        
        assert 10 == bid.offer
        assert player == bid.player
        assert 2 == player.hand.size()
    }    
}
