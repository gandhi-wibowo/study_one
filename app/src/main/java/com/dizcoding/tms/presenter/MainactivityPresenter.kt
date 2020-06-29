package com.dizcoding.tms.presenter

import app.beelabs.com.codebase.base.BasePresenter
import app.beelabs.com.codebase.support.rx.RxObserver
import com.dizcoding.tms.model.api.request.AuthPhoneNumberRequest
import com.dizcoding.tms.model.api.response.AuthPhoneNumberResponse
import com.dizcoding.tms.model.dao.MainactivityDao
import com.dizcoding.tms.ui.views.MainactivityIView

class MainactivityPresenter(private val listener: MainactivityIView) : BasePresenter() {

    fun authPhoneNumber(data: AuthPhoneNumberRequest) {
        MainactivityDao().authPhoneNumber(data).subscribe(object :
            RxObserver<AuthPhoneNumberResponse>(listener, "Loading...") {
            override fun onNext(o: Any) {
                super.onNext(o)
            }

            override fun onError(e: Throwable) {
                super.onError(e)
            }
        }.setDialogType(RxObserver.DialogTypeEnum.SPINKIT))
    }
}