package com.sakurai.api.exception

import org.springframework.validation.FieldError

/** バリデーションエラー例外 */
class ValidationException(var errorList: List<FieldError>) : RuntimeException()