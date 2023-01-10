package org.peidevs.waro.table;

import org.peidevs.waro.table.Hand;
import org.peidevs.waro.player.Player;

import java.util.List;

public record Table (List<Player> players, Hand kitty) {}
