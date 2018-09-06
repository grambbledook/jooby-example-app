package com.github.grambbledook.example.jooby

import com.github.grambbledook.example.jooby.controller.TrailingZeroesController
import org.jooby.Kooby
import org.jooby.run

class Main : Kooby({
    use(RecursiveModule())
    use(TrailingZeroesController::class)
})


fun main(args: Array<String>) {
    run(::Main, *args)
}