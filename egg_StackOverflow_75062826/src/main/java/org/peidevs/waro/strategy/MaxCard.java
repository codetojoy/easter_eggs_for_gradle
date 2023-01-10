package org.peidevs.waro.strategy;

import java.util.stream.IntStream;
import java.util.OptionalInt;

public final class MaxCard implements Strategy {
    @Override
    public int selectCard(int prizeCard, IntStream hand, int maxCard) {
        OptionalInt result = hand.max();
        return result.getAsInt();
    }
}
