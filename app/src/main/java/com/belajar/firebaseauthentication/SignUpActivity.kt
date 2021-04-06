package com.belajar.firebaseauthentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class SignUpActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val imageBackArrow:ImageView = findViewById(R.id.imageBackArrow)
        imageBackArrow.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.imageBackArrow -> {
                val backToSignIn = Intent(this@SignUpActivity, MainActivity::class.java)
                startActivity(backToSignIn)
            }

        }
    }
}