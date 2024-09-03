/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.sakurai.api.repository.mapper

import com.sakurai.api.model.mapper.TestUser
import com.sakurai.api.repository.mapper.TestUserDynamicSqlSupport.address
import com.sakurai.api.repository.mapper.TestUserDynamicSqlSupport.createdAt
import com.sakurai.api.repository.mapper.TestUserDynamicSqlSupport.createdBy
import com.sakurai.api.repository.mapper.TestUserDynamicSqlSupport.gender
import com.sakurai.api.repository.mapper.TestUserDynamicSqlSupport.id
import com.sakurai.api.repository.mapper.TestUserDynamicSqlSupport.name
import com.sakurai.api.repository.mapper.TestUserDynamicSqlSupport.nameRuby
import com.sakurai.api.repository.mapper.TestUserDynamicSqlSupport.testUser
import com.sakurai.api.repository.mapper.TestUserDynamicSqlSupport.updatedAt
import com.sakurai.api.repository.mapper.TestUserDynamicSqlSupport.updatedBy
import org.apache.ibatis.annotations.InsertProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.SelectKey
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter
import org.mybatis.dynamic.sql.util.kotlin.CountCompleter
import org.mybatis.dynamic.sql.util.kotlin.DeleteCompleter
import org.mybatis.dynamic.sql.util.kotlin.KotlinUpdateBuilder
import org.mybatis.dynamic.sql.util.kotlin.SelectCompleter
import org.mybatis.dynamic.sql.util.kotlin.UpdateCompleter
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.countFrom
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.deleteFrom
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.insert
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectDistinct
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectList
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectOne
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.update
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper

@Mapper
interface TestUserMapper : CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    @SelectKey(statement=["SELECT LAST_INSERT_ID()"], keyProperty="row.id", before=false, resultType=Int::class)
    fun insert(insertStatement: InsertStatementProvider<TestUser>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="TestUserResult", value = [
        Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        Result(column="name_ruby", property="nameRuby", jdbcType=JdbcType.VARCHAR),
        Result(column="gender", property="gender", jdbcType=JdbcType.BIT),
        Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_by", property="createdBy", jdbcType=JdbcType.INTEGER),
        Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.INTEGER)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<TestUser>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("TestUserResult")
    fun selectOne(selectStatement: SelectStatementProvider): TestUser?
}

fun TestUserMapper.count(completer: CountCompleter) =
    countFrom(this::count, testUser, completer)

fun TestUserMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, testUser, completer)

fun TestUserMapper.deleteByPrimaryKey(id_: Int) =
    delete {
        where { id isEqualTo id_ }
    }

fun TestUserMapper.insert(row: TestUser) =
    insert(this::insert, row, testUser) {
        map(name) toProperty "name"
        map(nameRuby) toProperty "nameRuby"
        map(gender) toProperty "gender"
        map(address) toProperty "address"
        map(createdAt) toProperty "createdAt"
        map(createdBy) toProperty "createdBy"
        map(updatedAt) toProperty "updatedAt"
        map(updatedBy) toProperty "updatedBy"
    }

fun TestUserMapper.insertSelective(row: TestUser) =
    insert(this::insert, row, testUser) {
        map(name).toPropertyWhenPresent("name", row::name)
        map(nameRuby).toPropertyWhenPresent("nameRuby", row::nameRuby)
        map(gender).toPropertyWhenPresent("gender", row::gender)
        map(address).toPropertyWhenPresent("address", row::address)
        map(createdAt).toPropertyWhenPresent("createdAt", row::createdAt)
        map(createdBy).toPropertyWhenPresent("createdBy", row::createdBy)
        map(updatedAt).toPropertyWhenPresent("updatedAt", row::updatedAt)
        map(updatedBy).toPropertyWhenPresent("updatedBy", row::updatedBy)
    }

private val columnList = listOf(id, name, nameRuby, gender, address, createdAt, createdBy, updatedAt, updatedBy)

fun TestUserMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, testUser, completer)

fun TestUserMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, testUser, completer)

fun TestUserMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, testUser, completer)

fun TestUserMapper.selectByPrimaryKey(id_: Int) =
    selectOne {
        where { id isEqualTo id_ }
    }

fun TestUserMapper.update(completer: UpdateCompleter) =
    update(this::update, testUser, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: TestUser) =
    apply {
        set(name) equalToOrNull row::name
        set(nameRuby) equalToOrNull row::nameRuby
        set(gender) equalToOrNull row::gender
        set(address) equalToOrNull row::address
        set(createdAt) equalToOrNull row::createdAt
        set(createdBy) equalToOrNull row::createdBy
        set(updatedAt) equalToOrNull row::updatedAt
        set(updatedBy) equalToOrNull row::updatedBy
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: TestUser) =
    apply {
        set(name) equalToWhenPresent row::name
        set(nameRuby) equalToWhenPresent row::nameRuby
        set(gender) equalToWhenPresent row::gender
        set(address) equalToWhenPresent row::address
        set(createdAt) equalToWhenPresent row::createdAt
        set(createdBy) equalToWhenPresent row::createdBy
        set(updatedAt) equalToWhenPresent row::updatedAt
        set(updatedBy) equalToWhenPresent row::updatedBy
    }

fun TestUserMapper.updateByPrimaryKey(row: TestUser) =
    update {
        set(name) equalToOrNull row::name
        set(nameRuby) equalToOrNull row::nameRuby
        set(gender) equalToOrNull row::gender
        set(address) equalToOrNull row::address
        set(createdAt) equalToOrNull row::createdAt
        set(createdBy) equalToOrNull row::createdBy
        set(updatedAt) equalToOrNull row::updatedAt
        set(updatedBy) equalToOrNull row::updatedBy
        where { id isEqualTo row.id!! }
    }

fun TestUserMapper.updateByPrimaryKeySelective(row: TestUser) =
    update {
        set(name) equalToWhenPresent row::name
        set(nameRuby) equalToWhenPresent row::nameRuby
        set(gender) equalToWhenPresent row::gender
        set(address) equalToWhenPresent row::address
        set(createdAt) equalToWhenPresent row::createdAt
        set(createdBy) equalToWhenPresent row::createdBy
        set(updatedAt) equalToWhenPresent row::updatedAt
        set(updatedBy) equalToWhenPresent row::updatedBy
        where { id isEqualTo row.id!! }
    }