package com.sa.test_module_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.sa.test_second_module.MainSecondActivity
import com.sa.test_third_module.MainThirdActivity
import kotlinx.android.synthetic.main.activity_main_first.*

class MainAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_first)

        Glide.with(this)
            .load("https://picsum.photos/200/300")
            .into(image);
        mainFirstButton.setOnClickListener {
            val intent = Intent(this, MainSecondActivity::class.java)
            startActivity(intent)
        }
        mainFourthButton.setOnClickListener {
            val intent = Intent(this, MainThirdActivity::class.java)
            startActivity(intent)
        }
    }
}
