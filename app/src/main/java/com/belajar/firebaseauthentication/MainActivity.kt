package com.belajar.firebaseauthentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val createAccountTextView:TextView = findViewById(R.id.textDontHaveAcc)
        createAccountTextView.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        when(v.id){
            R.id.textDontHaveAcc -> {
                val intent = Intent(this@MainActivity, SignUpActivity::class.java)
                startActivity(intent)
            }
        }

    }
}