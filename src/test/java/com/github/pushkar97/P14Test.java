package com.github.pushkar97;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author pushkardesai
 */
class P14Test {

  P14 p14 = new P14();

  static Stream<Arguments> longestCommonPrefix() {
    return Stream.of(
        arguments(List.of("flower", "flow", "flight").toArray(String[]::new), "fl"),
        arguments(List.of("dog", "racecar", "car").toArray(String[]::new), ""));
  }

  @ParameterizedTest
  @MethodSource
  void longestCommonPrefix(String[] arr, String expected) {
    String longestCommonPrefix = p14.longestCommonPrefix(arr);
    Assertions.assertThat(longestCommonPrefix).isEqualTo(expected);
  }
}
