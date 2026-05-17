package com.github.pushkar97;

import static com.github.pushkar97.common.TreeNode.NULL;
import static com.github.pushkar97.common.TreeNode.fromList;
import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import com.github.pushkar97.common.SolRef;
import com.github.pushkar97.common.TreeNode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author pushkardesai
 */
class P110Test {

  static Stream<Arguments> isBalanced() {

    return Stream.of(
        arguments(fromList(of(1)), true),
        arguments(fromList(of(1, 2)), true),
        arguments(fromList(of(1, NULL, 2)), true),
        arguments(fromList(of(3, 9, 20, NULL, NULL, 15, 7)), true),
        arguments(fromList(of(1, 2, 2, 3, 3, NULL, NULL, 4, 4)), false));
  }

  @ParameterizedTest
  @MethodSource
  void isBalanced(TreeNode input, boolean expected, @SolRef P110 p110) {
    assertThat(p110.isBalanced(input)).isEqualTo(expected);
  }
}
