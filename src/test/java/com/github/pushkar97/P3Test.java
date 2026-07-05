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
class P3Test {

  static Stream<Arguments> lengthOfLongestSubstring() {
    return Stream.of(arguments("abba", 2));
  }

  @ParameterizedTest
  @MethodSource
  void lengthOfLongestSubstring(String s, int expected, @SolRef P3 p) {
    assertThat(p.lengthOfLongestSubstring(s)).isEqualTo(expected);
  }
}
