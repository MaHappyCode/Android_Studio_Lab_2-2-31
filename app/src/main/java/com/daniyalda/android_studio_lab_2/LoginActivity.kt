package com.daniyalda.android_studio_lab_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/* switched activity_main -> activity_login */
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        println("Loaded LoginActivity")

        /* TODO - Add missing LOGIN button to activity_login.xml */
        val backToMain = findViewById<Button>(R.id.backToMain)
        backToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        /* TODO - Input type should be: Password and Email types. (check XML)  Done */
        /* TODO - .apply to send user information from input field BACK to MainActivity */
    }
}