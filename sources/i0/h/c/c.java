package i0.h.c;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import h0.b0.v;
import i0.h.a.b.c.g.j.c;
import i0.h.a.b.c.i.k;
import i0.h.a.b.c.i.q0;
import i0.h.c.j.m;
import i0.h.c.j.u;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FirebaseApp */
public class c {
    public static final Object a = new Object();
    public static final Executor b = new d((a) null);
    public static final Map<String, c> c = new h0.f.a();
    public final Context d;
    public final String e;
    public final h f;
    public final m g;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean();
    public final u<i0.h.c.s.a> j;
    public final List<b> k = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp */
    public interface b {
        void a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: i0.h.c.c$c  reason: collision with other inner class name */
    /* compiled from: FirebaseApp */
    public static class C0148c implements c.a {
        public static AtomicReference<C0148c> a = new AtomicReference<>();

        public void a(boolean z) {
            Object obj = c.a;
            synchronized (c.a) {
                Iterator it = new ArrayList(c.c.values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.h.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        for (b a2 : cVar.k) {
                            a2.a(z);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp */
    public static class d implements Executor {
        public static final Handler c = new Handler(Looper.getMainLooper());

        public d(a aVar) {
        }

        public void execute(Runnable runnable) {
            c.post(runnable);
        }
    }

    @TargetApi(24)
    /* compiled from: FirebaseApp */
    public static class e extends BroadcastReceiver {
        public static AtomicReference<e> a = new AtomicReference<>();
        public final Context b;

        public e(Context context) {
            this.b = context;
        }

        public void onReceive(Context context, Intent intent) {
            Object obj = c.a;
            synchronized (c.a) {
                for (c d : c.c.values()) {
                    d.d();
                }
            }
            this.b.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb A[LOOP:1: B:24:0x00b5->B:26:0x00bb, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r9, java.lang.String r10, i0.h.c.h r11) {
        /*
            r8 = this;
            r8.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r8.h = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.i = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.k = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.d = r9
            h0.b0.v.x(r10)
            r8.e = r10
            java.lang.String r10 = "null reference"
            java.util.Objects.requireNonNull(r11, r10)
            r8.f = r11
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r10 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "ComponentDiscovery"
            r3 = 0
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r4 != 0) goto L_0x0042
            java.lang.String r10 = "Context has no PackageManager."
            android.util.Log.w(r2, r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x006c
        L_0x0042:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0067 }
            r5.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r4 = r4.getServiceInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r4 != 0) goto L_0x0064
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0067 }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x0067 }
            r4.append(r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r10 = " has no service info."
            r4.append(r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r10 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0067 }
            android.util.Log.w(r2, r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x006c
        L_0x0064:
            android.os.Bundle r10 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x006d
        L_0x0067:
            java.lang.String r10 = "Application info not found."
            android.util.Log.w(r2, r10)
        L_0x006c:
            r10 = r3
        L_0x006d:
            if (r10 != 0) goto L_0x0079
            java.lang.String r10 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r2, r10)
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00b1
        L_0x0079:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r4 = r10.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0086:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b0
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.get(r5)
            java.lang.String r7 = "com.google.firebase.components.ComponentRegistrar"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0086
            java.lang.String r6 = "com.google.firebase.components:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x0086
            r6 = 31
            java.lang.String r5 = r5.substring(r6)
            r2.add(r5)
            goto L_0x0086
        L_0x00b0:
            r10 = r2
        L_0x00b1:
            java.util.Iterator r10 = r10.iterator()
        L_0x00b5:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            i0.h.c.j.f r4 = new i0.h.c.j.f
            r4.<init>(r2)
            r0.add(r4)
            goto L_0x00b5
        L_0x00ca:
            java.util.concurrent.Executor r10 = b
            int r2 = i0.h.c.j.m.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.addAll(r0)
            com.google.firebase.FirebaseCommonRegistrar r0 = new com.google.firebase.FirebaseCommonRegistrar
            r0.<init>()
            i0.h.c.j.n r5 = new i0.h.c.j.n
            r5.<init>(r0)
            r2.add(r5)
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            i0.h.c.j.d r0 = i0.h.c.j.d.c(r9, r0, r5)
            r4.add(r0)
            java.lang.Class<i0.h.c.c> r0 = i0.h.c.c.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            i0.h.c.j.d r0 = i0.h.c.j.d.c(r8, r0, r5)
            r4.add(r0)
            java.lang.Class<i0.h.c.h> r0 = i0.h.c.h.class
            java.lang.Class[] r1 = new java.lang.Class[r1]
            i0.h.c.j.d r11 = i0.h.c.j.d.c(r11, r0, r1)
            r4.add(r11)
            i0.h.c.j.m r11 = new i0.h.c.j.m
            r11.<init>(r10, r2, r4, r3)
            r8.g = r11
            i0.h.c.j.u r10 = new i0.h.c.j.u
            i0.h.c.b r11 = new i0.h.c.b
            r11.<init>(r8, r9)
            r10.<init>(r11)
            r8.j = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.c.<init>(android.content.Context, java.lang.String, i0.h.c.h):void");
    }

    public static c b() {
        c cVar;
        synchronized (a) {
            cVar = c.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + i0.h.a.b.c.m.c.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    public static c e(Context context, h hVar) {
        c cVar;
        AtomicReference<C0148c> atomicReference = C0148c.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (C0148c.a.get() == null) {
                C0148c cVar2 = new C0148c();
                if (C0148c.a.compareAndSet((Object) null, cVar2)) {
                    i0.h.a.b.c.g.j.c.a(application);
                    i0.h.a.b.c.g.j.c cVar3 = i0.h.a.b.c.g.j.c.c;
                    Objects.requireNonNull(cVar3);
                    synchronized (cVar3) {
                        cVar3.x.add(cVar2);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            Map<String, c> map = c;
            v.C(!map.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            v.A(context, "Application context cannot be null.");
            cVar = new c(context, "[DEFAULT]", hVar);
            map.put("[DEFAULT]", cVar);
        }
        cVar.d();
        return cVar;
    }

    public final void a() {
        v.C(!this.i.get(), "FirebaseApp was deleted");
    }

    public String c() {
        String str;
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.e.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb.append(str);
        sb.append("+");
        a();
        byte[] bytes2 = this.f.b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return sb.toString();
    }

    public final void d() {
        HashMap hashMap;
        if (!((UserManager) this.d.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.e);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.d;
            if (e.a.get() == null) {
                e eVar = new e(context);
                if (e.a.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.e);
        Log.i("FirebaseApp", sb2.toString());
        m mVar = this.g;
        a();
        boolean equals = "[DEFAULT]".equals(this.e);
        if (mVar.g.compareAndSet((Object) null, Boolean.valueOf(equals))) {
            synchronized (mVar) {
                hashMap = new HashMap(mVar.b);
            }
            mVar.e(hashMap, equals);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        String str = this.e;
        c cVar = (c) obj;
        cVar.a();
        return str.equals(cVar.e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        k kVar = new k(this, (q0) null);
        kVar.a("name", this.e);
        kVar.a("options", this.f);
        return kVar.toString();
    }
}
