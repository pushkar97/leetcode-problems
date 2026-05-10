package com.github.pushkar97;

import static com.github.pushkar97.P21.ListNode.fromList;
import static java.util.List.of;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author pushkardesai
 */
class P21Test {

  P21 p21 = new P21();

  static Stream<Arguments> mergeTwoLists() {
    return Stream.of(
        arguments(fromList(of(1, 2, 4)), fromList(of(1, 3, 4)), fromList(of(1, 1, 2, 3, 4, 4))));
  }

  @ParameterizedTest
  @MethodSource
  void mergeTwoLists(P21.ListNode node1, P21.ListNode node2, P21.ListNode expected) {
    P21.ListNode mergedList = p21.mergeTwoLists(node1, node2);
    Assertions.assertThat(mergedList).isEqualTo(expected);
  }
}
