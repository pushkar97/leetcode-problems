package com.github.pushkar97;

import com.github.pushkar97.common.SolRef;
import com.github.pushkar97.common.SolutionSupplier;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author pushkardesai
 */
@ExtendWith({SolutionSupplier.class})
class P14Test {

  static Stream<Arguments> longestCommonPrefix() {
    return Stream.of(
        arguments(List.of("flower", "flow", "flight").toArray(String[]::new), "fl"),
        arguments(List.of("dog", "racecar", "car").toArray(String[]::new), ""));
  }

  @ParameterizedTest
  @MethodSource
  void longestCommonPrefix(String[] arr, String expected, @SolRef P14 p14) {
    assertThat(p14.longestCommonPrefix(arr)).isEqualTo(expected);
  }
}
