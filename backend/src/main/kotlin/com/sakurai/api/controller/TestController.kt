package com.sakurai.api.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController {
//    @Autowired
//    lateinit var testRepository: TestRepository
//
//    @GetMapping("")
//    fun test(): String? {
//        // 2024年9月2日時点のテスト用コード
//        val testEntity = testRepository.findById(1)
//
//        return testEntity.get().value
//    }
}