package com.dizcoding.tms.model.api.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class Meta {
    val code: Int? = null
    val current_page: Int? = null
    val message: String? = null
    val next_page: Any? = null
    val page_count: Int? = null
    val per_page: Int? = null
    val prev_page: Any? = null
    val status: Boolean? = null
    val total_count: Int? = null
}