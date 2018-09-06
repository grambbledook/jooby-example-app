package com.github.grambbledook.example.jooby

import com.github.grambbledook.example.jooby.service.Calculator
import com.github.grambbledook.example.jooby.service.factorial.RecursiveTrailingZeroesImpl
import com.google.inject.Binder
import com.google.inject.TypeLiteral
import com.typesafe.config.Config
import org.jooby.Env
import org.jooby.Jooby
import org.slf4j.LoggerFactory

class RecursiveModule : Jooby.Module {
    val logger = LoggerFactory.getLogger("")
    override fun configure(env: Env, conf: Config, binder: Binder) {
        binder.bind(object : TypeLiteral<Calculator<Long, Long>>() {}).to(RecursiveTrailingZeroesImpl::class.java)
    }

}