package i0.h.a.b.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zza;
import h0.f.h;
import i0.h.a.b.m.b0;
import i0.h.a.b.m.c0;
import i0.h.a.b.m.g;
import i0.h.a.b.m.q;
import i0.h.a.b.m.y;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public class b {
    public static int a;
    public static PendingIntent b;
    public final h<String, i0.h.a.b.m.h<Bundle>> c = new h<>();
    public final Context d;
    public final r e;
    public final ScheduledExecutorService f;
    public Messenger g;
    public Messenger h;
    public zza i;

    public b(Context context) {
        this.d = context;
        this.e = new r(context);
        this.g = new Messenger(new y(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f = scheduledThreadPoolExecutor;
    }

    public g<Bundle> a(Bundle bundle) {
        int i2;
        int i3;
        PackageInfo b2;
        r rVar = this.e;
        synchronized (rVar) {
            if (rVar.b == 0 && (b2 = rVar.b("com.google.android.gms")) != null) {
                rVar.b = b2.versionCode;
            }
            i2 = rVar.b;
        }
        if (i2 >= 12000000) {
            f a2 = f.a(this.d);
            synchronized (a2) {
                i3 = a2.e;
                a2.e = i3 + 1;
            }
            return a2.b(new s(i3, bundle)).g(z.c, t.a);
        }
        if (this.e.a() != 0) {
            return c(bundle).h(z.c, new v(this, bundle));
        }
        IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
        b0 b0Var = new b0();
        b0Var.p(iOException);
        return b0Var;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.c) {
            i0.h.a.b.m.h remove = this.c.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.a.q(bundle);
        }
    }

    public final g<Bundle> c(Bundle bundle) {
        String num;
        Class<b> cls = b.class;
        synchronized (cls) {
            int i2 = a;
            a = i2 + 1;
            num = Integer.toString(i2);
        }
        i0.h.a.b.m.h hVar = new i0.h.a.b.m.h();
        synchronized (this.c) {
            this.c.put(num, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.e.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.d;
        synchronized (cls) {
            if (b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", b);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 5);
        sb.append("|ID|");
        sb.append(num);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.g);
        if (!(this.h == null && this.i == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.h;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.i.c;
                    Objects.requireNonNull(messenger2);
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            ScheduledFuture<?> schedule = this.f.schedule(new u(hVar), 30, TimeUnit.SECONDS);
            b0<TResult> b0Var = hVar.a;
            Executor executor = z.c;
            x xVar = new x(this, num, schedule);
            y<TResult> yVar = b0Var.b;
            int i3 = c0.a;
            yVar.b(new q(executor, xVar));
            b0Var.t();
            return hVar.a;
        }
        if (this.e.a() == 2) {
            this.d.sendBroadcast(intent);
        } else {
            this.d.startService(intent);
        }
        ScheduledFuture<?> schedule2 = this.f.schedule(new u(hVar), 30, TimeUnit.SECONDS);
        b0<TResult> b0Var2 = hVar.a;
        Executor executor2 = z.c;
        x xVar2 = new x(this, num, schedule2);
        y<TResult> yVar2 = b0Var2.b;
        int i32 = c0.a;
        yVar2.b(new q(executor2, xVar2));
        b0Var2.t();
        return hVar.a;
    }
}
