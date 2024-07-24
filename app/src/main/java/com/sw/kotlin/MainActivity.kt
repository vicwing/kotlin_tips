package com.sw.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sw.kotlin.tip4.invokeActivity
import com.sw.kotlin.tip6.KotlinTip6
import com.sw.kotlin.tip6.Tip6Activity
import com.sw.kotlin.tips.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        toTip6.setOnClickListener {
//            invokeActivity(Tip6Activity::class.java)
//        }
//        toTip6_2.setOnClickListener {
//            invokeActivity(KotlinTip6::class.java)
//        }
    }
}
