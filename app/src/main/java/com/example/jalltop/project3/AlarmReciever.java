package com.example.jalltop.project3;


import android.annotation.TargetApi;
import android.app.*;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.Toast;

/**
 * Created by jalltop on 4/8/2015.
 */

public class AlarmReciever extends BroadcastReceiver
{
    static int temp=0;
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void onReceive(Context context, Intent intent)
    {



        // TODO Auto-generated method stub

        System.out.println("Alarm worked");
        //Toast.makeText(context, "Alarm fired", Toast.LENGTH_LONG).show();




        NotificationManager notManager;
        notManager = (NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE);






        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), 0);

        Notification notificationDialog = new Notification.Builder(context)


                .setContentTitle("New mail from ")
                .setContentText("anything"+temp)
                .setPriority(2)
                .setFullScreenIntent(contentIntent, true)
                .setContentIntent(contentIntent)
                .setSmallIcon(R.drawable.ic_launcher)
                .setAutoCancel(true)
                .build();
        temp++;

        int temp2=(int)Math.floor(Math.random()*1000);


        notManager.notify(temp, notificationDialog);

//        int duration = Toast.LENGTH_SHORT;
//        Toast toast1 = Toast.makeText(context, Integer.toString(temp2), duration);
//        toast1.show();


    }



}