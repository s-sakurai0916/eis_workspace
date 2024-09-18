/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.sakurai.api.repository.mapper

import com.sakurai.api.model.mapper.TestUsers
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.building
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.city
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.createdAt
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.createdBy
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.email
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.gender
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.id
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.name
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.nameRuby
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.password
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.postalCode
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.pref
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.street
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.testUsers
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.updatedAt
import com.sakurai.api.repository.mapper.TestUsersDynamicSqlSupport.updatedBy
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
interface TestUsersMapper : CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    @SelectKey(statement=["SELECT LAST_INSERT_ID()"], keyProperty="row.id", before=false, resultType=Int::class)
    fun insert(insertStatement: InsertStatementProvider<TestUsers>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="TestUsersResult", value = [
        Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        Result(column="name_ruby", property="nameRuby", jdbcType=JdbcType.VARCHAR),
        Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        Result(column="street", property="street", jdbcType=JdbcType.VARCHAR),
        Result(column="building", property="building", jdbcType=JdbcType.VARCHAR),
        Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        Result(column="pref", property="pref", jdbcType=JdbcType.VARCHAR),
        Result(column="postal_code", property="postalCode", jdbcType=JdbcType.VARCHAR),
        Result(column="gender", property="gender", jdbcType=JdbcType.CHAR),
        Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_by", property="createdBy", jdbcType=JdbcType.INTEGER),
        Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.INTEGER)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<TestUsers>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("TestUsersResult")
    fun selectOne(selectStatement: SelectStatementProvider): TestUsers?
}

fun TestUsersMapper.count(completer: CountCompleter) =
    countFrom(this::count, testUsers, completer)

fun TestUsersMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, testUsers, completer)

fun TestUsersMapper.deleteByPrimaryKey(id_: Int) =
    delete {
        where { id isEqualTo id_ }
    }

fun TestUsersMapper.insert(row: TestUsers) =
    insert(this::insert, row, testUsers) {
        map(name) toProperty "name"
        map(nameRuby) toProperty "nameRuby"
        map(email) toProperty "email"
        map(password) toProperty "password"
        map(street) toProperty "street"
        map(building) toProperty "building"
        map(city) toProperty "city"
        map(pref) toProperty "pref"
        map(postalCode) toProperty "postalCode"
        map(gender) toProperty "gender"
        map(createdAt) toProperty "createdAt"
        map(createdBy) toProperty "createdBy"
        map(updatedAt) toProperty "updatedAt"
        map(updatedBy) toProperty "updatedBy"
    }

fun TestUsersMapper.insertSelective(row: TestUsers) =
    insert(this::insert, row, testUsers) {
        map(name).toPropertyWhenPresent("name", row::name)
        map(nameRuby).toPropertyWhenPresent("nameRuby", row::nameRuby)
        map(email).toPropertyWhenPresent("email", row::email)
        map(password).toPropertyWhenPresent("password", row::password)
        map(street).toPropertyWhenPresent("street", row::street)
        map(building).toPropertyWhenPresent("building", row::building)
        map(city).toPropertyWhenPresent("city", row::city)
        map(pref).toPropertyWhenPresent("pref", row::pref)
        map(postalCode).toPropertyWhenPresent("postalCode", row::postalCode)
        map(gender).toPropertyWhenPresent("gender", row::gender)
        map(createdAt).toPropertyWhenPresent("createdAt", row::createdAt)
        map(createdBy).toPropertyWhenPresent("createdBy", row::createdBy)
        map(updatedAt).toPropertyWhenPresent("updatedAt", row::updatedAt)
        map(updatedBy).toPropertyWhenPresent("updatedBy", row::updatedBy)
    }

private val columnList = listOf(id, name, nameRuby, email, password, street, building, city, pref, postalCode, gender, createdAt, createdBy, updatedAt, updatedBy)

fun TestUsersMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, testUsers, completer)

fun TestUsersMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, testUsers, completer)

fun TestUsersMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, testUsers, completer)

fun TestUsersMapper.selectByPrimaryKey(id_: Int) =
    selectOne {
        where { id isEqualTo id_ }
    }

fun TestUsersMapper.update(completer: UpdateCompleter) =
    update(this::update, testUsers, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: TestUsers) =
    apply {
        set(name) equalToOrNull row::name
        set(nameRuby) equalToOrNull row::nameRuby
        set(email) equalToOrNull row::email
        set(password) equalToOrNull row::password
        set(street) equalToOrNull row::street
        set(building) equalToOrNull row::building
        set(city) equalToOrNull row::city
        set(pref) equalToOrNull row::pref
        set(postalCode) equalToOrNull row::postalCode
        set(gender) equalToOrNull row::gender
        set(createdAt) equalToOrNull row::createdAt
        set(createdBy) equalToOrNull row::createdBy
        set(updatedAt) equalToOrNull row::updatedAt
        set(updatedBy) equalToOrNull row::updatedBy
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: TestUsers) =
    apply {
        set(name) equalToWhenPresent row::name
        set(nameRuby) equalToWhenPresent row::nameRuby
        set(email) equalToWhenPresent row::email
        set(password) equalToWhenPresent row::password
        set(street) equalToWhenPresent row::street
        set(building) equalToWhenPresent row::building
        set(city) equalToWhenPresent row::city
        set(pref) equalToWhenPresent row::pref
        set(postalCode) equalToWhenPresent row::postalCode
        set(gender) equalToWhenPresent row::gender
        set(createdAt) equalToWhenPresent row::createdAt
        set(createdBy) equalToWhenPresent row::createdBy
        set(updatedAt) equalToWhenPresent row::updatedAt
        set(updatedBy) equalToWhenPresent row::updatedBy
    }

fun TestUsersMapper.updateByPrimaryKey(row: TestUsers) =
    update {
        set(name) equalToOrNull row::name
        set(nameRuby) equalToOrNull row::nameRuby
        set(email) equalToOrNull row::email
        set(password) equalToOrNull row::password
        set(street) equalToOrNull row::street
        set(building) equalToOrNull row::building
        set(city) equalToOrNull row::city
        set(pref) equalToOrNull row::pref
        set(postalCode) equalToOrNull row::postalCode
        set(gender) equalToOrNull row::gender
        set(createdAt) equalToOrNull row::createdAt
        set(createdBy) equalToOrNull row::createdBy
        set(updatedAt) equalToOrNull row::updatedAt
        set(updatedBy) equalToOrNull row::updatedBy
        where { id isEqualTo row.id!! }
    }

fun TestUsersMapper.updateByPrimaryKeySelective(row: TestUsers) =
    update {
        set(name) equalToWhenPresent row::name
        set(nameRuby) equalToWhenPresent row::nameRuby
        set(email) equalToWhenPresent row::email
        set(password) equalToWhenPresent row::password
        set(street) equalToWhenPresent row::street
        set(building) equalToWhenPresent row::building
        set(city) equalToWhenPresent row::city
        set(pref) equalToWhenPresent row::pref
        set(postalCode) equalToWhenPresent row::postalCode
        set(gender) equalToWhenPresent row::gender
        set(createdAt) equalToWhenPresent row::createdAt
        set(createdBy) equalToWhenPresent row::createdBy
        set(updatedAt) equalToWhenPresent row::updatedAt
        set(updatedBy) equalToWhenPresent row::updatedBy
        where { id isEqualTo row.id!! }
    }