package com.sakurai.api.dto.response

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

data class SuccessResponse (
    val code: Int,
    val message: String,
) {

    companion object {
        /**
         * 正常終了時のレスポンス
         *
         * @param message エラーメッセージ
         * @return ResponseEntity
         */
        fun successRequestBody(message: String): ResponseEntity<SuccessResponse> {
            return ResponseEntity(
                SuccessResponse(HttpStatus.OK.value(), message),
                HttpStatus.OK
            )
        }
    }
}