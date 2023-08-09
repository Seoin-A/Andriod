package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // AppCompatActivity = 기존 Activity + 호환성 기능
    // MainActivity -> AppCompatActivity => Activity


    override fun onCreate(savedInstanceState: Bundle?) {
        // Bundle = mapping 형태
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // 보여줄 레이아웃 지정
        // R : 자동 생성된 클래스 ( 모든 리소스를 식별 가능)
//        setContentView(R.layout.activity_seoin)

    }
}

// Activity = Screen