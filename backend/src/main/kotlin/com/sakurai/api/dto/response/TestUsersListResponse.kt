package com.sakurai.api.dto.response
import com.sakurai.api.common.constants.Gender
import com.sakurai.api.model.mapper.TestUsers
import com.sakurai.api.util.DateTimeUtil
import com.sakurai.api.util.StringFormatter
import java.util.stream.Stream

/** ユーザ(テスト用)一覧取得レスポンス */
data class TestUsersListResponse(
    val total: Int,
    val list: Stream<TestUsersListElement>
) {
    /** ユーザ(テスト用)一覧リスト要素 */
    data class TestUsersListElement(
        var id: Int? = null,
        var name: String? = null,
        var nameRuby: String? = null,
        var email: String? = null,
        var postalCode: String? = null,
        var addresss: String? = null,
        var gender: String? = null,
        var createdDate: String? = null,
        var createdBy: Int? = null,
        var updatedDate: String? = null,
        var updatedBy: Int? = null
    )

    /** Entityをレスポンス形式に変換するコンストラクタ */
    constructor(testUserList: List<TestUsers>) : this(
        testUserList.size,
        testUserList.stream().map { testUsers ->
            TestUsersListElement(
                testUsers.id,
                testUsers.name,
                testUsers.nameRuby,
                testUsers.email,
                StringFormatter.formatPostalCode(testUsers.postalCode),
                StringFormatter.formatAddress(testUsers.pref, testUsers.city, testUsers.street, testUsers.building),
                Gender.fromId(testUsers.gender).displayName,
                DateTimeUtil.toSimpleDateStr(testUsers.createdAt),
                testUsers.createdBy,
                DateTimeUtil.toSimpleDateStr(testUsers.updatedAt),
                testUsers.updatedBy
            )
        }
    )
}