package com.sakurai.api.service.impl

import com.sakurai.api.model.mapper.TestUser
import com.sakurai.api.repository.mapper.*
import jakarta.transaction.Transactional
import org.springframework.data.mapping.AccessOptions
import org.springframework.stereotype.Service

@Service
class TestUserServiceImpl (
    private val testUserMapper: TestUserMapper) : TestUserService {
    override fun getTestUserList(): List<TestUser>? {
        return testUserMapper.selectMany()
    }

    override fun getTestUser(id: Int): TestUser? {
        return testUserMapper.selectByPrimaryKey(id)
    }

    override fun createTestUser() {
        val newTestUser : TestUser = TestUser()
        testUserMapper.insert(newTestUser)
    }

    override fun updateTestUser() {
        val newTestUser : TestUser = TestUser()
        testUserMapper.update(newTestUser)
    }

    override fun deleteTestUser(id: Int) {
        testUserMapper.deleteByPrimaryKey(id);
    }
}