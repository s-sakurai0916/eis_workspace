/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.sakurai.api.repository.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object TestUsersDynamicSqlSupport {
    val testUsers = TestUsers()

    val id = testUsers.id

    val name = testUsers.name

    val nameRuby = testUsers.nameRuby

    val email = testUsers.email

    val password = testUsers.password

    val street = testUsers.street

    val building = testUsers.building

    val city = testUsers.city

    val pref = testUsers.pref

    val postalCode = testUsers.postalCode

    val gender = testUsers.gender

    val createdAt = testUsers.createdAt

    val createdBy = testUsers.createdBy

    val updatedAt = testUsers.updatedAt

    val updatedBy = testUsers.updatedBy

    class TestUsers : AliasableSqlTable<TestUsers>("test_users", ::TestUsers) {
        val id = column<Int>(name = "id", jdbcType = JDBCType.INTEGER)

        val name = column<String>(name = "name", jdbcType = JDBCType.VARCHAR)

        val nameRuby = column<String>(name = "name_ruby", jdbcType = JDBCType.VARCHAR)

        val email = column<String>(name = "email", jdbcType = JDBCType.VARCHAR)

        val password = column<String>(name = "password", jdbcType = JDBCType.VARCHAR)

        val street = column<String>(name = "street", jdbcType = JDBCType.VARCHAR)

        val building = column<String>(name = "building", jdbcType = JDBCType.VARCHAR)

        val city = column<String>(name = "city", jdbcType = JDBCType.VARCHAR)

        val pref = column<String>(name = "pref", jdbcType = JDBCType.VARCHAR)

        val postalCode = column<String>(name = "postal_code", jdbcType = JDBCType.VARCHAR)

        val gender = column<String>(name = "gender", jdbcType = JDBCType.CHAR)

        val createdAt = column<LocalDateTime>(name = "created_at", jdbcType = JDBCType.TIMESTAMP)

        val createdBy = column<Int>(name = "created_by", jdbcType = JDBCType.INTEGER)

        val updatedAt = column<LocalDateTime>(name = "updated_at", jdbcType = JDBCType.TIMESTAMP)

        val updatedBy = column<Int>(name = "updated_by", jdbcType = JDBCType.INTEGER)
    }
}