package i0.h.c.p;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import i0.h.c.c;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class u implements Runnable {
    public final long c;
    public final PowerManager.WakeLock d;
    public final FirebaseInstanceId q;

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    public static class a extends BroadcastReceiver {
        public u a;

        public a(u uVar) {
            this.a = uVar;
        }

        public void a() {
            t tVar = FirebaseInstanceId.b;
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            u uVar = this.a;
            if (uVar != null && uVar.b()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                u uVar2 = this.a;
                uVar2.q.e(uVar2, 0);
                this.a.a().unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    public u(FirebaseInstanceId firebaseInstanceId, long j) {
        b.a();
        this.q = firebaseInstanceId;
        this.c = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public Context a() {
        c cVar = this.q.f;
        cVar.a();
        return cVar.d;
    }

    public boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean c() throws IOException {
        boolean z = true;
        if (!this.q.q(this.q.j())) {
            return true;
        }
        try {
            if (this.q.c() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String message2 = e.getMessage();
                i0.d.a.a.a.t(new StringBuilder(String.valueOf(message2).length() + 52), "Token retrieval failed: ", message2, ". Will retry token retrieval", "FirebaseInstanceId");
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        if (s.a().c(a())) {
            this.d.acquire();
        }
        try {
            this.q.n(true);
            if (!this.q.l()) {
                this.q.n(false);
                if (!s.a().c(a())) {
                    return;
                }
            } else if (!s.a().b(a()) || b()) {
                if (c()) {
                    this.q.n(false);
                } else {
                    this.q.p(this.c);
                }
                if (!s.a().c(a())) {
                    return;
                }
            } else {
                new a(this).a();
                if (!s.a().c(a())) {
                    return;
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseInstanceId", sb.toString());
            this.q.n(false);
            if (!s.a().c(a())) {
                return;
            }
        } catch (Throwable th) {
            if (s.a().c(a())) {
                this.d.release();
            }
            throw th;
        }
        this.d.release();
    }
}
