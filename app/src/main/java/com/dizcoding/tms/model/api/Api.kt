package com.dizcoding.tms.model.api

import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.codebase.base.BaseApi
import com.dizcoding.tms.App
import com.dizcoding.tms.IConfig
import com.dizcoding.tms.model.api.request.AuthPhoneNumberRequest
import com.dizcoding.tms.model.api.response.AuthPhoneNumberResponse
import io.reactivex.Observable


class Api : BaseApi() {

    companion object {
        const val USER_SERVICE = IConfig.USER_SERVICE_URL
        const val USER_CONTENT = IConfig.CONTENT_SERVICE_URL

        private fun initHeader(activity: BaseActivity): Map<String, String> {
            val map = HashMap<String, String>()
//            map["Authorization"] = "Bearer token"
//            map["X-API-KEY"] = ""
            return map
        }

        @Synchronized
        private fun initApiDomain(url: String): ApiService {
            return getInstance()
                .setupApiDomain(
                    url,
                    App.appComponent,
                    ApiService::class.java,
                    true,
                    app.beelabs.com.codebase.IConfig.TIMEOUT_SHORT_INSECOND,
                    true
                ) as ApiService
        }

        @Synchronized
        fun authPhoneNumber(data: AuthPhoneNumberRequest): Observable<AuthPhoneNumberResponse> {
            return initApiDomain(USER_SERVICE).authPhoneNumberRx(data)
        }


    }
}