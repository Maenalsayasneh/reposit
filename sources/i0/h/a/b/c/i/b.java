package i0.h.a.b.c.i;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzc;
import h0.b0.v;
import i0.h.a.b.c.g.j.u;
import i0.h.a.b.c.i.e;
import i0.h.a.b.c.i.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public abstract class b<T extends IInterface> {
    public static final Feature[] a = new Feature[0];
    public volatile String b = null;
    public m0 c;
    public final Context d;
    public final e e;
    public final Handler f;
    public final Object g = new Object();
    public final Object h = new Object();
    public j i;
    @RecentlyNonNull
    public c j;
    public T k;
    public final ArrayList<h<?>> l = new ArrayList<>();
    public i m;
    public int n = 1;
    public final a o;
    public final C0133b p;
    public final int q;
    public final String r;
    public volatile String s;
    public ConnectionResult t = null;
    public boolean u = false;
    public volatile zzc v = null;
    @RecentlyNonNull
    public AtomicInteger w = new AtomicInteger(0);

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public interface a {
    }

    /* renamed from: i0.h.a.b.c.i.b$b  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public interface C0133b {
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public interface c {
        void a(@RecentlyNonNull ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public class d implements c {
        public d() {
        }

        public void a(@RecentlyNonNull ConnectionResult connectionResult) {
            if (connectionResult.I0()) {
                b bVar = b.this;
                bVar.b((g) null, bVar.t());
                return;
            }
            C0133b bVar2 = b.this.p;
            if (bVar2 != null) {
                ((u) bVar2).a.d0(connectionResult);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public interface e {
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public abstract class f extends h<Boolean> {
        public final int d;
        public final Bundle e;

        public f(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.d = i;
            this.e = bundle;
        }

        /* JADX WARNING: type inference failed for: r3v6, types: [android.os.Parcelable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                int r3 = r2.d
                r0 = 1
                r1 = 0
                if (r3 != 0) goto L_0x001e
                boolean r3 = r2.e()
                if (r3 != 0) goto L_0x003a
                i0.h.a.b.c.i.b r3 = i0.h.a.b.c.i.b.this
                r3.y(r0, r1)
                com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
                r0 = 8
                r3.<init>(r0, r1)
                r2.d(r3)
                return
            L_0x001e:
                i0.h.a.b.c.i.b r3 = i0.h.a.b.c.i.b.this
                r3.y(r0, r1)
                android.os.Bundle r3 = r2.e
                if (r3 == 0) goto L_0x0030
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r3 = r3.getParcelable(r0)
                r1 = r3
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x0030:
                com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
                int r0 = r2.d
                r3.<init>(r0, r1)
                r2.d(r3)
            L_0x003a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.i.b.f.a(java.lang.Object):void");
        }

        public final void b() {
        }

        public abstract void d(ConnectionResult connectionResult);

        public abstract boolean e();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public final class g extends i0.h.a.b.g.e.d {
        public g(Looper looper) {
            super(looper);
        }

        public static boolean a(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
            if (r0 == 5) goto L_0x0031;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                i0.h.a.b.c.i.b r0 = i0.h.a.b.c.i.b.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.w
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x001d
                boolean r0 = a(r8)
                if (r0 == 0) goto L_0x001c
                java.lang.Object r8 = r8.obj
                i0.h.a.b.c.i.b$h r8 = (i0.h.a.b.c.i.b.h) r8
                r8.b()
                r8.c()
            L_0x001c:
                return
            L_0x001d:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L_0x0031
                r4 = 7
                if (r0 == r4) goto L_0x0031
                if (r0 != r1) goto L_0x002f
                i0.h.a.b.c.i.b r0 = i0.h.a.b.c.i.b.this
                java.util.Objects.requireNonNull(r0)
                goto L_0x0031
            L_0x002f:
                if (r0 != r3) goto L_0x0044
            L_0x0031:
                i0.h.a.b.c.i.b r0 = i0.h.a.b.c.i.b.this
                boolean r0 = r0.d()
                if (r0 != 0) goto L_0x0044
                java.lang.Object r8 = r8.obj
                i0.h.a.b.c.i.b$h r8 = (i0.h.a.b.c.i.b.h) r8
                r8.b()
                r8.c()
                return
            L_0x0044:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L_0x0085
                i0.h.a.b.c.i.b r0 = i0.h.a.b.c.i.b.this
                com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
                int r8 = r8.arg2
                r1.<init>(r8)
                r0.t = r1
                i0.h.a.b.c.i.b r8 = i0.h.a.b.c.i.b.this
                boolean r8 = i0.h.a.b.c.i.b.B(r8)
                if (r8 == 0) goto L_0x0069
                i0.h.a.b.c.i.b r8 = i0.h.a.b.c.i.b.this
                boolean r0 = r8.u
                if (r0 != 0) goto L_0x0069
                r8.y(r5, r6)
                return
            L_0x0069:
                i0.h.a.b.c.i.b r8 = i0.h.a.b.c.i.b.this
                com.google.android.gms.common.ConnectionResult r8 = r8.t
                if (r8 == 0) goto L_0x0070
                goto L_0x0075
            L_0x0070:
                com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
                r8.<init>(r4)
            L_0x0075:
                i0.h.a.b.c.i.b r0 = i0.h.a.b.c.i.b.this
                i0.h.a.b.c.i.b$c r0 = r0.j
                r0.a(r8)
                i0.h.a.b.c.i.b r8 = i0.h.a.b.c.i.b.this
                java.util.Objects.requireNonNull(r8)
                java.lang.System.currentTimeMillis()
                return
            L_0x0085:
                if (r0 != r3) goto L_0x00a3
                i0.h.a.b.c.i.b r8 = i0.h.a.b.c.i.b.this
                com.google.android.gms.common.ConnectionResult r8 = r8.t
                if (r8 == 0) goto L_0x008e
                goto L_0x0093
            L_0x008e:
                com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
                r8.<init>(r4)
            L_0x0093:
                i0.h.a.b.c.i.b r0 = i0.h.a.b.c.i.b.this
                i0.h.a.b.c.i.b$c r0 = r0.j
                r0.a(r8)
                i0.h.a.b.c.i.b r8 = i0.h.a.b.c.i.b.this
                java.util.Objects.requireNonNull(r8)
                java.lang.System.currentTimeMillis()
                return
            L_0x00a3:
                if (r0 != r5) goto L_0x00c5
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00ae
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00ae:
                com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                i0.h.a.b.c.i.b r8 = i0.h.a.b.c.i.b.this
                i0.h.a.b.c.i.b$c r8 = r8.j
                r8.a(r0)
                i0.h.a.b.c.i.b r8 = i0.h.a.b.c.i.b.this
                java.util.Objects.requireNonNull(r8)
                java.lang.System.currentTimeMillis()
                return
            L_0x00c5:
                r1 = 6
                if (r0 != r1) goto L_0x00ea
                i0.h.a.b.c.i.b r0 = i0.h.a.b.c.i.b.this
                r0.y(r3, r6)
                i0.h.a.b.c.i.b r0 = i0.h.a.b.c.i.b.this
                i0.h.a.b.c.i.b$a r0 = r0.o
                if (r0 == 0) goto L_0x00dc
                int r8 = r8.arg2
                i0.h.a.b.c.i.t r0 = (i0.h.a.b.c.i.t) r0
                i0.h.a.b.c.g.j.e r0 = r0.a
                r0.L(r8)
            L_0x00dc:
                i0.h.a.b.c.i.b r8 = i0.h.a.b.c.i.b.this
                java.util.Objects.requireNonNull(r8)
                java.lang.System.currentTimeMillis()
                i0.h.a.b.c.i.b r8 = i0.h.a.b.c.i.b.this
                i0.h.a.b.c.i.b.A(r8, r3, r2, r6)
                return
            L_0x00ea:
                r1 = 2
                if (r0 != r1) goto L_0x0100
                i0.h.a.b.c.i.b r0 = i0.h.a.b.c.i.b.this
                boolean r0 = r0.isConnected()
                if (r0 != 0) goto L_0x0100
                java.lang.Object r8 = r8.obj
                i0.h.a.b.c.i.b$h r8 = (i0.h.a.b.c.i.b.h) r8
                r8.b()
                r8.c()
                return
            L_0x0100:
                boolean r0 = a(r8)
                if (r0 == 0) goto L_0x0154
                java.lang.Object r8 = r8.obj
                r0 = r8
                i0.h.a.b.c.i.b$h r0 = (i0.h.a.b.c.i.b.h) r0
                monitor-enter(r0)
                TListener r8 = r0.a     // Catch:{ all -> 0x0151 }
                boolean r1 = r0.b     // Catch:{ all -> 0x0151 }
                if (r1 == 0) goto L_0x0137
                java.lang.String r1 = "GmsClient"
                java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0151 }
                int r4 = r3.length()     // Catch:{ all -> 0x0151 }
                int r4 = r4 + 47
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
                r5.<init>(r4)     // Catch:{ all -> 0x0151 }
                java.lang.String r4 = "Callback proxy "
                r5.append(r4)     // Catch:{ all -> 0x0151 }
                r5.append(r3)     // Catch:{ all -> 0x0151 }
                java.lang.String r3 = " being reused. This is not safe."
                r5.append(r3)     // Catch:{ all -> 0x0151 }
                java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0151 }
                android.util.Log.w(r1, r3)     // Catch:{ all -> 0x0151 }
            L_0x0137:
                monitor-exit(r0)     // Catch:{ all -> 0x0151 }
                if (r8 == 0) goto L_0x0143
                r0.a(r8)     // Catch:{ RuntimeException -> 0x013e }
                goto L_0x0146
            L_0x013e:
                r8 = move-exception
                r0.b()
                throw r8
            L_0x0143:
                r0.b()
            L_0x0146:
                monitor-enter(r0)
                r0.b = r2     // Catch:{ all -> 0x014e }
                monitor-exit(r0)     // Catch:{ all -> 0x014e }
                r0.c()
                return
            L_0x014e:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x014e }
                throw r8
            L_0x0151:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0151 }
                throw r8
            L_0x0154:
                java.lang.String r0 = "GmsClient"
                int r8 = r8.what
                r1 = 45
                java.lang.String r2 = "Don't know how to handle message: "
                java.lang.String r8 = i0.d.a.a.a.Q(r1, r2, r8)
                java.lang.Exception r1 = new java.lang.Exception
                r1.<init>()
                android.util.Log.wtf(r0, r8, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.i.b.g.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public abstract class h<TListener> {
        public TListener a;
        public boolean b = false;

        public h(TListener tlistener) {
            this.a = tlistener;
        }

        public abstract void a(TListener tlistener);

        public abstract void b();

        public final void c() {
            synchronized (this) {
                this.a = null;
            }
            synchronized (b.this.l) {
                b.this.l.remove(this);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public final class i implements ServiceConnection {
        public final int a;

        public i(int i) {
            this.a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            j jVar;
            if (iBinder == null) {
                b.z(b.this);
                return;
            }
            synchronized (b.this.h) {
                b bVar = b.this;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof j)) {
                    jVar = new i(iBinder);
                } else {
                    jVar = (j) queryLocalInterface;
                }
                bVar.i = jVar;
            }
            b bVar2 = b.this;
            int i = this.a;
            Handler handler = bVar2.f;
            handler.sendMessage(handler.obtainMessage(7, i, -1, new l(0)));
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            b bVar;
            synchronized (b.this.h) {
                bVar = b.this;
                bVar.i = null;
            }
            Handler handler = bVar.f;
            handler.sendMessage(handler.obtainMessage(6, this.a, 1));
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public static final class j extends h.a {
        public b a;
        public final int b;

        public j(b bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        public final void d0(int i, IBinder iBinder, Bundle bundle) {
            v.A(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
            b bVar = this.a;
            int i2 = this.b;
            Handler handler = bVar.f;
            handler.sendMessage(handler.obtainMessage(1, i2, -1, new k(i, iBinder, bundle)));
            this.a = null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public final class k extends f {
        public final IBinder g;

        public k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.g = iBinder;
        }

        public final void d(ConnectionResult connectionResult) {
            C0133b bVar = b.this.p;
            if (bVar != null) {
                ((u) bVar).a.d0(connectionResult);
            }
            Objects.requireNonNull(b.this);
            System.currentTimeMillis();
        }

        public final boolean e() {
            try {
                IBinder iBinder = this.g;
                Objects.requireNonNull(iBinder, "null reference");
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if (!b.this.v().equals(interfaceDescriptor)) {
                    String v = b.this.v();
                    StringBuilder sb = new StringBuilder(String.valueOf(interfaceDescriptor).length() + String.valueOf(v).length() + 34);
                    sb.append("service descriptor mismatch: ");
                    sb.append(v);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface p = b.this.p(this.g);
                if (p == null || (!b.A(b.this, 2, 4, p) && !b.A(b.this, 3, 4, p))) {
                    return false;
                }
                b bVar = b.this;
                bVar.t = null;
                a aVar = bVar.o;
                if (aVar == null) {
                    return true;
                }
                ((t) aVar).a.j0((Bundle) null);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public final class l extends f {
        public l(int i) {
            super(i, (Bundle) null);
        }

        public final void d(ConnectionResult connectionResult) {
            Objects.requireNonNull(b.this);
            b.this.j.a(connectionResult);
            Objects.requireNonNull(b.this);
            System.currentTimeMillis();
        }

        public final boolean e() {
            b.this.j.a(ConnectionResult.c);
            return true;
        }
    }

    public b(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull e eVar, @RecentlyNonNull i0.h.a.b.c.c cVar, int i2, a aVar, C0133b bVar, String str) {
        v.A(context, "Context must not be null");
        this.d = context;
        v.A(looper, "Looper must not be null");
        v.A(eVar, "Supervisor must not be null");
        this.e = eVar;
        v.A(cVar, "API availability must not be null");
        this.f = new g(looper);
        this.q = i2;
        this.o = aVar;
        this.p = bVar;
        this.r = str;
    }

    public static boolean A(b bVar, int i2, int i3, IInterface iInterface) {
        boolean z;
        synchronized (bVar.g) {
            if (bVar.n != i2) {
                z = false;
            } else {
                bVar.y(i3, iInterface);
                z = true;
            }
        }
        return z;
    }

    public static boolean B(b bVar) {
        if (bVar.u || TextUtils.isEmpty(bVar.v()) || TextUtils.isEmpty((CharSequence) null)) {
            return false;
        }
        try {
            Class.forName(bVar.v());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static void z(b bVar) {
        boolean z;
        int i2;
        synchronized (bVar.g) {
            z = bVar.n == 3;
        }
        if (z) {
            i2 = 5;
            bVar.u = true;
        } else {
            i2 = 4;
        }
        Handler handler = bVar.f;
        handler.sendMessage(handler.obtainMessage(i2, bVar.w.get(), 16));
    }

    public void b(g gVar, @RecentlyNonNull Set<Scope> set) {
        Bundle s2 = s();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.q, this.s);
        getServiceRequest.x = this.d.getPackageName();
        getServiceRequest.Z1 = s2;
        if (set != null) {
            getServiceRequest.Y1 = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (n()) {
            Account q2 = q();
            if (q2 == null) {
                q2 = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.a2 = q2;
            if (gVar != null) {
                getServiceRequest.y = gVar.asBinder();
            }
        } else if (this instanceof i0.h.a.b.g.k.b) {
            getServiceRequest.a2 = q();
        }
        getServiceRequest.b2 = a;
        getServiceRequest.c2 = r();
        if (this instanceof i0.h.a.b.g.k.b) {
            getServiceRequest.f2 = true;
        }
        try {
            synchronized (this.h) {
                j jVar = this.i;
                if (jVar != null) {
                    jVar.v(new j(this, this.w.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            Handler handler = this.f;
            handler.sendMessage(handler.obtainMessage(6, this.w.get(), 3));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            int i2 = this.w.get();
            Handler handler2 = this.f;
            handler2.sendMessage(handler2.obtainMessage(1, i2, -1, new k(8, (IBinder) null, (Bundle) null)));
        }
    }

    public void c(@RecentlyNonNull String str) {
        this.b = str;
        g();
    }

    public boolean d() {
        boolean z;
        synchronized (this.g) {
            int i2 = this.n;
            if (i2 != 2) {
                if (i2 != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @RecentlyNonNull
    public String e() {
        m0 m0Var;
        if (!isConnected() || (m0Var = this.c) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        Objects.requireNonNull(m0Var);
        return "com.google.android.gms";
    }

    public void f(@RecentlyNonNull c cVar) {
        v.A(cVar, "Connection progress callbacks cannot be null.");
        this.j = cVar;
        y(2, (IInterface) null);
    }

    public void g() {
        this.w.incrementAndGet();
        synchronized (this.l) {
            int size = this.l.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = this.l.get(i2);
                synchronized (hVar) {
                    hVar.a = null;
                }
            }
            this.l.clear();
        }
        synchronized (this.h) {
            this.i = null;
        }
        y(1, (IInterface) null);
    }

    public void h(@RecentlyNonNull e eVar) {
        u uVar = (u) eVar;
        i0.h.a.b.c.g.j.f.this.q.post(new i0.h.a.b.c.g.j.v(uVar));
    }

    public boolean i() {
        return true;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    public int j() {
        return i0.h.a.b.c.c.a;
    }

    @RecentlyNullable
    public final Feature[] k() {
        zzc zzc = this.v;
        if (zzc == null) {
            return null;
        }
        return zzc.d;
    }

    @RecentlyNullable
    public String l() {
        return this.b;
    }

    public boolean n() {
        return false;
    }

    @RecentlyNullable
    public abstract T p(@RecentlyNonNull IBinder iBinder);

    @RecentlyNullable
    public Account q() {
        return null;
    }

    @RecentlyNonNull
    public Feature[] r() {
        return a;
    }

    @RecentlyNonNull
    public Bundle s() {
        return new Bundle();
    }

    @RecentlyNonNull
    public Set<Scope> t() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    public final T u() throws DeadObjectException {
        T t2;
        synchronized (this.g) {
            if (this.n == 5) {
                throw new DeadObjectException();
            } else if (isConnected()) {
                T t3 = this.k;
                v.A(t3, "Client is connected but service is null");
                t2 = (IInterface) t3;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return t2;
    }

    public abstract String v();

    public abstract String w();

    public final String x() {
        String str = this.r;
        return str == null ? this.d.getClass().getName() : str;
    }

    public final void y(int i2, T t2) {
        m0 m0Var;
        boolean z = false;
        if ((i2 == 4) == (t2 != null)) {
            z = true;
        }
        v.t(z);
        synchronized (this.g) {
            this.n = i2;
            this.k = t2;
            if (i2 == 1) {
                i iVar = this.m;
                if (iVar != null) {
                    e eVar = this.e;
                    String str = this.c.a;
                    Objects.requireNonNull(str, "null reference");
                    Objects.requireNonNull(this.c);
                    String x = x();
                    boolean z2 = this.c.b;
                    Objects.requireNonNull(eVar);
                    eVar.b(new e.a(str, "com.google.android.gms", 4225, z2), iVar, x);
                    this.m = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                i iVar2 = this.m;
                if (!(iVar2 == null || (m0Var = this.c) == null)) {
                    String str2 = m0Var.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str2);
                    sb.append(" on ");
                    sb.append("com.google.android.gms");
                    Log.e("GmsClient", sb.toString());
                    e eVar2 = this.e;
                    String str3 = this.c.a;
                    Objects.requireNonNull(str3, "null reference");
                    Objects.requireNonNull(this.c);
                    String x2 = x();
                    boolean z3 = this.c.b;
                    Objects.requireNonNull(eVar2);
                    eVar2.b(new e.a(str3, "com.google.android.gms", 4225, z3), iVar2, x2);
                    this.w.incrementAndGet();
                }
                i iVar3 = new i(this.w.get());
                this.m = iVar3;
                String w2 = w();
                Object obj = e.a;
                boolean z4 = this instanceof i0.h.a.b.c.i.n.e;
                this.c = new m0("com.google.android.gms", w2, false, 4225, z4);
                if (!z4 || j() >= 17895000) {
                    e eVar3 = this.e;
                    String str4 = this.c.a;
                    Objects.requireNonNull(str4, "null reference");
                    Objects.requireNonNull(this.c);
                    if (!eVar3.a(new e.a(str4, "com.google.android.gms", 4225, this.c.b), iVar3, x())) {
                        String str5 = this.c.a;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on ");
                        sb2.append("com.google.android.gms");
                        Log.e("GmsClient", sb2.toString());
                        int i3 = this.w.get();
                        Handler handler = this.f;
                        handler.sendMessage(handler.obtainMessage(7, i3, -1, new l(16)));
                    }
                } else {
                    String valueOf = String.valueOf(this.c.a);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
            } else if (i2 == 4) {
                Objects.requireNonNull(t2, "null reference");
                System.currentTimeMillis();
            }
        }
    }
}
