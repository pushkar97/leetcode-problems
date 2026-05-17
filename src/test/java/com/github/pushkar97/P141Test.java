package com.github.pushkar97;

import static com.github.pushkar97.common.ListNode.fromList;
import com.github.pushkar97.common.SolRef;
import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import com.github.pushkar97.common.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author pushkardesai
 */
class P141Test {

  static Stream<Arguments> mergeTwoLists() {
    return Stream.of(arguments(fromList(of(1, 2, 4)), false));
  }

  @ParameterizedTest
  @MethodSource
  void mergeTwoLists(ListNode node1, boolean expected, @SolRef P141 p141) {
    assertThat(p141.hasCycle(node1)).isEqualTo(expected);
  }
}
