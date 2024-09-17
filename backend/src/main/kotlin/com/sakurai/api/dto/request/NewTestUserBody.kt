package com.sakurai.api.dto.request

import java.time.LocalDateTime


data class NewTestUserBody (
    var name: String?,
    var nameRuby: String?,
    var gender: Char?,
    var address: String?
)