package i0.h.a.b.c.g.j;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zao;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.c;
import i0.h.a.b.c.i.b;
import i0.h.a.b.c.i.k;
import i0.h.a.b.c.i.m;
import i0.h.a.b.c.i.n.d;
import i0.h.a.b.c.i.n.e;
import i0.h.a.b.c.i.o;
import i0.h.a.b.c.i.q0;
import i0.h.a.b.c.i.v;
import i0.h.a.b.k.g;
import i0.h.a.b.m.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class f implements Handler.Callback {
    @RecentlyNonNull
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    public static f d;
    public long e = 10000;
    public boolean f = false;
    public zaaa g;
    public o h;
    public final Context i;
    public final i0.h.a.b.c.b j;
    public final v k;
    public final AtomicInteger l;
    public final AtomicInteger m;
    public final Map<b<?>, a<?>> n;
    public final Set<b<?>> o;
    public final Set<b<?>> p;
    @NotOnlyInitialized
    public final Handler q;
    public volatile boolean r;

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public class a<O extends a.d> implements c.a, c.b {
        public final Queue<p> a = new LinkedList();
        @NotOnlyInitialized
        public final a.f b;
        public final b<O> c;
        public final q0 d;
        public final Set<o0> e = new HashSet();
        public final Map<i<?>, b0> f = new HashMap();
        public final int g;
        public final d0 h;
        public boolean i;
        public final List<b> j = new ArrayList();
        public ConnectionResult k = null;
        public int l = 0;

        public a(i0.h.a.b.c.g.b<O> bVar) {
            Looper looper = f.this.q.getLooper();
            i0.h.a.b.c.i.c a2 = bVar.a().a();
            a.C0131a aVar = bVar.c.a;
            Objects.requireNonNull(aVar, "null reference");
            a.f a3 = aVar.a(bVar.a, looper, a2, bVar.d, this, this);
            String str = bVar.b;
            if (str != null && (a3 instanceof i0.h.a.b.c.i.b)) {
                ((i0.h.a.b.c.i.b) a3).s = str;
            }
            if (str != null && (a3 instanceof j)) {
                Objects.requireNonNull((j) a3);
            }
            this.b = a3;
            this.c = bVar.e;
            this.d = new q0();
            this.g = bVar.g;
            if (a3.n()) {
                this.h = new d0(f.this.i, f.this.q, bVar.a().a());
            } else {
                this.h = null;
            }
        }

        public final void L(int i2) {
            if (Looper.myLooper() == f.this.q.getLooper()) {
                c(i2);
            } else {
                f.this.q.post(new s(this, i2));
            }
        }

        public final Feature a(Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] k2 = this.b.k();
                if (k2 == null) {
                    k2 = new Feature[0];
                }
                h0.f.a aVar = new h0.f.a(k2.length);
                for (Feature feature : k2) {
                    aVar.put(feature.c, Long.valueOf(feature.I0()));
                }
                for (Feature feature2 : featureArr) {
                    Long l2 = (Long) aVar.get(feature2.c);
                    if (l2 == null || l2.longValue() < feature2.I0()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        public final void b() {
            h0.b0.v.w(f.this.q);
            Status status = f.a;
            e(status);
            q0 q0Var = this.d;
            Objects.requireNonNull(q0Var);
            q0Var.a(false, status);
            for (i m0Var : (i[]) this.f.keySet().toArray(new i[0])) {
                g(new m0(m0Var, new h()));
            }
            j(new ConnectionResult(4));
            if (this.b.isConnected()) {
                this.b.h(new u(this));
            }
        }

        public final void c(int i2) {
            l();
            this.i = true;
            q0 q0Var = this.d;
            String l2 = this.b.l();
            Objects.requireNonNull(q0Var);
            StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
            if (i2 == 1) {
                sb.append(" due to service disconnection.");
            } else if (i2 == 3) {
                sb.append(" due to dead object exception.");
            }
            if (l2 != null) {
                sb.append(" Last reason for disconnect: ");
                sb.append(l2);
            }
            q0Var.a(true, new Status(20, sb.toString()));
            Handler handler = f.this.q;
            Message obtain = Message.obtain(handler, 9, this.c);
            Objects.requireNonNull(f.this);
            handler.sendMessageDelayed(obtain, 5000);
            Handler handler2 = f.this.q;
            Message obtain2 = Message.obtain(handler2, 11, this.c);
            Objects.requireNonNull(f.this);
            handler2.sendMessageDelayed(obtain2, 120000);
            f.this.k.a.clear();
            Iterator<b0> it = this.f.values().iterator();
            if (it.hasNext()) {
                Objects.requireNonNull(it.next());
                throw null;
            }
        }

        public final void d(ConnectionResult connectionResult, Exception exc) {
            g gVar;
            h0.b0.v.w(f.this.q);
            d0 d0Var = this.h;
            if (!(d0Var == null || (gVar = d0Var.g) == null)) {
                gVar.g();
            }
            l();
            f.this.k.a.clear();
            j(connectionResult);
            if (this.b instanceof e) {
                f fVar = f.this;
                fVar.f = true;
                Handler handler = fVar.q;
                handler.sendMessageDelayed(handler.obtainMessage(19), 300000);
            }
            if (connectionResult.q == 4) {
                e(f.b);
            } else if (this.a.isEmpty()) {
                this.k = connectionResult;
            } else if (exc != null) {
                h0.b0.v.w(f.this.q);
                f((Status) null, exc, false);
            } else if (!f.this.r) {
                Status c2 = f.c(this.c, connectionResult);
                h0.b0.v.w(f.this.q);
                f(c2, (Exception) null, false);
            } else {
                f(f.c(this.c, connectionResult), (Exception) null, true);
                if (!this.a.isEmpty()) {
                    synchronized (f.c) {
                        Objects.requireNonNull(f.this);
                    }
                    if (!f.this.b(connectionResult, this.g)) {
                        if (connectionResult.q == 18) {
                            this.i = true;
                        }
                        if (this.i) {
                            Handler handler2 = f.this.q;
                            Message obtain = Message.obtain(handler2, 9, this.c);
                            Objects.requireNonNull(f.this);
                            handler2.sendMessageDelayed(obtain, 5000);
                            return;
                        }
                        Status c3 = f.c(this.c, connectionResult);
                        h0.b0.v.w(f.this.q);
                        f(c3, (Exception) null, false);
                    }
                }
            }
        }

        public final void d0(ConnectionResult connectionResult) {
            d(connectionResult, (Exception) null);
        }

        public final void e(Status status) {
            h0.b0.v.w(f.this.q);
            f(status, (Exception) null, false);
        }

        public final void f(Status status, Exception exc, boolean z) {
            h0.b0.v.w(f.this.q);
            boolean z2 = true;
            boolean z3 = status == null;
            if (exc != null) {
                z2 = false;
            }
            if (z3 != z2) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    p pVar = (p) it.next();
                    if (!z || pVar.a == 2) {
                        if (status != null) {
                            pVar.b(status);
                        } else {
                            pVar.e(exc);
                        }
                        it.remove();
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Status XOR exception should be null");
        }

        public final void g(p pVar) {
            h0.b0.v.w(f.this.q);
            if (!this.b.isConnected()) {
                this.a.add(pVar);
                ConnectionResult connectionResult = this.k;
                if (connectionResult != null) {
                    if ((connectionResult.q == 0 || connectionResult.x == null) ? false : true) {
                        d(connectionResult, (Exception) null);
                        return;
                    }
                }
                m();
            } else if (i(pVar)) {
                r();
            } else {
                this.a.add(pVar);
            }
        }

        public final boolean h(boolean z) {
            h0.b0.v.w(f.this.q);
            if (!this.b.isConnected() || this.f.size() != 0) {
                return false;
            }
            q0 q0Var = this.d;
            if (!q0Var.a.isEmpty() || !q0Var.b.isEmpty()) {
                if (z) {
                    r();
                }
                return false;
            }
            this.b.c("Timing out service connection.");
            return true;
        }

        public final boolean i(p pVar) {
            if (!(pVar instanceof k0)) {
                k(pVar);
                return true;
            }
            k0 k0Var = (k0) pVar;
            Feature a2 = a(k0Var.f(this));
            if (a2 == null) {
                k(pVar);
                return true;
            }
            String name = this.b.getClass().getName();
            String str = a2.c;
            long I0 = a2.I0();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + name.length() + 77);
            sb.append(name);
            sb.append(" could not execute call because it requires feature (");
            sb.append(str);
            sb.append(", ");
            sb.append(I0);
            sb.append(").");
            Log.w("GoogleApiManager", sb.toString());
            if (!f.this.r || !k0Var.g(this)) {
                k0Var.e(new UnsupportedApiCallException(a2));
                return true;
            }
            b bVar = new b(this.c, a2, (r) null);
            int indexOf = this.j.indexOf(bVar);
            if (indexOf >= 0) {
                b bVar2 = this.j.get(indexOf);
                f.this.q.removeMessages(15, bVar2);
                Handler handler = f.this.q;
                Message obtain = Message.obtain(handler, 15, bVar2);
                Objects.requireNonNull(f.this);
                handler.sendMessageDelayed(obtain, 5000);
                return false;
            }
            this.j.add(bVar);
            Handler handler2 = f.this.q;
            Message obtain2 = Message.obtain(handler2, 15, bVar);
            Objects.requireNonNull(f.this);
            handler2.sendMessageDelayed(obtain2, 5000);
            Handler handler3 = f.this.q;
            Message obtain3 = Message.obtain(handler3, 16, bVar);
            Objects.requireNonNull(f.this);
            handler3.sendMessageDelayed(obtain3, 120000);
            ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
            synchronized (f.c) {
                Objects.requireNonNull(f.this);
            }
            f.this.b(connectionResult, this.g);
            return false;
        }

        public final void j(ConnectionResult connectionResult) {
            Iterator<o0> it = this.e.iterator();
            if (it.hasNext()) {
                o0 next = it.next();
                if (h0.b0.v.c0(connectionResult, ConnectionResult.c)) {
                    this.b.e();
                }
                Objects.requireNonNull(next);
                throw null;
            }
            this.e.clear();
        }

        public final void j0(Bundle bundle) {
            if (Looper.myLooper() == f.this.q.getLooper()) {
                o();
            } else {
                f.this.q.post(new t(this));
            }
        }

        public final void k(p pVar) {
            pVar.d(this.d, n());
            try {
                pVar.c(this);
            } catch (DeadObjectException unused) {
                L(1);
                this.b.c("DeadObjectException thrown while running ApiCallRunner.");
            } catch (Throwable th) {
                throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", new Object[]{this.b.getClass().getName()}), th);
            }
        }

        public final void l() {
            h0.b0.v.w(f.this.q);
            this.k = null;
        }

        public final void m() {
            h0.b0.v.w(f.this.q);
            if (!this.b.isConnected() && !this.b.d()) {
                try {
                    f fVar = f.this;
                    int a2 = fVar.k.a(fVar.i, this.b);
                    if (a2 != 0) {
                        ConnectionResult connectionResult = new ConnectionResult(a2, (PendingIntent) null);
                        String name = this.b.getClass().getName();
                        String valueOf = String.valueOf(connectionResult);
                        StringBuilder sb = new StringBuilder(name.length() + 35 + valueOf.length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(valueOf);
                        Log.w("GoogleApiManager", sb.toString());
                        d(connectionResult, (Exception) null);
                        return;
                    }
                    f fVar2 = f.this;
                    a.f fVar3 = this.b;
                    c cVar = new c(fVar3, this.c);
                    if (fVar3.n()) {
                        d0 d0Var = this.h;
                        Objects.requireNonNull(d0Var, "null reference");
                        g gVar = d0Var.g;
                        if (gVar != null) {
                            gVar.g();
                        }
                        d0Var.f.i = Integer.valueOf(System.identityHashCode(d0Var));
                        a.C0131a<? extends g, i0.h.a.b.k.a> aVar = d0Var.d;
                        Context context = d0Var.b;
                        Looper looper = d0Var.c.getLooper();
                        i0.h.a.b.c.i.c cVar2 = d0Var.f;
                        d0Var.g = (g) aVar.a(context, looper, cVar2, cVar2.h, d0Var, d0Var);
                        d0Var.h = cVar;
                        Set<Scope> set = d0Var.e;
                        if (set == null || set.isEmpty()) {
                            d0Var.c.post(new f0(d0Var));
                        } else {
                            d0Var.g.o();
                        }
                    }
                    try {
                        this.b.f(cVar);
                    } catch (SecurityException e2) {
                        d(new ConnectionResult(10), e2);
                    }
                } catch (IllegalStateException e3) {
                    d(new ConnectionResult(10), e3);
                }
            }
        }

        public final boolean n() {
            return this.b.n();
        }

        public final void o() {
            l();
            j(ConnectionResult.c);
            q();
            Iterator<b0> it = this.f.values().iterator();
            if (!it.hasNext()) {
                p();
                r();
                return;
            }
            Objects.requireNonNull(it.next());
            throw null;
        }

        public final void p() {
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                p pVar = (p) obj;
                if (!this.b.isConnected()) {
                    return;
                }
                if (i(pVar)) {
                    this.a.remove(pVar);
                }
            }
        }

        public final void q() {
            if (this.i) {
                f.this.q.removeMessages(11, this.c);
                f.this.q.removeMessages(9, this.c);
                this.i = false;
            }
        }

        public final void r() {
            f.this.q.removeMessages(12, this.c);
            Handler handler = f.this.q;
            handler.sendMessageDelayed(handler.obtainMessage(12, this.c), f.this.e);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public static class b {
        public final b<?> a;
        public final Feature b;

        public b(b bVar, Feature feature, r rVar) {
            this.a = bVar;
            this.b = feature;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (!h0.b0.v.c0(this.a, bVar.a) || !h0.b0.v.c0(this.b, bVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }

        public final String toString() {
            k kVar = new k(this, (q0) null);
            kVar.a(InstabugDbContract.UserAttributesEntry.COLUMN_KEY, this.a);
            kVar.a("feature", this.b);
            return kVar.toString();
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public class c implements g0, b.c {
        public final a.f a;
        public final b<?> b;
        public i0.h.a.b.c.i.g c = null;
        public Set<Scope> d = null;
        public boolean e = false;

        public c(a.f fVar, b<?> bVar) {
            this.a = fVar;
            this.b = bVar;
        }

        public final void a(ConnectionResult connectionResult) {
            f.this.q.post(new w(this, connectionResult));
        }

        public final void b(ConnectionResult connectionResult) {
            a aVar = f.this.n.get(this.b);
            if (aVar != null) {
                h0.b0.v.w(f.this.q);
                a.f fVar = aVar.b;
                String name = fVar.getClass().getName();
                String valueOf = String.valueOf(connectionResult);
                StringBuilder sb = new StringBuilder(valueOf.length() + name.length() + 25);
                sb.append("onSignInFailed for ");
                sb.append(name);
                sb.append(" with ");
                sb.append(valueOf);
                fVar.c(sb.toString());
                aVar.d(connectionResult, (Exception) null);
            }
        }
    }

    public f(Context context, Looper looper, i0.h.a.b.c.b bVar) {
        boolean z = true;
        this.l = new AtomicInteger(1);
        this.m = new AtomicInteger(0);
        this.n = new ConcurrentHashMap(5, 0.75f, 1);
        this.o = new h0.f.c(0);
        this.p = new h0.f.c(0);
        this.r = true;
        this.i = context;
        i0.h.a.b.g.c.e eVar = new i0.h.a.b.g.c.e(looper, this);
        this.q = eVar;
        this.j = bVar;
        this.k = new v(bVar);
        PackageManager packageManager = context.getPackageManager();
        if (h0.b0.v.e == null) {
            h0.b0.v.e = Boolean.valueOf((!i0.h.a.b.c.m.b.U() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z);
        }
        if (h0.b0.v.e.booleanValue()) {
            this.r = false;
        }
        eVar.sendMessage(eVar.obtainMessage(6));
    }

    @RecentlyNonNull
    public static f a(@RecentlyNonNull Context context) {
        f fVar;
        synchronized (c) {
            if (d == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = i0.h.a.b.c.b.b;
                d = new f(applicationContext, looper, i0.h.a.b.c.b.c);
            }
            fVar = d;
        }
        return fVar;
    }

    public static Status c(b<?> bVar, ConnectionResult connectionResult) {
        String str = bVar.b.c;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(str).length() + 63);
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(1, 17, sb.toString(), connectionResult.x, connectionResult);
    }

    public final boolean b(ConnectionResult connectionResult, int i2) {
        PendingIntent pendingIntent;
        i0.h.a.b.c.b bVar = this.j;
        Context context = this.i;
        Objects.requireNonNull(bVar);
        int i3 = connectionResult.q;
        if ((i3 == 0 || connectionResult.x == null) ? false : true) {
            pendingIntent = connectionResult.x;
        } else {
            Intent a2 = bVar.a(context, i3, (String) null);
            if (a2 == null) {
                pendingIntent = null;
            } else {
                pendingIntent = PendingIntent.getActivity(context, 0, a2, 134217728);
            }
        }
        if (pendingIntent == null) {
            return false;
        }
        int i4 = connectionResult.q;
        int i5 = GoogleApiActivity.c;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", true);
        bVar.e(context, i4, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }

    public final a<?> d(i0.h.a.b.c.g.b<?> bVar) {
        b<O> bVar2 = bVar.e;
        a<?> aVar = this.n.get(bVar2);
        if (aVar == null) {
            aVar = new a<>(bVar);
            this.n.put(bVar2, aVar);
        }
        if (aVar.n()) {
            this.p.add(bVar2);
        }
        aVar.m();
        return aVar;
    }

    public final boolean e() {
        if (this.f) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = m.a().c;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.d) {
            return false;
        }
        int i2 = this.k.a.get(203390000, -1);
        if (i2 == -1 || i2 == 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        zaaa zaaa = this.g;
        if (zaaa != null) {
            if (zaaa.c > 0 || e()) {
                if (this.h == null) {
                    this.h = new d(this.i);
                }
                ((d) this.h).d(zaaa);
            }
            this.g = null;
        }
    }

    public boolean handleMessage(@RecentlyNonNull Message message) {
        a aVar;
        Status status;
        Feature[] f2;
        int i2 = message.what;
        long j2 = 300000;
        int i3 = 0;
        switch (i2) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.e = j2;
                this.q.removeMessages(12);
                for (b<?> obtainMessage : this.n.keySet()) {
                    Handler handler = this.q;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.e);
                }
                break;
            case 2:
                Objects.requireNonNull((o0) message.obj);
                throw null;
            case 3:
                for (a next : this.n.values()) {
                    next.l();
                    next.m();
                }
                break;
            case 4:
            case 8:
            case 13:
                a0 a0Var = (a0) message.obj;
                a<?> aVar2 = this.n.get(a0Var.c.e);
                if (aVar2 == null) {
                    aVar2 = d(a0Var.c);
                }
                if (aVar2.n() && this.m.get() != a0Var.b) {
                    a0Var.a.b(a);
                    aVar2.b();
                    break;
                } else {
                    aVar2.g(a0Var.a);
                    break;
                }
                break;
            case 5:
                int i4 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<a<?>> it = this.n.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        aVar = it.next();
                        if (aVar.g == i4) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar != null) {
                    if (connectionResult.q != 13) {
                        Status c2 = c(aVar.c, connectionResult);
                        h0.b0.v.w(f.this.q);
                        aVar.f(c2, (Exception) null, false);
                        break;
                    } else {
                        i0.h.a.b.c.b bVar = this.j;
                        int i5 = connectionResult.q;
                        Objects.requireNonNull(bVar);
                        boolean z = i0.h.a.b.c.e.a;
                        String J0 = ConnectionResult.J0(i5);
                        String str = connectionResult.y;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(J0).length() + 69);
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(J0);
                        sb.append(": ");
                        sb.append(str);
                        Status status2 = new Status(17, sb.toString());
                        h0.b0.v.w(f.this.q);
                        aVar.f(status2, (Exception) null, false);
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i4);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.i.getApplicationContext() instanceof Application) {
                    c.a((Application) this.i.getApplicationContext());
                    c cVar = c.c;
                    r rVar = new r(this);
                    Objects.requireNonNull(cVar);
                    synchronized (cVar) {
                        cVar.x.add(rVar);
                    }
                    if (!cVar.q.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!cVar.q.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            cVar.d.set(true);
                        }
                    }
                    if (!cVar.d.get()) {
                        this.e = 300000;
                        break;
                    }
                }
                break;
            case 7:
                d((i0.h.a.b.c.g.b) message.obj);
                break;
            case 9:
                if (this.n.containsKey(message.obj)) {
                    a aVar3 = this.n.get(message.obj);
                    h0.b0.v.w(f.this.q);
                    if (aVar3.i) {
                        aVar3.m();
                        break;
                    }
                }
                break;
            case 10:
                for (b<?> remove : this.p) {
                    a remove2 = this.n.remove(remove);
                    if (remove2 != null) {
                        remove2.b();
                    }
                }
                this.p.clear();
                break;
            case 11:
                if (this.n.containsKey(message.obj)) {
                    a aVar4 = this.n.get(message.obj);
                    h0.b0.v.w(f.this.q);
                    if (aVar4.i) {
                        aVar4.q();
                        f fVar = f.this;
                        if (fVar.j.c(fVar.i) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        h0.b0.v.w(f.this.q);
                        aVar4.f(status, (Exception) null, false);
                        aVar4.b.c("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (this.n.containsKey(message.obj)) {
                    this.n.get(message.obj).h(true);
                    break;
                }
                break;
            case 14:
                Objects.requireNonNull((t0) message.obj);
                if (!this.n.containsKey((Object) null)) {
                    throw null;
                }
                this.n.get((Object) null).h(false);
                throw null;
            case 15:
                b bVar2 = (b) message.obj;
                if (this.n.containsKey(bVar2.a)) {
                    a aVar5 = this.n.get(bVar2.a);
                    if (aVar5.j.contains(bVar2) && !aVar5.i) {
                        if (aVar5.b.isConnected()) {
                            aVar5.p();
                            break;
                        } else {
                            aVar5.m();
                            break;
                        }
                    }
                }
                break;
            case 16:
                b bVar3 = (b) message.obj;
                if (this.n.containsKey(bVar3.a)) {
                    a aVar6 = this.n.get(bVar3.a);
                    if (aVar6.j.remove(bVar3)) {
                        f.this.q.removeMessages(15, bVar3);
                        f.this.q.removeMessages(16, bVar3);
                        Feature feature = bVar3.b;
                        ArrayList arrayList = new ArrayList(aVar6.a.size());
                        for (p pVar : aVar6.a) {
                            if ((pVar instanceof k0) && (f2 = ((k0) pVar).f(aVar6)) != null) {
                                int length = f2.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        i6 = -1;
                                    } else if (!h0.b0.v.c0(f2[i6], feature)) {
                                        i6++;
                                    }
                                }
                                if (i6 >= 0) {
                                    arrayList.add(pVar);
                                }
                            }
                        }
                        int size = arrayList.size();
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            p pVar2 = (p) obj;
                            aVar6.a.remove(pVar2);
                            pVar2.e(new UnsupportedApiCallException(feature));
                        }
                        break;
                    }
                }
                break;
            case 17:
                f();
                break;
            case 18:
                y yVar = (y) message.obj;
                if (yVar.c != 0) {
                    zaaa zaaa = this.g;
                    if (zaaa != null) {
                        List<zao> list = zaaa.d;
                        if (zaaa.c != yVar.b || (list != null && list.size() >= yVar.d)) {
                            this.q.removeMessages(17);
                            f();
                        } else {
                            zaaa zaaa2 = this.g;
                            zao zao = yVar.a;
                            if (zaaa2.d == null) {
                                zaaa2.d = new ArrayList();
                            }
                            zaaa2.d.add(zao);
                        }
                    }
                    if (this.g == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(yVar.a);
                        this.g = new zaaa(yVar.b, arrayList2);
                        Handler handler2 = this.q;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), yVar.c);
                        break;
                    }
                } else {
                    zaaa zaaa3 = new zaaa(yVar.b, Arrays.asList(new zao[]{yVar.a}));
                    if (this.h == null) {
                        this.h = new d(this.i);
                    }
                    ((d) this.h).d(zaaa3);
                    break;
                }
                break;
            case 19:
                this.f = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}
