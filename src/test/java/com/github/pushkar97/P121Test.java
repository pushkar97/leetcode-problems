package com.github.pushkar97;

import com.github.pushkar97.common.SolutionSupplier;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import com.github.pushkar97.common.SolRef;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author pushkardesai
 */
@ExtendWith({SolutionSupplier.class})
class P121Test {

  static Stream<Arguments> maxProfit() {
    return Stream.of(
        arguments(new int[] {7, 1, 5, 3, 6, 4}, 5), arguments(new int[] {7, 6, 4, 3, 1}, 0));
  }

  @ParameterizedTest
  @MethodSource
  void maxProfit(int[] prices, int expected, @SolRef P121 p121) {
    assertThat(p121.maxProfit(prices)).isEqualTo(expected);
  }
}
