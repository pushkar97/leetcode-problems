package com.github.pushkar97;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import com.github.pushkar97.common.SolRef;
import com.github.pushkar97.common.SolutionSupplier;
import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author pushkardesai
 */
@ExtendWith({SolutionSupplier.class})
class P542Test {

  static Stream<Arguments> updateMatrix() {
    return Stream.of(
        arguments(
            new int[][] {{0, 1}, {1, 1}},
            new int[][] {{0, 1}, {1, 2}}),
        arguments(
            new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}},
            new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}),
        arguments(
            new int[][] {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}},
            new int[][] {{0, 0, 0}, {0, 1, 0}, {1, 2, 1}}));
  }

  @ParameterizedTest
  @MethodSource
  void updateMatrix(int[][] ints, int[][] expected, @SolRef P542 p) {
    assertThat(p.updateMatrix(ints)).isNotNull().isEqualTo(expected);
  }
}
