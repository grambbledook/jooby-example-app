package com.github.grambbledook.example.jooby.service.factorial

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import java.util.stream.Stream

class Permutations : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
            Stream.of(
                    Arguments.of(-1L, 0L),
                    Arguments.of(0L, 0L),
                    Arguments.of(5L, 1L),
                    Arguments.of(9L, 1L),
                    Arguments.of(10L, 2L),
                    Arguments.of(10000L, 2499L),
                    Arguments.of(1000000000L, 249999998L),
                    Arguments.of(1000000000000L, 249999999997L),
                    Arguments.of(1000000000000000000L, 249999999999999995L),
                    Arguments.of(Long.MAX_VALUE, 2305843009213693937L)
            )

}