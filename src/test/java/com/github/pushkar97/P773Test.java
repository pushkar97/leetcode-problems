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
class P773Test {

  static Stream<Arguments> floodFill() {
    return Stream.of(
        arguments(
            new int[][] {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}},
            1,
            1,
            2,
            new int[][] {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}));
  }

  @ParameterizedTest
  @MethodSource
  void floodFill(int[][] image, int sr, int sc, int colour, int[][] expected, @SolRef P773 p773) {
    assertThat(p773.floodFill(image, sr, sc, colour)).isNotNull().isEqualTo(expected);
  }
}
