package com.deepanshu.payment_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.deepanshu.payment_app.ui.main.MainFragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainActivity : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        mAuth = FirebaseAuth.getInstance()
        var currentuser: FirebaseUser?
        currentuser = mAuth.currentUser

    }

    override fun onSupportNavigateUp() = findNavController(R.id.my_nav_host_fragment).navigateUp()

}
