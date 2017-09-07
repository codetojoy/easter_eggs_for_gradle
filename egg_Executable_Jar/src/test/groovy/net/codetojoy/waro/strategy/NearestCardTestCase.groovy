
package net.codetojoy.waro.strategy

class NearestCardTestCase extends GroovyTestCase {
    
    def numCards = 60
        
    void testSelectCard_PrizeCardLessThanNearest() {
        def prizeCard = 10 
        def hand = [1, 60, 11, 40, 19]
        def strategy = new NearestCard()
        
        // test
        def result = strategy.selectCard(prizeCard, hand, numCards)
        
        assert 11 == result
    }
    
    void testSelectCard_PrizeCardMoreThanNearest() {
        def prizeCard = 24 
        def hand = [10,20,30]
        def strategy = new NearestCard()
        
        // test
        def result = strategy.selectCard(prizeCard, hand, numCards)
        
        assert 20 == result
    }    
}
