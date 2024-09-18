package com.sakurai.api.service.impl

import com.sakurai.api.dto.request.NewTestUsersBody
import com.sakurai.api.dto.request.SearchTestUsersParam
import com.sakurai.api.model.mapper.TestUsers

/**
 * ユーザ(テスト用)　サービスインターフェース.
 */
interface TestUsersService {
    // 情報をすべて取得
    fun getAllTestUsers() : List<TestUsers>
    // 検索条件に該当する情報を取得
    fun searchTestUsers(param: SearchTestUsersParam) : List<TestUsers>
    // 個別取得
    fun getTestUsers(id: Int) : TestUsers?
    // 登録
    fun create(body: NewTestUsersBody)
    // 更新
    fun update(id: Int, body: NewTestUsersBody)
    // 削除
    fun delete(id: Int)
}