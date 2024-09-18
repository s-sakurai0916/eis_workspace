package com.sakurai.api.dto.request

import java.time.LocalDateTime


data class NewTestUsersBody (
    var name: String?,
    var nameRuby: String?,
    var email: String?,
    var password: String?,
    var street: String?,
    var building: String?,
    var city: String?,
    var pref: String?,
    var postalCode: String?,
    var gender: String?
)