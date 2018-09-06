package com.github.grambbledook.example.jooby.controller

import com.github.grambbledook.example.jooby.service.Calculator
import com.google.inject.Inject
import org.jooby.Result
import org.jooby.Results
import org.jooby.mvc.GET
import org.jooby.mvc.Path

class TrailingZeroesController @Inject constructor(private val calculator: Calculator<Long, Long>) {

    @GET
    @Path("/factorial/trailingZeroes/:n")
    fun calculate(n: Long): Result {
        return if (n < 0) Results.with("N is Negative", 400)
        else Results.ok(calculator.calculate(n))
    }
}
