
package net.codetojoy.waro.strategy 

class NearestCard implements Strategy {
    int selectCard(int prizeCard, List<Integer> hand, int maxCard) {
        hand.min { Math.abs(prizeCard - it) }
    }
}
