package com.github.pushkar97;

import com.github.pushkar97.common.SolRef;
import com.github.pushkar97.common.SolutionSupplier;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Problem: <a href=""></a>
 *
 * @author pushkardesai
 */
@ExtendWith({SolutionSupplier.class})
class P28Test {

    static Stream<Arguments> strStr() {
        return Stream.of(
                arguments("abbc", "bc", 2),
                arguments("sadbutsad", "sad", 0),
                arguments("leetcode", "leeto", -1),
                arguments("abc", "bc", 1)
        );
    }

    @ParameterizedTest
    @MethodSource
    void strStr(String haystack, String needle, int expected, @SolRef P28 p28) {
        assertThat(p28.strStr(haystack, needle)).isEqualTo(expected);
    }
}
