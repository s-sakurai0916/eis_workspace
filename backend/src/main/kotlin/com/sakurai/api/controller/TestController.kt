package com.sakurai.api.controller

import com.sakurai.api.dto.request.NewTestUserBody
import com.sakurai.api.dto.request.SearchTestUserParam
import com.sakurai.api.dto.response.SuccessResponse
import com.sakurai.api.dto.response.TestUserListResponse
import com.sakurai.api.dto.response.TestUserResponse
import com.sakurai.api.exception.ValidationException
import com.sakurai.api.service.impl.TestUserService
import org.jetbrains.annotations.NotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/test-user")
class TestController {
    @Autowired
    lateinit var testUserService: TestUserService

    @GetMapping("/search")
    fun getTestUserList(
        @ModelAttribute @Validated param: SearchTestUserParam,
        result: BindingResult
    ): ResponseEntity<TestUserListResponse>? {
        val response = testUserService.searchTestUser(param)
        return ResponseEntity.ok(TestUserListResponse(response))
    }

    @GetMapping("")
    fun getTestUser(
        @RequestParam @NotNull id: Int
    ): ResponseEntity<TestUserResponse>? {
        val response = testUserService.getTestUser(id)
        return ResponseEntity.ok(TestUserResponse(response))
    }

    @PostMapping("")
    fun createTestUser(
        @RequestBody @Validated body: NewTestUserBody,
        result: BindingResult
    ) {
        if (result.hasErrors()) throw ValidationException(result.fieldErrors)
        println(body)
        testUserService.create(body)
    }

    @PutMapping("")
    fun updateTestUser(
        @RequestParam @NotNull id: Int,
        @RequestBody @Validated body: NewTestUserBody,
        result: BindingResult
    ) {
        if (result.hasErrors()) throw ValidationException(result.fieldErrors)
        println(id)
        println(body)
        testUserService.update(id, body)
    }

    @DeleteMapping("")
    fun delete(
        @RequestParam @NotNull id: Int
    ){
        testUserService.delete(id)
    }

//    @GetMapping("/create-file")
//    fun createFile(
//        @RequestParam @NotNull id: Int
//    ): ResponseEntity<TestUserResponse>? {
//        val testUser = testUserService.getTestUser(id)
//
//        return ResponseEntity.ok(TestUserResponse(response))
//    }
}