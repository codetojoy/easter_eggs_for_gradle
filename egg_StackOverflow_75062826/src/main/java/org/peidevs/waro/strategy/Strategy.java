package org.peidevs.waro.strategy;

import java.util.stream.IntStream;

public sealed interface Strategy
    permits MaxCard, MinCard, NextCard {
    int selectCard(int prizeCard, IntStream hand, int maxCard);
}
