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
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class o0 implements Runnable {
    public final long c;
    public final PowerManager.WakeLock d;
    public final FirebaseMessaging q;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    public static class a extends BroadcastReceiver {
        public o0 a;

        public a(o0 o0Var) {
            this.a = o0Var;
        }

        public void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.a.q.h.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            o0 o0Var = this.a;
            if (o0Var != null && o0Var.a()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                o0 o0Var2 = this.a;
                o0Var2.q.b(o0Var2, 0);
                this.a.q.h.unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public o0(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i0.h.a.b.c.m.f.a("firebase-iid-executor"));
        this.q = firebaseMessaging;
        this.c = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.h.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.q.h.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        boolean z = true;
        try {
            if (this.q.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String message2 = e.getMessage();
                i0.d.a.a.a.t(new StringBuilder(String.valueOf(message2).length() + 52), "Token retrieval failed: ", message2, ". Will retry token retrieval", "FirebaseMessaging");
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (k0.a().c(this.q.h)) {
            this.d.acquire();
        }
        try {
            this.q.f(true);
            if (!this.q.n.d()) {
                this.q.f(false);
                if (!k0.a().c(this.q.h)) {
                    return;
                }
            } else if (!k0.a().b(this.q.h) || a()) {
                if (b()) {
                    this.q.f(false);
                } else {
                    this.q.h(this.c);
                }
                if (!k0.a().c(this.q.h)) {
                    return;
                }
            } else {
                new a(this).a();
                if (!k0.a().c(this.q.h)) {
                    return;
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseMessaging", sb.toString());
            this.q.f(false);
            if (!k0.a().c(this.q.h)) {
                return;
            }
        } catch (Throwable th) {
            if (k0.a().c(this.q.h)) {
                this.d.release();
            }
            throw th;
        }
        this.d.release();
    }
}
