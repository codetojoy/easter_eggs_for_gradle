package org.peidevs.waro.strategy;

import java.util.stream.IntStream;

public final class NextCard implements Strategy {
    @Override
    public int selectCard(int prizeCard, IntStream hand, int maxCard) {
        return hand.boxed().toList().get(0);
    }
}
