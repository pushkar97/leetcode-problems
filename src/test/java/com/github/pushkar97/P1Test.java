package com.github.pushkar97;

import com.github.pushkar97.common.SolRef;
import com.github.pushkar97.common.SolutionSupplier;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author pushkardesai
 */
@ExtendWith({SolutionSupplier.class})
class P1Test {

  static Stream<Arguments> twoSum() {
    return Stream.of(
        arguments(new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}),
        arguments(new int[] {3, 2, 4}, 6, new int[] {1, 2}),
        arguments(new int[] {3, 3}, 6, new int[] {0, 1}));
  }

  @ParameterizedTest
  @MethodSource
  void twoSum(int[] arr, int sum, int[] expected, @SolRef P1 p1) {
    assertThat(p1.twoSum(arr, sum)).isEqualTo(expected);
  }
}
