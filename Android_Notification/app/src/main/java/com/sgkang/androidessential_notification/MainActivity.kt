package com.sgkang.androidessential_notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val basic = findViewById<Button>(R.id.basic)
        val reply = findViewById<Button>(R.id.reply)

        val notif = BasicNotification()

        val manager = notif.manager
        val builder = notif.createNotificationBuilder(manager)

        basic.setOnClickListener {
            notif.setBuilder(builder)
            manager.notify(1, builder.build())
        }

        reply.setOnClickListener {

        }
    }
}