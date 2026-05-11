package com.github.pushkar97;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author pushkardesai
 */
class P26Test {

  private final P26 p26 = new P26();

  static Stream<Arguments> removeDuplicates() {
    return Stream.of(
        arguments(new int[] {1, 2, 2, 3}, new int[] {1, 2, 3}),
        arguments(new int[] {1, 1, 1, 1}, new int[] {1}));
  }

  @ParameterizedTest
  @MethodSource
  void removeDuplicates(int[] input, int[] expected) {
    assertThat(p26.removeDuplicates(input)).isEqualTo(expected.length);
    assertThat(input).startsWith(expected);
  }
}
