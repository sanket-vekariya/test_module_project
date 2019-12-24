package com.sa.test_module_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_first.*

class MainAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_first)
        mainFirstButton.setOnClickListener {
            val intent = Intent()
                .setClassName("com.sa.test_second_module", "MainSecondActivity")

            startActivity(intent)
        }
    }
}
