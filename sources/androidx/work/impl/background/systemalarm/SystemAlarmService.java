package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import h0.g0.i;
import h0.g0.r.p.b.e;
import h0.g0.r.t.l;
import h0.q.t;
import java.util.HashMap;
import java.util.WeakHashMap;

public class SystemAlarmService extends t implements e.c {
    public static final String d = i.e("SystemAlarmService");
    public e q;
    public boolean x;

    public final void a() {
        e eVar = new e(this);
        this.q = eVar;
        if (eVar.d2 != null) {
            i.c().b(e.c, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            eVar.d2 = this;
        }
    }

    public void b() {
        this.x = true;
        i.c().a(d, "All commands completed in dispatcher", new Throwable[0]);
        String str = l.a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = l.b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                i.c().f(l.a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        a();
        this.x = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.x = true;
        this.q.c();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.x) {
            i.c().d(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.q.c();
            a();
            this.x = false;
        }
        if (intent == null) {
            return 3;
        }
        this.q.a(intent, i2);
        return 3;
    }
}
