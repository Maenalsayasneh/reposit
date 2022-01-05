package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import i0.h.a.b.c.m.b;
import i0.h.a.d.a.b.k0;
import i0.h.a.d.a.b.p1;
import i0.h.a.d.a.b.q2;
import i0.h.a.d.a.b.v2;
import i0.h.a.d.a.b.w;
import i0.h.a.d.a.b.y;
import i0.h.a.d.a.e.f;
import java.util.Objects;

public class AssetPackExtractionService extends Service {
    public NotificationManager Y1;
    public final f c = new f("AssetPackExtractionService");
    public Context d;
    public q2 q;
    public y x;
    public w y;

    public final synchronized void a() {
        this.c.b(4, "Stopping service.", new Object[0]);
        this.q.a(false);
        stopForeground(true);
        stopSelf();
    }

    public final synchronized void b(Bundle bundle) {
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        int i = Build.VERSION.SDK_INT;
        Notification.Builder timeoutAfter = i >= 26 ? new Notification.Builder(this.d, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j) : new Notification.Builder(this.d).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        Notification build = timeoutAfter.build();
        this.c.b(4, "Starting foreground service.", new Object[0]);
        this.q.a(true);
        if (i >= 26) {
            this.Y1.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
    }

    public final IBinder onBind(Intent intent) {
        return this.y;
    }

    public final void onCreate() {
        k0 k0Var;
        super.onCreate();
        this.c.b(3, "onCreate", new Object[0]);
        Context applicationContext = getApplicationContext();
        synchronized (p1.class) {
            if (p1.a == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 != null) {
                    applicationContext = applicationContext2;
                }
                v2 v2Var = new v2(applicationContext);
                b.S(v2Var, v2.class);
                p1.a = new k0(v2Var);
            }
            k0Var = p1.a;
        }
        Context context = k0Var.a.a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        this.d = context;
        this.q = k0Var.y.a();
        this.x = k0Var.d.a();
        this.y = new w(this.d, this, this.x);
        this.Y1 = (NotificationManager) this.d.getSystemService("notification");
    }
}
