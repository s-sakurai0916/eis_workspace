package com.sakurai.api.service.impl

import com.sakurai.api.dto.request.NewTestUserBody
import com.sakurai.api.dto.request.SearchTestUserParam
import com.sakurai.api.model.mapper.TestUser

/**
 * ユーザ(テスト用)　サービスインターフェース.
 */
interface TestUserService {
    // 一覧取得
    fun getTestUserList(param: SearchTestUserParam) : List<TestUser>
    // 個別取得
    fun getTestUser(id: Int) : TestUser?
    // 登録
    fun create(body: NewTestUserBody)
    // 更新
    fun update(id: Int, body: NewTestUserBody)
    // 削除
    fun delete(id: Int)
}