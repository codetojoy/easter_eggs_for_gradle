
package net.codetojoy.waro.strategy

class PopCardTestCase extends GroovyTestCase {
    
    def numCards = 60
    
    void testSelectCard() {
        def card = 10 
        def hand = [20, 21, 22, 23]
        def strategy = new PopCard()
        
        // test
        def result = strategy.selectCard(card, hand, numCards)
        
        assert 20 == result
    }
}
