package com.example.hometask_58

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext



class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add into the build.gradle
        //implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9'
        //implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9'



        btChangeText.setOnClickListener{
            tvText.text = "Text was Changed!"
            tvText.setTextColor(resources.getColor(R.color.red))
        }



        CoroutineScope(Dispatchers.Main).launch {
            btPostData.setOnClickListener{
                SystemClock.sleep(500)  // 0.5 seconds
                tvPostData.text = "Data was Posted!"
                tvPostData.setTextColor(resources.getColor(R.color.green))
            }
        }


    }
}