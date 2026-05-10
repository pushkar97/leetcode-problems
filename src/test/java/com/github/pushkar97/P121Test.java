package com.github.pushkar97;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author pushkardesai
 */
class P121Test {

  P121 p121 = new P121();

  static Stream<Arguments> maxProfit() {
    return Stream.of(
        arguments(new int[] {7, 1, 5, 3, 6, 4}, 5), arguments(new int[] {7, 6, 4, 3, 1}, 0));
  }

  @ParameterizedTest
  @MethodSource
  void maxProfit(int[] prices, int expected) {
    int profit = p121.maxProfit(prices);
    Assertions.assertThat(profit).isEqualTo(expected);
  }
}
