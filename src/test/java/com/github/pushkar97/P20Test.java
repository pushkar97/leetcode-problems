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
class P20Test {

  P20 p20 = new P20();

  static Stream<Arguments> isValid() {
    return Stream.of(
        arguments("(])", false),
        arguments("(]", false),
        arguments("()", true),
        arguments("()[]{}", true),
        arguments("([])", true),
        arguments("([)]", false));
  }

  @ParameterizedTest
  @MethodSource
  void isValid(String s, boolean expected) {
    assertThat(p20.isValid(s)).isEqualTo(expected);
  }
}
