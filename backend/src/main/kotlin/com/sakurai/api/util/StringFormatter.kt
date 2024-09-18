package com.sakurai.api.util

/** 文字列のフォーマットを行うユーティリティ */
class StringFormatter {
    companion object {
        // 住所の文字列をフォーマット
        fun formatAddress(pref: String?, city: String?, street: String?, building: String?): String {
            // 引数がnullの場合は空文字に変換される
            return "${pref.orEmpty()}${city.orEmpty()}${street.orEmpty()}${building.orEmpty()}"
        }
        // 郵便番号の文字列をフォーマット
        fun formatPostalCode(postalCode: String?): String {
            // nullチェックと空文字チェック
            val cleanedPostalCode = postalCode.orEmpty().filter { it.isDigit() }

            // 正規表現でフォーマット
            return if (cleanedPostalCode.length == 7) {
                cleanedPostalCode.replace(Regex("(\\d{3})(\\d{4})"), "$1-$2")
            } else {
                cleanedPostalCode // 7桁でない場合はそのまま返す
            }
        }
    }
}