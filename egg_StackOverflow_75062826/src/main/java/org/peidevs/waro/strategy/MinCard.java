package org.peidevs.waro.strategy;

import java.util.stream.IntStream;
import java.util.OptionalInt;

public final class MinCard implements Strategy {
    @Override
    public int selectCard(int prizeCard, IntStream hand, int maxCard) {
        OptionalInt result = hand.min();
        return result.getAsInt();
    }
}
