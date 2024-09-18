package com.sakurai.api.controller

import com.sakurai.api.dto.request.NewTestUsersBody
import com.sakurai.api.dto.request.SearchTestUsersParam
import com.sakurai.api.dto.response.TestUsersListResponse
import com.sakurai.api.dto.response.TestUsersResponse
import com.sakurai.api.exception.ValidationException
import com.sakurai.api.service.impl.TestUsersService
import org.jetbrains.annotations.NotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/test-users")
class TestController {
    @Autowired
    lateinit var testUsersService: TestUsersService

    @GetMapping("")
    fun getAllList(): ResponseEntity<TestUsersListResponse>? {
        val response = testUsersService.getAllTestUsers()
        return ResponseEntity.ok(TestUsersListResponse(response))
    }

    @GetMapping("/search")
    fun searchTestUser(
        @ModelAttribute @Validated param: SearchTestUsersParam,
        result: BindingResult
    ): ResponseEntity<TestUsersListResponse>? {
        val response = testUsersService.searchTestUsers(param)
        return ResponseEntity.ok(TestUsersListResponse(response))
    }

    @GetMapping("/{Id}")
    fun getTestUser(
        @PathVariable @NotNull id: Int
    ): ResponseEntity<TestUsersResponse>? {
        val response = testUsersService.getTestUsers(id)
        return ResponseEntity.ok(TestUsersResponse(response))
    }

    @PostMapping("")
    fun createTestUser(
        @RequestBody @Validated body: NewTestUsersBody,
        result: BindingResult
    ) {
        if (result.hasErrors()) throw ValidationException(result.fieldErrors)
        println(body)
        testUsersService.create(body)
    }

    @PutMapping("/{Id}")
    fun updateTestUser(
        @PathVariable @NotNull id: Int,
        @RequestBody @Validated body: NewTestUsersBody,
        result: BindingResult
    ) {
        if (result.hasErrors()) throw ValidationException(result.fieldErrors)
        println(id)
        println(body)
        testUsersService.update(id, body)
    }

    @DeleteMapping("/{Id}")
    fun delete(
        @PathVariable @NotNull id: Int
    ){
        testUsersService.delete(id)
    }

//    @GetMapping("/create-file")
//    fun createFile(
//        @RequestParam @NotNull id: Int
//    ): ResponseEntity<TestUserResponse>? {
//        val testUser = testUsersService.getTestUser(id)
//
//        return ResponseEntity.ok(TestUserResponse(response))
//    }
}