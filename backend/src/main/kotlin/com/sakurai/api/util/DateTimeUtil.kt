package com.sakurai.api.util
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.Locale

/** 日付のユーティリティ */
class DateTimeUtil {

    companion object {
        /**
         * 年月日時分秒形式にフォーマットする
         * @param value LocalDateTime
         * @return yyyy/MM/dd HH:mm:ss
         */
        fun toSimpleDateStr(value: LocalDateTime?): String {
            return SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault()).format(value)
        }
    }
}