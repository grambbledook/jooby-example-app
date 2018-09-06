package com.github.grambbledook.example.jooby.service.factorial

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource

class IterativeTrailingZeroesImplTest {
    private val calculator = IterativeTrailingZeroesImpl()

    @ParameterizedTest
    @ArgumentsSource(Permutations::class)
    fun testFactorial(input: Long, result: Long) {
        val n = calculator.calculate(input)
        assertEquals(result, n)
    }

}