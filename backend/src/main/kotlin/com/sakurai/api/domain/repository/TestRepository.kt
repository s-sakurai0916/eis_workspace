package com.sakurai.api.domain.repository

import com.sakurai.api.domain.entity.TestEntity
import org.springframework.data.repository.CrudRepository

interface TestRepository : CrudRepository<TestEntity, Int>

