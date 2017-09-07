
numCards = 60
numGames = 2

// Player requires: name, strategy, numCards
// TODO: remove numCards requirement
//
// available strategies:
// MaxCard, MinCard, NearestCard, PopCard, RandomCard
// Console (for interactive games)
// HybridThirds

players << new Player('Michael Max', new MaxCard(), numCards)    
players << new Player('Randy Random', new RandomCard(), numCards)    

/*
def top = new MaxCard()
def mid = new RandomCard()
def low = new MinCard()
def hybridThirds = new HybridThirds(top, mid, low)
players << new Player('Helen Hybrid', hybridThirds, numCards)    
*/

