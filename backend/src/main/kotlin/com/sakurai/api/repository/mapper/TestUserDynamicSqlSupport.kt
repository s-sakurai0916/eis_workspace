/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.sakurai.api.repository.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object TestUserDynamicSqlSupport {
    val testUser = TestUser()

    val id = testUser.id

    val name = testUser.name

    val nameRuby = testUser.nameRuby

    val gender = testUser.gender

    val address = testUser.address

    val createdAt = testUser.createdAt

    val createdBy = testUser.createdBy

    val updatedAt = testUser.updatedAt

    val updatedBy = testUser.updatedBy

    class TestUser : AliasableSqlTable<TestUser>("test_user", ::TestUser) {
        val id = column<Int>(name = "id", jdbcType = JDBCType.INTEGER)

        val name = column<String>(name = "name", jdbcType = JDBCType.VARCHAR)

        val nameRuby = column<String>(name = "name_ruby", jdbcType = JDBCType.VARCHAR)

        val gender = column<Boolean>(name = "gender", jdbcType = JDBCType.BIT)

        val address = column<String>(name = "address", jdbcType = JDBCType.VARCHAR)

        val createdAt = column<LocalDateTime>(name = "created_at", jdbcType = JDBCType.TIMESTAMP)

        val createdBy = column<Int>(name = "created_by", jdbcType = JDBCType.INTEGER)

        val updatedAt = column<LocalDateTime>(name = "updated_at", jdbcType = JDBCType.TIMESTAMP)

        val updatedBy = column<Int>(name = "updated_by", jdbcType = JDBCType.INTEGER)
    }
}