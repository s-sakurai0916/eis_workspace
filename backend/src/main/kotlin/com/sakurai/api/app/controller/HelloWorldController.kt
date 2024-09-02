package com.sakurai.api.app.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

/** Hello World コントローラー */
@RestController
@RequestMapping("/hello")
class HelloWorldController {
  @GetMapping("")
  fun hello(): String {
    return "Hello, World!"
  }
}