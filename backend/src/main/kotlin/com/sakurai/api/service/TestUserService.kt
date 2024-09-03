package com.sakurai.api.service.impl

import com.sakurai.api.model.mapper.TestUser

/**
 * ユーザ(テスト用)　サービスインターフェース.
 */
interface TestUserService {
    // 一覧取得
    fun getTestUserList() : List<TestUser>?
    // 個別取得
    fun getTestUser(id: Int) : TestUser?
    // 登録
    fun createTestUser()
    // 更新
    fun updateTestUser()
    // 削除
    fun deleteTestUser(id: Int)
}