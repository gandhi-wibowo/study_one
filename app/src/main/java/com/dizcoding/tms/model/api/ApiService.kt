package com.dizcoding.tms.model.api


import com.dizcoding.tms.model.api.request.AuthPhoneNumberRequest
import com.dizcoding.tms.model.api.response.AuthPhoneNumberResponse
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.*


interface ApiService {

    @Headers("Content-Type: application/json")
    @POST("/auth/phone-number")
    fun authPhoneNumberRx(@Body data: AuthPhoneNumberRequest): Observable<AuthPhoneNumberResponse>

    @Headers("Content-Type: application/json")
    @POST("/auth/phone-number")
    fun authPhoneNumber(@Body data: AuthPhoneNumberRequest): Call<AuthPhoneNumberResponse>

}