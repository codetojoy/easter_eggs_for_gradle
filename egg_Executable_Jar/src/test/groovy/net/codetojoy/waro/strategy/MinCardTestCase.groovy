
package net.codetojoy.waro.strategy

class MinCardTestCase extends GroovyTestCase {
    
    def numCards = 60
            
    void testSelectCard() {
        def card = 10 
        def hand = [1, 60, 11, 40, 19]
        def strategy = new MinCard()

        // test
        def result = strategy.selectCard(card, hand, numCards)

        assert 1 == result        
    }
}
