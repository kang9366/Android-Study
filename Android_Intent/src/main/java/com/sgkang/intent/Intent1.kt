package com.sgkang.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Intent1 : AppCompatActivity() {
    lateinit var change_activity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        change_activity = findViewById(R.id.change_activity)

        change_activity.setOnClickListener {
            val intent = Intent(this@Intent1, Intent2::class.java)
            //key, value 방식을 통해 intent에 값을 저장해서 전달할 수 있다.
            intent.putExtra("number1", 1)
            intent.putExtra("number2", 2)

            val intent2 = Intent(this@Intent1, Intent2::class.java)
            intent2.apply {
                this.putExtra("number3", 3)
                this.putExtra("number4", 4)
            }
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.d("number", )
        super.onActivityResult(requestCode, resultCode, data)
    }
}