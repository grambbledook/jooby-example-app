package com.github.grambbledook.example.jooby.service.factorial

import com.github.grambbledook.example.jooby.service.Calculator

class IterativeTrailingZeroesImpl : Calculator<Long, Long> {

    override fun calculate(input: Long): Long {
        var count = 0L
        var remaining = input

        while (remaining > 0) {
            remaining /= 5
            count += remaining
        }

        return count
    }
}