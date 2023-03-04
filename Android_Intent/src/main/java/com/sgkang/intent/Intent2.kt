package com.sgkang.intent

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        val result = findViewById<Button>(R.id.result)
        result.setOnClickListener {
            //intent에서 전달받은 값을 받을 때에는 자료형을 명시한 함수를 호출해야하고 defaultValue를 지정해주어야 한다.
            val number1 = intent.getIntExtra("number1", 0)
            val number2 = intent.getIntExtra("number2", 0)

            Log.d("number", "" + number1)
            Log.d("number", "" + number2)

            val result = number1 + number2
            val resultIntent = Intent()
            resultIntent.putExtra("result", result)
            setResult(Activity.RESULT_OK, resultIntent)
            //activity를 종료하는 함수 --> activity는 stack형식으로 쌓인다.
            finish()
        }
    }
}