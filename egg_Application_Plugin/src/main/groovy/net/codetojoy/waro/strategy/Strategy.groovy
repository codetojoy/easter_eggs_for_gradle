
package net.codetojoy.waro.strategy 

interface Strategy {
    int selectCard(int prizeCard, List<Integer> hand, int maxCard)
}
