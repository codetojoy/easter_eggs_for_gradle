
package net.codetojoy.waro.strategy

class MaxCardTestCase extends GroovyTestCase {
    
    def numCards = 60
            
    void testMaxStrategy() {
        def card = 10 
        def hand = [1, 60, 11, 40, 19]
        def strategy = new MaxCard()

        // test
        def result = strategy.selectCard(card, hand, numCards)

        assert 60 == result        
    }
}
