package com.github.pushkar97;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Problem: <a href=""></a>
 *
 * @author pushkardesai
 */
class P27Test {

  P27 p27 = new P27();

  static Stream<Arguments> removeElement() {
    return Stream.of(
        arguments(new int[] {1}, 1, new int[] {}),
        arguments(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[] {0, 1, 4, 0, 3}),
        arguments(new int[] {1, 1, 1, 1}, 1, new int[] {}));
  }

  @ParameterizedTest
  @MethodSource
  void removeElement(int[] arr, int val, int[] expected) {
    // when
    int size = p27.removeElement(arr, val);

    // then
    assertThat(size).isEqualTo(expected.length);
    if (expected.length > 0) {
      assertThat(arr).startsWith(expected);
    }
  }
}
