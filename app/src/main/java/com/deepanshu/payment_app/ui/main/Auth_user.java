package com.deepanshu.payment_app.ui.main;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.deepanshu.payment_app.MainActivity;
import com.deepanshu.payment_app.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.concurrent.TimeUnit;

import androidx.navigation.Navigation;

import static android.content.ContentValues.TAG;

public class Auth_user extends FragmentActivity {

    private FirebaseAuth mAuth;
    String email = "";
    String password = "";
    Context context;
    int isAuth = 0;

    Auth_user(String email, String password) {
        mAuth = FirebaseAuth.getInstance();
        this.email = email;
        this.password = password;

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            isAuth = 1;
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.d(TAG, "signInWithEmail:failure", task.getException());
                        }

                        // ...
                    }
                });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    int getIsAuth()
    {

        Log.d("value to return", ""+isAuth);
        return isAuth;
    }
}
