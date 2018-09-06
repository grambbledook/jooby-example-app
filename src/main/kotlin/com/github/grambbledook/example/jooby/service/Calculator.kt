package com.github.grambbledook.example.jooby.service

interface Calculator<I, O> {
    fun calculate(input: I): O
}