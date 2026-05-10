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
class P125Test {

  P125 p125 = new P125();

  static Stream<Arguments> isPalindrome() {
    return Stream.of(
        arguments(".,", true),
        arguments("a.", true),
        arguments("abc", false),
        arguments("aba", true));
  }

  @ParameterizedTest
  @MethodSource
  void isPalindrome(String s, boolean expected) {
    assertThat(p125.isPalindrome(s)).isEqualTo(expected);
  }
}
