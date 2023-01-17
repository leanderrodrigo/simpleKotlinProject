package com.kotlin.leander.boilerplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
class BoilerPlateApplication

fun main(args: Array<String>) {
	runApplication<BoilerPlateApplication>(*args)
}
