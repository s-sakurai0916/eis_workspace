package com.sakurai.api.dto.request

import java.time.LocalDateTime


data class NewTestUserBody (
    var name: String?,
    var nameRuby: String?,
    var gender: Boolean?,
    var address: String?,
    var createdAt: LocalDateTime?,
    var createdBy: Int?,
    var updatedAt: LocalDateTime?,
    var updatedBy: Int?
)