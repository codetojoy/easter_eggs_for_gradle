
package net.codetojoy.waro.strategy 

class Hybrid implements Strategy {
    int selectCard(int prizeCard, List<Integer> hand, int maxCard) {
        def result = hand.min()
                
        if (prizeCard > (numCards/2)) {
            result = hand.max()
        } 
        
        result        
    }
}
