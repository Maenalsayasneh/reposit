package i0.h.a.b.c.i;

import android.accounts.Account;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import i0.h.a.b.c.g.a;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public abstract class d<T extends IInterface> extends b<T> implements a.f {
    public final c x;
    public final Set<Scope> y;
    public final Account z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(@androidx.annotation.RecentlyNonNull android.content.Context r12, @androidx.annotation.RecentlyNonNull android.os.Looper r13, int r14, @androidx.annotation.RecentlyNonNull i0.h.a.b.c.i.c r15, @androidx.annotation.RecentlyNonNull i0.h.a.b.c.g.j.e r16, @androidx.annotation.RecentlyNonNull i0.h.a.b.c.g.j.k r17) {
        /*
            r11 = this;
            r10 = r11
            r0 = r15
            r1 = r16
            r2 = r17
            java.lang.Object r3 = i0.h.a.b.c.i.e.a
            monitor-enter(r3)
            i0.h.a.b.c.i.e r4 = i0.h.a.b.c.i.e.b     // Catch:{ all -> 0x0066 }
            if (r4 != 0) goto L_0x0018
            i0.h.a.b.c.i.h0 r4 = new i0.h.a.b.c.i.h0     // Catch:{ all -> 0x0066 }
            android.content.Context r5 = r12.getApplicationContext()     // Catch:{ all -> 0x0066 }
            r4.<init>(r5)     // Catch:{ all -> 0x0066 }
            i0.h.a.b.c.i.e.b = r4     // Catch:{ all -> 0x0066 }
        L_0x0018:
            monitor-exit(r3)     // Catch:{ all -> 0x0066 }
            i0.h.a.b.c.i.e r4 = i0.h.a.b.c.i.e.b
            java.lang.Object r3 = i0.h.a.b.c.b.b
            i0.h.a.b.c.b r5 = i0.h.a.b.c.b.c
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r1, r3)
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)
            i0.h.a.b.c.i.t r7 = new i0.h.a.b.c.i.t
            r7.<init>(r1)
            i0.h.a.b.c.i.u r8 = new i0.h.a.b.c.i.u
            r8.<init>(r2)
            java.lang.String r9 = r0.g
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.x = r0
            android.accounts.Account r1 = r0.a
            r10.z = r1
            java.util.Set<com.google.android.gms.common.api.Scope> r0 = r0.c
            java.util.Iterator r1 = r0.iterator()
        L_0x0048:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0063
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x005b
            goto L_0x0048
        L_0x005b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expanding scopes is not permitted, use implied scopes instead"
            r0.<init>(r1)
            throw r0
        L_0x0063:
            r10.y = r0
            return
        L_0x0066:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.i.d.<init>(android.content.Context, android.os.Looper, int, i0.h.a.b.c.i.c, i0.h.a.b.c.g.j.e, i0.h.a.b.c.g.j.k):void");
    }

    public Set<Scope> a() {
        return n() ? this.y : Collections.emptySet();
    }

    @RecentlyNullable
    public final Account q() {
        return this.z;
    }

    @RecentlyNonNull
    public final Set<Scope> t() {
        return this.y;
    }
}
