
package net.codetojoy.waro.strategy 

class RandomCard implements Strategy {
    int selectCard(int prizeCard, List<Integer> hand, int maxCard) {
        def index = new Random().nextInt(hand.size())
        hand[index]
    }
}
