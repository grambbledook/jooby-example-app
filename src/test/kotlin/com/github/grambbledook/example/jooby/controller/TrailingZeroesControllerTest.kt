package com.github.grambbledook.example.jooby.controller

import com.github.grambbledook.example.jooby.Main
import org.jooby.test.MockRouter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class TrailingZeroesControllerTest {

    @Test
    fun testMappingExists() {
        MockRouter(Main()).get<Long>("/factorial/trailingZeroes/100")
    }

    @Test
    @Disabled("https://github.com/jooby-project/jooby/issues/888")
    fun testCalculationWorksFine() {
        val result = MockRouter(Main()).get<Long>("/factorial/trailingZeroes/100")
        assertEquals(24, result)
    }

    @Test
    @Disabled("https://github.com/jooby-project/jooby/issues/888")
    fun testBadRequestOnNegative() {
        val result = MockRouter(Main()).get<String>("/factorial/trailingZeroes/-100")
        assertEquals("N is Negative", result)
    }

}