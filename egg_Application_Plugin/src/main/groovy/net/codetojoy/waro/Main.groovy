
package net.codetojoy.waro

import net.codetojoy.waro.casino.Tourney 

// TODO: add logging

def config = new Config(args[0])

def tourney = new Tourney(config)
tourney.playGames()









