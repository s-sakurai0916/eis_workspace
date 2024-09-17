package com.sakurai.api.dto.response
import com.sakurai.api.model.mapper.TestUser
import com.sakurai.api.util.DateTimeUtil
import java.util.stream.Stream

/** ユーザ(テスト用)一覧取得レスポンス */
data class TestUserListResponse(
    val total: Int,
    val list: Stream<TestUserListElement>
) {
    /** ユーザ(テスト用)一覧リスト要素 */
    data class TestUserListElement(
        var id: Int? = null,
        var name: String? = null,
        var nameRuby: String? = null,
        var gender: Char? = null,
        var address: String? = null,
        var createdDate: String? = null,
        var createdBy: Int? = null,
        var updatedDate: String? = null,
        var updatedBy: Int? = null
    )

    /** Entityをレスポンス形式に変換するコンストラクタ */
    constructor(testUserList: List<TestUser>) : this(
        testUserList.size,
        testUserList.stream().map { testUser ->
            TestUserListElement(
                testUser.id,
                testUser.name,
                testUser.nameRuby,
                testUser.gender,
                testUser.address,
                DateTimeUtil.toSimpleDateStr(testUser.createdAt),
                testUser.createdBy,
                DateTimeUtil.toSimpleDateStr(testUser.updatedAt),
                testUser.updatedBy
            )
        }
    )
}