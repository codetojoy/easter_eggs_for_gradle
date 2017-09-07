
package net.codetojoy.waro.strategy 

// TODO: abstract this to work with N strategies
// a compound approach, switching algorithms based on the card value
class HybridThirds implements Strategy {
    final Strategy topStrategy
    final Strategy midStrategy
    final Strategy lowStrategy
    
    HybridThirds(Strategy top, Strategy mid, Strategy low) {
        topStrategy = top
        midStrategy = mid
        lowStrategy = low
    }
    
    @Override
    int selectCard(int prizeCard, List<Integer> hand, int maxCard) {
        def result = hand[0]
                
        if (prizeCard > (maxCard * (2/3)) ) {
            result = topStrategy.selectCard(prizeCard, hand, maxCard)
        } else if (prizeCard > (maxCard/3) ) {
            result = midStrategy.selectCard(prizeCard, hand, maxCard)
        } else {
            result = lowStrategy.selectCard(prizeCard, hand, maxCard)            
        }
        
        result        
    }
}
