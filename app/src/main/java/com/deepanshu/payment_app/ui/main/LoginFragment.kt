package com.deepanshu.payment_app.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import androidx.navigation.Navigation
import com.deepanshu.payment_app.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.login_layout, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)




        view?.findViewById<Button>(R.id.login)?.setOnClickListener{
            view?.let {
                var email_edittext = view?.findViewById<EditText>(R.id.login_email)
                var password_edittext = view?.findViewById<EditText>(R.id.login_password)
                var email = email_edittext?.text.toString()
                var pass = password_edittext?.text.toString()

                var isAuthenticated = viewModel.authenticate_user(email, pass)
                Log.d("last value","sd"+isAuthenticated)
                if (isAuthenticated == 1) {
                        view?.let {Navigation.findNavController(it).navigate(R.id.dashboardFragment)}
                }
            }
        }
    }

    fun isAuth(){
        view?.let {Navigation.findNavController(it).navigate(R.id.dashboardFragment)}
    }
}