
package net.codetojoy.waro.strategy 

class Console implements Strategy {

    @Override    
    int selectCard(int prizeCard, List<Integer> hand, int maxCard) {
        def bid
        
        println "\nCard in play is $prizeCard"
        println "\nYour hand is $hand"
        println ""
        
        def ok = false
        def scanner = new java.util.Scanner(System.in)
        
        while (!ok) {
            println "Enter your bid: "
            bid = scanner.nextInt()
            
            if (hand.contains(bid)) {
                ok = true
            }            
        }
        
        bid
    }
}
