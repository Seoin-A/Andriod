package com.example.activityandfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button as Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingButton()
    }


    fun settingButton(){
        val button = findViewById<Button>(R.id.button) // Button id 가져오기
        button.setOnClickListener{
            // subActivity로 이동
            // intent : 의지, 지향, 의도
            val intent = Intent(this,SubActivity::class.java)
            startActivity(intent)
        }

    }
}