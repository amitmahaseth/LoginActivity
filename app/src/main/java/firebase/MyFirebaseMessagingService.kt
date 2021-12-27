package firebase

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import android.app.NotificationManager

import android.content.Intent

import android.app.PendingIntent

import com.example.loginactivity.MainActivity


import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.content.Context
import android.graphics.Color
import androidx.core.app.NotificationCompat
import com.example.loginactivity.R


class MyFirebaseMessagingService :FirebaseMessagingService(){
    private lateinit var mBuilder: NotificationCompat.Builder
    lateinit var notificationManager: NotificationManager

    @SuppressLint("WrongConstant")
    override fun onMessageReceived(remoteMessage: RemoteMessage) {

    Log.d("TAG", "From: ${remoteMessage.from}")

    // Check if message contains a data payload.
    if (remoteMessage.data.isNotEmpty()) {
        Log.d("TAG", "Message data payload: ${remoteMessage.data}")

        if (/* Check if data needs to be processed by long running job */ true) {
            // For long-running tasks (10 seconds or more) use WorkManager.
            //scheduleJob()
        } else {
            // Handle message within 10 seconds
           // handleNow()
        }
    }

    // Check if message contains a notification payload.
    remoteMessage.notification?.let {
        Log.d("TAG", "Message Notification Body: ${it.body}")
    }

      /*  val mBuilder: NotificationCompat.Builder = NotificationCompat.Builder(this)
            .setSmallIcon(R.drawable.notification) // notification icon
            .setContentTitle("Notification!") // title for notification
            .setContentText("Hello word") // message for notification
            .setAutoCancel(true) // clear notification after click

        val intent = Intent(this, MainActivity::class.java)
        val pi = PendingIntent.getActivity(this, 0, intent, Intent.FLAG_ACTIVITY_NEW_TASK)
        mBuilder.setContentIntent(pi)
        val mNotificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        mNotificationManager.notify(0, mBuilder.build())*/


        //Notification builder
        if (notificationManager == null){
            notificationManager =  getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        }

var channelId="CHANNEL_ID"
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            var importance = NotificationManager.IMPORTANCE_HIGH;
            var mChannel = notificationManager.getNotificationChannel(channelId);
            if (mChannel == null){
                mChannel =  NotificationChannel(channelId, "channel_name", importance);
                mChannel.setDescription("CHANNEL_DESCRIPTION");
                mChannel.enableVibration(true);
                mChannel.setLightColor(Color.GREEN);
//                mChannel.setVibrationPattern(long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
                notificationManager.createNotificationChannel(mChannel);
            }

            mBuilder = NotificationCompat.Builder(this,channelId)
            mBuilder.setContentTitle("ssssssssssss")
                .setSmallIcon(R.drawable.car)
                .setContentText("body") //show icon on status bar
                //.setContentIntent(pendingIntent)
                .setAutoCancel(true)
               // .setVibrate(long[]{100, 200, 300, 400, 500, 400, 300, 200, 400})
                .setDefaults(Notification.DEFAULT_ALL);
        }else {
            var mBuilder: NotificationCompat.Builder = NotificationCompat.Builder(this,channelId)
            mBuilder.setContentTitle("htthth")
                .setSmallIcon(R.drawable.car)
                .setContentText("7uj76u76u")
                .setPriority(Notification.PRIORITY_HIGH)
                //.setContentIntent(pendingIntent)
                .setAutoCancel(true)
                //.setVibrate(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400})
                .setDefaults(Notification.DEFAULT_VIBRATE);
        }

        notificationManager.notify(1002, mBuilder.build());
    }

    }
    // Also if you intend on generating your own notifications as a result of a received FCM
    // message, here is where that should be initiated. See sendNotification method below.

