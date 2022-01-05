package i0.h.a.b.c.g;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.a.d;
import i0.h.a.b.c.g.j.a0;
import i0.h.a.b.c.g.j.f;
import i0.h.a.b.c.g.j.l0;
import i0.h.a.b.c.g.j.n;
import i0.h.a.b.c.g.j.n0;
import i0.h.a.b.c.g.j.q;
import i0.h.a.b.c.g.j.z;
import i0.h.a.b.c.i.c;
import i0.h.a.b.c.i.m;
import i0.h.a.b.m.b0;
import i0.h.a.b.m.c0;
import i0.h.a.b.m.g;
import i0.h.a.b.m.h;
import i0.h.a.b.m.y;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class b<O extends a.d> {
    public final Context a;
    public final String b;
    public final a<O> c;
    public final O d;
    public final i0.h.a.b.c.g.j.b<O> e;
    public final Looper f;
    public final int g;
    @NotOnlyInitialized
    public final c h;
    public final i0.h.a.b.c.g.j.a i;
    public final f j;

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public static class a {
        @RecentlyNonNull
        public static final a a = new a(new i0.h.a.b.c.g.j.a(), (Account) null, Looper.getMainLooper());
        @RecentlyNonNull
        public final i0.h.a.b.c.g.j.a b;
        @RecentlyNonNull
        public final Looper c;

        public a(i0.h.a.b.c.g.j.a aVar, Account account, Looper looper) {
            this.b = aVar;
            this.c = looper;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(@androidx.annotation.RecentlyNonNull android.content.Context r6, @androidx.annotation.RecentlyNonNull i0.h.a.b.c.g.a<O> r7, @androidx.annotation.RecentlyNonNull O r8, @androidx.annotation.RecentlyNonNull i0.h.a.b.c.g.b.a r9) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "Null context is not permitted."
            h0.b0.v.A(r6, r0)
            java.lang.String r0 = "Api must not be null."
            h0.b0.v.A(r7, r0)
            java.lang.String r0 = "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."
            h0.b0.v.A(r9, r0)
            android.content.Context r0 = r6.getApplicationContext()
            r5.a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L_0x0022
            r1 = r2
            goto L_0x0023
        L_0x0022:
            r1 = r3
        L_0x0023:
            if (r1 != 0) goto L_0x0026
            goto L_0x0053
        L_0x0026:
            r1 = 30
            if (r0 < r1) goto L_0x0036
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "REL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            goto L_0x00a9
        L_0x0036:
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r1 = r0.length()
            if (r1 != r2) goto L_0x0050
            char r1 = r0.charAt(r3)
            r4 = 82
            if (r1 < r4) goto L_0x0050
            char r0 = r0.charAt(r3)
            r1 = 90
            if (r0 > r1) goto L_0x0050
            r0 = r2
            goto L_0x0051
        L_0x0050:
            r0 = r3
        L_0x0051:
            if (r0 != 0) goto L_0x0055
        L_0x0053:
            r2 = r3
            goto L_0x00a9
        L_0x0055:
            java.lang.Boolean r0 = i0.h.a.b.c.m.b.a
            if (r0 == 0) goto L_0x005e
            boolean r2 = r0.booleanValue()
            goto L_0x00a9
        L_0x005e:
            java.lang.String r0 = "google"
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ NumberFormatException -> 0x0090 }
            boolean r0 = r0.equals(r1)     // Catch:{ NumberFormatException -> 0x0090 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = android.os.Build.ID     // Catch:{ NumberFormatException -> 0x0090 }
            java.lang.String r1 = "RPP1"
            boolean r0 = r0.startsWith(r1)     // Catch:{ NumberFormatException -> 0x0090 }
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = android.os.Build.ID     // Catch:{ NumberFormatException -> 0x0090 }
            java.lang.String r1 = "RPP2"
            boolean r0 = r0.startsWith(r1)     // Catch:{ NumberFormatException -> 0x0090 }
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ NumberFormatException -> 0x0090 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0090 }
            r1 = 6301457(0x602711, float:8.830222E-39)
            if (r0 < r1) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r2 = r3
        L_0x0089:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0090 }
            i0.h.a.b.c.m.b.a = r0     // Catch:{ NumberFormatException -> 0x0090 }
            goto L_0x0094
        L_0x0090:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.h.a.b.c.m.b.a = r0
        L_0x0094:
            java.lang.Boolean r0 = i0.h.a.b.c.m.b.a
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "PlatformVersion"
            java.lang.String r1 = "Build version must be at least 6301457 to support R in gmscore"
            android.util.Log.w(r0, r1)
        L_0x00a3:
            java.lang.Boolean r0 = i0.h.a.b.c.m.b.a
            boolean r2 = r0.booleanValue()
        L_0x00a9:
            if (r2 == 0) goto L_0x00be
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r1 = "getAttributionTag"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00be }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00be }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00be }
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00be }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00be }
            goto L_0x00bf
        L_0x00be:
            r6 = 0
        L_0x00bf:
            r5.b = r6
            r5.c = r7
            r5.d = r8
            android.os.Looper r0 = r9.c
            r5.f = r0
            i0.h.a.b.c.g.j.b r0 = new i0.h.a.b.c.g.j.b
            r0.<init>(r7, r8, r6)
            r5.e = r0
            i0.h.a.b.c.g.j.x r6 = new i0.h.a.b.c.g.j.x
            r6.<init>(r5)
            r5.h = r6
            android.content.Context r6 = r5.a
            i0.h.a.b.c.g.j.f r6 = i0.h.a.b.c.g.j.f.a(r6)
            r5.j = r6
            java.util.concurrent.atomic.AtomicInteger r7 = r6.l
            int r7 = r7.getAndIncrement()
            r5.g = r7
            i0.h.a.b.c.g.j.a r7 = r9.b
            r5.i = r7
            android.os.Handler r6 = r6.q
            r7 = 7
            android.os.Message r7 = r6.obtainMessage(r7, r5)
            r6.sendMessage(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.g.b.<init>(android.content.Context, i0.h.a.b.c.g.a, i0.h.a.b.c.g.a$d, i0.h.a.b.c.g.b$a):void");
    }

    @RecentlyNonNull
    public c.a a() {
        Set<Scope> set;
        GoogleSignInAccount k;
        GoogleSignInAccount k2;
        c.a aVar = new c.a();
        O o = this.d;
        Account account = null;
        if (!(o instanceof a.d.b) || (k2 = ((a.d.b) o).k()) == null) {
            O o2 = this.d;
            if (o2 instanceof a.d.C0132a) {
                account = ((a.d.C0132a) o2).J();
            }
        } else if (k2.x != null) {
            account = new Account(k2.x, "com.google");
        }
        aVar.a = account;
        O o3 = this.d;
        if (!(o3 instanceof a.d.b) || (k = ((a.d.b) o3).k()) == null) {
            set = Collections.emptySet();
        } else {
            set = k.I0();
        }
        if (aVar.b == null) {
            aVar.b = new h0.f.c<>(0);
        }
        aVar.b.addAll(set);
        aVar.d = this.a.getClass().getName();
        aVar.c = this.a.getPackageName();
        return aVar;
    }

    public final <A extends a.b, T extends i0.h.a.b.c.g.j.d<? extends h, A>> T b(int i2, T t) {
        t.k = t.k || BasePendingResult.a.get().booleanValue();
        f fVar = this.j;
        Objects.requireNonNull(fVar);
        l0 l0Var = new l0(i2, t);
        Handler handler = fVar.q;
        handler.sendMessage(handler.obtainMessage(4, new a0(l0Var, fVar.m.get(), this)));
        return t;
    }

    public final <TResult, A extends a.b> g<TResult> c(int i2, n<A, TResult> nVar) {
        h hVar = new h();
        f fVar = this.j;
        i0.h.a.b.c.g.j.a aVar = this.i;
        Objects.requireNonNull(fVar);
        int i3 = nVar.c;
        if (i3 != 0) {
            i0.h.a.b.c.g.j.b<O> bVar = this.e;
            z zVar = null;
            if (fVar.e()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = m.a().c;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.d) {
                        boolean z2 = rootTelemetryConfiguration.q;
                        f.a aVar2 = fVar.n.get(bVar);
                        if (aVar2 == null || !aVar2.b.isConnected() || !(aVar2.b instanceof i0.h.a.b.c.i.b)) {
                            z = z2;
                        } else {
                            ConnectionTelemetryConfiguration a2 = z.a(aVar2, i3);
                            if (a2 != null) {
                                aVar2.l++;
                                z = a2.q;
                            }
                        }
                    }
                }
                zVar = new z(fVar, i3, bVar, z ? System.currentTimeMillis() : 0);
            }
            if (zVar != null) {
                b0<TResult> b0Var = hVar.a;
                Handler handler = fVar.q;
                handler.getClass();
                q qVar = new q(handler);
                y<TResult> yVar = b0Var.b;
                int i4 = c0.a;
                yVar.b(new i0.h.a.b.m.q(qVar, zVar));
                b0Var.t();
            }
        }
        n0 n0Var = new n0(i2, nVar, hVar, aVar);
        Handler handler2 = fVar.q;
        handler2.sendMessage(handler2.obtainMessage(4, new a0(n0Var, fVar.m.get(), this)));
        return hVar.a;
    }
}
