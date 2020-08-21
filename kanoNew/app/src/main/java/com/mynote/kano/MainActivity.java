package com.mynote.kano;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.mynote.kano.model.LoginModel;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onStart() {
        super.onStart();

    }

    public void goLogin(View v){
        LoginModel loginModel = new LoginModel();
        loginModel.doLogin(this);
    }
}
