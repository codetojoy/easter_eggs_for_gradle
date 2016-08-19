
package net.codetojoy.waro.domain

class Bid {
    final Integer offer
    final Player player
    
    Bid(Integer offer, Player player) {
        this.offer = offer
        this.player = player
    }
}
