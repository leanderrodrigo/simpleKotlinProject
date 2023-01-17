package com.kotlin.leander.boilerplate.controller.base

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/base")
class BaseController{

    @GetMapping()
    fun helloWorld(): String{
        return "Hello World"
    }

}