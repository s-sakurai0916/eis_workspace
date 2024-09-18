package com.sakurai.api.service.impl

import com.sakurai.api.dto.request.NewTestUsersBody
import com.sakurai.api.dto.request.SearchTestUsersParam
import com.sakurai.api.model.mapper.TestUsers
import com.sakurai.api.repository.TestUsersRepository
import com.sakurai.api.repository.mapper.*
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class TestUsersServiceImpl (
    private val testUsersRepository: TestUsersRepository
) : TestUsersService {
    override fun getAllTestUsers(): List<TestUsers> {
        return testUsersRepository.selectAll()
    }
    override fun searchTestUsers(param: SearchTestUsersParam): List<TestUsers> {
        return testUsersRepository.selectByCondition(param)
    }
    override fun getTestUsers(id: Int): TestUsers? {
        return testUsersRepository.selectByPrimaryKey(id)
    }

    override fun create(body: NewTestUsersBody) {
        val newTestUsers : TestUsers = TestUsers(
            name = body.name,
            nameRuby =  body.nameRuby,
            email =  body.email,
            password =  body.password,
            street =  body.street,
            building =  body.building,
            city =  body.city,
            pref =  body.pref,
            postalCode =  body.postalCode,
            gender =  body.gender,
            createdAt = LocalDateTime.now(),
//            createdBy = body.createdBy,
            updatedAt = LocalDateTime.now(),
//            updatedBy = body.updatedBy,
        )
        testUsersRepository.insert(newTestUsers)
    }

    override fun update(id: Int, body: NewTestUsersBody) {
        val newTestUsers : TestUsers = TestUsers(
            id = id,
            name = body.name,
            nameRuby =  body.nameRuby,
            email =  body.email,
            password =  body.password,
            street =  body.street,
            building =  body.building,
            city =  body.city,
            pref =  body.pref,
            postalCode =  body.postalCode,
            gender =  body.gender,
            updatedAt = LocalDateTime.now(),
//            updatedBy = body.updatedBy,
        )
        testUsersRepository.updateByPrimaryKeySelective(newTestUsers)
    }

    override fun delete(id: Int) {
        testUsersRepository.deleteByPrimaryKey(id);
    }
}