
package net.codetojoy.waro.strategy 

class MinCard implements Strategy {
    @Override    
    int selectCard(int prizeCard, List<Integer> hand, int maxCard) {
        hand.min()
    }
}
