package com.sa.test_second_module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainSecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_second)
//
//        mainSecondButton.setOnClickListener {
//            val intent = Intent(this,MainAppActivity::class.java)
//            startActivity(intent)
//        }
    }
}
