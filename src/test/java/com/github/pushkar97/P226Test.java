package com.github.pushkar97;

import com.github.pushkar97.common.SolutionSupplier;
import static com.github.pushkar97.common.TreeNode.NULL;
import static com.github.pushkar97.common.TreeNode.fromList;
import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.extension.ExtendWith;
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
@ExtendWith({SolutionSupplier.class})
class P226Test {

  static Stream<Arguments> invertTree() {
    return Stream.of(
        arguments(fromList(of(1, 2, 3)), fromList(of(1, 3, 2))),
        arguments(fromList(of(1, 2)), fromList(of(1, NULL, 2))),
        arguments(fromList(of(4, 2, 7, 1, 3, 6, 9)), fromList(of(4, 7, 2, 9, 6, 3, 1))));
  }

  @ParameterizedTest
  @MethodSource
  void invertTree(TreeNode input, TreeNode expected, @SolRef P226 p226) {
    assertThat(p226.invertTree(input)).isEqualTo(expected);
  }
}
