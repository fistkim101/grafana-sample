package com.fistkim.springmonitoringsample.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping("/user")
    fun index(): String {
        return "hello"
    }
}
