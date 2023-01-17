package com.kotlin.leander.boilerplate.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}
