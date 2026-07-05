package com.github.pushkar97;

import static com.github.pushkar97.common.ListNode.fromList;
import com.github.pushkar97.common.SolRef;
import com.github.pushkar97.common.SolutionSupplier;
import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import com.github.pushkar97.common.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author pushkardesai
 */
@ExtendWith({SolutionSupplier.class})
class P21Test {

  static Stream<Arguments> mergeTwoLists() {
    return Stream.of(
        arguments(fromList(of(1, 2, 4)), fromList(of(1, 3, 4)), fromList(of(1, 1, 2, 3, 4, 4))));
  }

  @ParameterizedTest
  @MethodSource
  void mergeTwoLists(ListNode node1, ListNode node2, ListNode expected, @SolRef P21 p21) {
    assertThat(p21.mergeTwoLists(node1, node2)).isEqualTo(expected);
  }
}
