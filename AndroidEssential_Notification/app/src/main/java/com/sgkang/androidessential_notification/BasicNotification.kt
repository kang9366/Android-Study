package com.sgkang.androidessential_notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat

class BasicNotification: AppCompatActivity(){
    val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
    val builder = createNotificationBuilder(manager)

    fun createNotificationBuilder(manager: NotificationManager): NotificationCompat.Builder{
        val builder: NotificationCompat.Builder
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channelID = "id"
            val channelName = "name"
            val channel = NotificationChannel(
                channelID,
                channelName,
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "description"
                setShowBadge(true)
            }
            manager.createNotificationChannel(channel)
            builder = NotificationCompat.Builder(this, channelID)
        }else{
            builder = NotificationCompat.Builder(this)
        }
        return builder
    }

    fun setBuilder(builder: NotificationCompat.Builder){
        builder.apply {
            setSmallIcon(android.R.drawable.ic_notification_overlay)
            setWhen(System.currentTimeMillis())
            setContentTitle("title")
            setContentText("text")
        }
    }

    fun noName(){
        val replyIntent = Intent(this, ReplyReceiver::class.java)
        val replyPendingIntent = PendingIntent.getBroadcast(this, 30, replyIntent, PendingIntent.FLAG_UPDATE_CURRENT)
        val remoteInput = androidx.core.app.RemoteInput.Builder(getString(R.string.KEY_TEXT_REPLY)).run {
            setLabel("답장")
            build()
        }
        this.setBuilder(builder)
        BasicNotification().setBuilder(builder)
        builder.apply {
            addAction(
                NotificationCompat.Action.Builder(
                    android.R.drawable.stat_notify_more,
                    "답장",
                    replyPendingIntent
                ).addRemoteInput(remoteInput).build()
            )
        }
        manager.notify(1, builder.build())
    }
}