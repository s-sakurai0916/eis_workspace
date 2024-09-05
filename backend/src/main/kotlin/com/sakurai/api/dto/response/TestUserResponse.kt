package com.sakurai.api.dto.response
import com.sakurai.api.model.mapper.TestUser
import com.sakurai.api.util.DateTimeUtil

/** ユーザ(テスト用)取得レスポンス */
data class TestUserResponse(
    var id: Int? = null,
    var name: String? = null,
    var nameRuby: String? = null,
    var gender: Boolean? = null,
    var address: String? = null,
    var createdDate: String? = null,
    var createdBy: Int? = null,
    var updatedDate: String? = null,
    var updatedBy: Int? = null
) {
    /** Entityをレスポンス形式に変換するコンストラクタ */
    constructor(testUser: TestUser?) : this(
        testUser?.id,
        testUser?.name,
        testUser?.nameRuby,
        testUser?.gender,
        testUser?.address,
        DateTimeUtil.toSimpleDateStr(testUser?.createdAt),
        testUser?.createdBy,
        DateTimeUtil.toSimpleDateStr(testUser?.updatedAt),
        testUser?.updatedBy
    )
}