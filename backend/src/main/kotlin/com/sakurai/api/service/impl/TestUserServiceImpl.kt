package com.sakurai.api.service.impl

import com.sakurai.api.dto.request.NewTestUserBody
import com.sakurai.api.dto.request.SearchTestUserParam
import com.sakurai.api.model.mapper.TestUser
import com.sakurai.api.repository.mapper.*
import org.springframework.stereotype.Service

@Service
class TestUserServiceImpl (
    private val testUserRepository: TestUserRepository
) : TestUserService {
    override fun getTestUserList(param: SearchTestUserParam): List<TestUser> {
        return testUserRepository.selectByCondition(param)
    }
    override fun getTestUser(id: Int): TestUser? {
        return testUserRepository.selectByPrimaryKey(id)
    }

    override fun create(body: NewTestUserBody) {
        val newTestUser : TestUser = TestUser(
            name = body.name,
            nameRuby =  body.nameRuby,
            gender = body.gender,
            address = body.address,
            createdAt = body.createdAt,
            createdBy = body.createdBy,
            updatedAt = body.updatedAt,
            updatedBy = body.updatedBy,
        )
        testUserRepository.insert(newTestUser)
    }

    override fun update(id: Int, body: NewTestUserBody) {
        val newTestUser : TestUser = TestUser(
            name = body.name,
            nameRuby =  body.nameRuby,
            gender = body.gender,
            address = body.address,
            createdAt = body.createdAt,
            createdBy = body.createdBy,
            updatedAt = body.updatedAt,
            updatedBy = body.updatedBy,
        )
        testUserRepository.updateByPrimaryKeySelective(newTestUser)
    }
    override fun delete(id: Int) {
        testUserRepository.deleteByPrimaryKey(id);
    }
}