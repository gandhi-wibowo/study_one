package com.dizcoding.tms.model.dao

import app.beelabs.com.codebase.base.BaseDao
import app.beelabs.com.codebase.base.contract.IDaoPresenter
import com.dizcoding.tms.model.api.Api
import com.dizcoding.tms.model.api.request.AuthPhoneNumberRequest
import com.dizcoding.tms.model.api.response.AuthPhoneNumberResponse
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainactivityDao() : BaseDao() {

    fun authPhoneNumber(data: AuthPhoneNumberRequest): Observable<AuthPhoneNumberResponse> {
        return Api.authPhoneNumber(data)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}