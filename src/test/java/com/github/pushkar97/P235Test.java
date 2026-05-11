package com.github.pushkar97;

import static com.github.pushkar97.common.TreeNode.fromList;
import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import com.github.pushkar97.common.TreeNode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author pushkardesai
 */
class P235Test {

  P235 p235 = new P235();

  static Stream<Arguments> invertTree() {
    return Stream.of(
        arguments(fromList(of(1, 2)), new TreeNode(1), new TreeNode(2), fromList(of(1, 2))),
        arguments(
            fromList(of(6, 2, 8, 0, 4, 7, 9, Integer.MIN_VALUE, Integer.MIN_VALUE, 3, 5)),
            new TreeNode(2),
            new TreeNode(4),
            new TreeNode(2)));
  }

  @ParameterizedTest
  @MethodSource
  void invertTree(TreeNode input, TreeNode p, TreeNode q, TreeNode expected) {
    assertThat(p235.lowestCommonAncestor(input, p, q).getVal()).isEqualTo(expected.getVal());
  }
}
