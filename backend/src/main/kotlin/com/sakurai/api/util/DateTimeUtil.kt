package com.sakurai.api.util
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/** 日付のユーティリティ */
class DateTimeUtil {

    companion object {
        /**
         * 年月日時分秒形式にフォーマットする
         * @param value LocalDateTime
         * @return yyyy/MM/dd HH:mm:ss
         */
        fun toSimpleDateStr(value: LocalDateTime?): String {
            return if (value != null) value.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")) else ""
        }
    }
}