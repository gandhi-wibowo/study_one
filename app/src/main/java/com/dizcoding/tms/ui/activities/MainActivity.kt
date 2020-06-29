package com.dizcoding.tms.ui.activities

import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import com.dizcoding.tms.R
import com.dizcoding.tms.model.api.request.AuthPhoneNumberRequest
import com.dizcoding.tms.presenter.MainactivityPresenter
import com.dizcoding.tms.ui.views.MainactivityIView
import com.google.gson.Gson
import org.json.JSONObject

class MainActivity : BaseActivity(), MainactivityIView {

    private lateinit var profilePresenter: MainactivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        profilePresenter = MainactivityPresenter(this)
        val request = AuthPhoneNumberRequest()
        request.phone_number = "08123456789"
        profilePresenter.authPhoneNumber(request)
    }
}
