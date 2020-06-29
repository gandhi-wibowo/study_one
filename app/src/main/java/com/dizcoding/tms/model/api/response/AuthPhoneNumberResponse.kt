package com.dizcoding.tms.model.api.response

import app.beelabs.com.codebase.base.response.BaseResponse
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

class AuthPhoneNumberResponse : BaseResponse() {
    var data: DataBean? = null
    var meta: Meta? = null

    @JsonIgnoreProperties(ignoreUnknown = true)
    class DataBean {
        val id: String? = null
        val status: String? = null
    }
}