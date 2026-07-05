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
class P35Test {

  static Stream<Arguments> searchInsert() {
    return Stream.of(
        arguments(new int[] {1, 3}, 4, 2),
        arguments(new int[] {1, 3, 5, 6}, 0, 0),
        arguments(new int[] {1, 3, 5, 6}, 7, 4),
        arguments(new int[] {1, 3, 5, 6}, 5, 2),
        arguments(new int[] {1, 3, 5, 6}, 2, 1));
  }

  @ParameterizedTest
  @MethodSource
  void searchInsert(int[] arr, int val, int expected, @SolRef P35 p35) {
    assertThat(p35.searchInsert(arr, val)).isEqualTo(expected);
  }
}
