
package net.codetojoy.waro

import net.codetojoy.waro.domain.Player

class Config {
    final List<Player> players
    final int numGames 
    final int numCards  

    private static final String NUM_GAMES = "numGames"
    private static final String NUM_CARDS = "numCards"
    private static final String PLAYERS = "players"
        
    Config(def file) {
        def varMap = [:]
        varMap[NUM_GAMES] = 0
        varMap[NUM_CARDS] = 0
        varMap[PLAYERS] = []
        
        def binding = new Binding(varMap)
        def shell = new GroovyShell(binding)
        
        try {            
            def dslBuffer = new StringBuilder()
            dslBuffer.append(" import net.codetojoy.waro.domain.Player; \n")
            dslBuffer.append(" import net.codetojoy.waro.strategy.*; \n")
            dslBuffer.append(new File(file).getText())
    
            // it's magic time: data as code
            shell.evaluate(dslBuffer.toString())
            
            numGames = varMap[NUM_GAMES]
            numCards = varMap[NUM_CARDS]
            players = Collections.unmodifiableList(varMap[PLAYERS])
        } catch(Exception ex) {
            System.err.println "caught exception during configuration"
            System.err.println "ex ${ex.class} : ${ex.message}"
            System.exit(-1)
        }
        
    }    
}

