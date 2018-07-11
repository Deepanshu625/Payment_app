package com.deepanshu.payment_app.ui.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.Context
import java.time.Period
import java.util.*
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.concurrent.schedule
import kotlin.coroutines.experimental.suspendCoroutine

class MainViewModel : ViewModel() {

    private val _data = MutableLiveData<String>()
    val data: LiveData<String>
        get() = _data

    init {
        _data.value = "user details"
    }
    fun authenticate_user(email: String, password: String): Int {

        val auth_user: Auth_user
        var is_auth=0
        auth_user = Auth_user(email, password)
        is_auth = auth_user.getIsAuth()
        return is_auth
    }
}

