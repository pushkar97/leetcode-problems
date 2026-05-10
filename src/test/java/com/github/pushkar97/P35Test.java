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
class P35Test {

  P35 p35 = new P35();

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
  void searchInsert(int[] arr, int val, int expected) {
    // when
    int index = p35.searchInsert(arr, val);

    // then
    assertThat(index).isEqualTo(expected);
  }
}
