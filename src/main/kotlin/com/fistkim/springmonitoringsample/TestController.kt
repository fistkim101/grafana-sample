package com.fistkim.springmonitoringsample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/index")
    fun index(param1: String?, param2: String?): String {
        println("param1 : $param1")
        println("param2 : $param2")
        return "hello"
    }
}
