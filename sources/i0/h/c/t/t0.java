package i0.h.c.t;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.pubnub.api.builder.PubNubErrorBuilder;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class t0 implements Runnable {
    public static final Object c = new Object();
    public static Boolean d;
    public static Boolean q;
    public final PowerManager.WakeLock Y1;
    public final s0 Z1;
    public final long a2;
    public final Context x;
    public final f0 y;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    public class a extends BroadcastReceiver {
        public t0 a;

        public a(t0 t0Var) {
            this.a = t0Var;
        }

        public void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            t0.this.x.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            t0 t0Var = this.a;
            if (t0Var != null) {
                if (t0Var.d()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    t0 t0Var2 = this.a;
                    t0Var2.Z1.i.schedule(t0Var2, 0, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.a = null;
                }
            }
        }
    }

    public t0(s0 s0Var, Context context, f0 f0Var, long j) {
        this.Z1 = s0Var;
        this.x = context;
        this.a2 = j;
        this.y = f0Var;
        this.Y1 = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (c) {
            Boolean bool = q;
            if (bool == null) {
                z = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            q = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        StringBuilder sb = new StringBuilder(str.length() + PubNubErrorBuilder.PNERR_MESSAGE_MISSING);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        Log.d("FirebaseMessaging", sb.toString());
        return false;
    }

    public static boolean c(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (c) {
            Boolean bool = d;
            if (bool == null) {
                z = b(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            d = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.x.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        String str;
        if (c(this.x)) {
            this.Y1.acquire(b.a);
        }
        try {
            this.Z1.e(true);
            if (!this.y.d()) {
                this.Z1.e(false);
                if (c(this.x)) {
                    try {
                        this.Y1.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!a(this.x) || d()) {
                if (this.Z1.f()) {
                    this.Z1.e(false);
                } else {
                    this.Z1.g(this.a2);
                }
                if (c(this.x)) {
                    try {
                        this.Y1.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new a(this).a();
                if (c(this.x)) {
                    try {
                        this.Y1.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Failed to sync topics. Won't retry sync. ".concat(valueOf);
            } else {
                str = new String("Failed to sync topics. Won't retry sync. ");
            }
            Log.e("FirebaseMessaging", str);
            this.Z1.e(false);
            if (c(this.x)) {
                try {
                    this.Y1.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        } catch (Throwable th) {
            if (c(this.x)) {
                try {
                    this.Y1.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
