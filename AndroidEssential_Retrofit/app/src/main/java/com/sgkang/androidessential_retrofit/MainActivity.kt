package com.sgkang.androidessential_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        var inputId: EditText = findViewById(R.id.input_id)
        var name: TextView = findViewById(R.id.name_text)
        var followers: TextView = findViewById(R.id.followers_text)
        var following: TextView = findViewById(R.id.following_text)
        var createDate: TextView = findViewById(R.id.createDate_text)
        var updateDate : TextView = findViewById(R.id.updateDate_text)

        button.setOnClickListener {
            var userId: String = inputId.text.toString()
            RetrofitBuilder.api.getUserInfo(userId).enqueue(object : Callback<UserInfo> {
                override fun onResponse(call: Call<UserInfo>, response: Response<UserInfo>) {
                    var userInfo = response.body()
                    if (userInfo != null){
                        name.text = "이름 : ${userInfo.name}"
                        following.text = "Following : ${userInfo.following.toString()}"
                        followers.text = "Followers : ${userInfo.followers.toString()}"
                        createDate.text = "계정 만든 날짜 : ${textSlicing(userInfo.created_at)}"
                        updateDate.text = "최근 업데이트한 날짜 : ${textSlicing(userInfo.updated_at)}"
                    }else{
                        Toast.makeText(this@MainActivity, "ID 오류", Toast.LENGTH_LONG).show()
                    }
                }

                override fun onFailure(call: Call<UserInfo>, t: Throwable) {
                    Toast.makeText(this@MainActivity, "fail", Toast.LENGTH_LONG).show()
                }
            })
        }
    }

    fun textSlicing(text: String): String = (text.replace("Z", " ")).replace("T", " ")
}