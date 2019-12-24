package com.sa.test_second_module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sa.test_third_module.MainThirdActivity
import kotlinx.android.synthetic.main.activity_main_second.*

class MainSecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_second)

        mainSecondButton.setOnClickListener {
            val intent = Intent(this, MainThirdActivity::class.java)
            startActivity(intent)
        }
    }
}
