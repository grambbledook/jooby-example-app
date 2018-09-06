package com.github.grambbledook.example.jooby.service.factorial

import com.github.grambbledook.example.jooby.service.Calculator

class RecursiveTrailingZeroesImpl : Calculator<Long, Long> {

    override fun calculate(input: Long): Long {
        if (input <= 0) return 0
        return input / 5 + calculate(input / 5)
    }
}