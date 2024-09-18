package com.sakurai.api.common.constants

/**
 * 性別を表す列挙型
 */
enum class Gender(val id: String, val displayName: String) {
    MALE("1", "男性"),
    FEMALE("2", "女性"),
    OTHER("0", "不明");

    companion object {
        fun fromId(id: String?): Gender {
            return Gender.entries.find { it.id == id } ?: OTHER
        }
    }

}