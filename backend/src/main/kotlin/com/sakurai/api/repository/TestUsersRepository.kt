package com.sakurai.api.repository

import com.sakurai.api.dto.request.SearchTestUsersParam
import com.sakurai.api.model.mapper.TestUsers
import com.sakurai.api.repository.mapper.TestUsersMapper
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.type.JdbcType

@Mapper
interface TestUsersRepository : TestUsersMapper {
    @Select("""
        <script>
        SELECT
            id,
            name,
            name_ruby,
            email,
            password,
            street,
            building,
            city,
            pref,
            postal_code,
            gender,
            created_at,
            created_by,
            updated_at,
            updated_by
        FROM
          test_users
        </script>
    """)
    @Results(id="selectAll", value = [
        Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
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
    fun selectAll(): List<TestUsers>

    @Select("""
        <script>
        SELECT
            id,
            name,
            name_ruby,
            email,
            password,
            street,
            building,
            city,
            pref,
            postal_code,
            gender,
            created_at,
            created_by,
            updated_at,
            updated_by
        FROM
          test_users
        <where>
          <if test="id != null">
            AND id = #{id, jdbcType=JdbcType.VARCHAR)
          </if>
          <if test="name != null">
            AND name = #{name, jdbcType=JdbcType.VARCHAR)
          </if>
        </where>        
        </script>
    """)
    @Results(id="selectByCondition", value = [
        Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
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
    fun selectByCondition(searchTestUserParam: SearchTestUsersParam): List<TestUsers>
}