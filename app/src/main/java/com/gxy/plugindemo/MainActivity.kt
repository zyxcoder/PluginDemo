package com.gxy.plugindemo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.gxy.demolib.TestActivity
import com.gxy.demolib.mode_base_url

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mode_base_url = "www.baidu.com"
        findViewById<Button>(R.id.btJump).setOnClickListener {
            TestActivity.startActivity(context = this)
        }
    }
}