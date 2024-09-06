package com.sakurai.api.repository

import com.sakurai.api.dto.request.SearchTestUserParam
import com.sakurai.api.model.mapper.TestUser
import com.sakurai.api.repository.mapper.TestUserMapper
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.type.JdbcType

@Mapper
interface TestUserRepository : TestUserMapper {
    @Select("""
        <script>
        SELECT
            id,
            name,
            name_ruby,
            gender,
            address,
            created_at,
            created_by,
            updated_at,
            updated_by
        FROM
          test_user
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
        Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        Result(column="name_ruby", property="nameRuby", jdbcType= JdbcType.VARCHAR),
        Result(column="gender", property="gender", jdbcType= JdbcType.INTEGER),
        Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
        Result(column="created_at", property="createdAt", jdbcType= JdbcType.TIMESTAMP),
        Result(column="created_by", property="createdBy", jdbcType= JdbcType.INTEGER),
        Result(column="updated_at", property="updatedAt", jdbcType= JdbcType.TIMESTAMP),
        Result(column="updated_by", property="updatedBy", jdbcType= JdbcType.INTEGER)
    ])
    fun selectByCondition(searchTestUserParam: SearchTestUserParam): List<TestUser>
}