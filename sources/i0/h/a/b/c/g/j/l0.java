package i0.h.a.b.c.g.j;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import h0.b0.v;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.h;
import i0.h.a.b.c.g.j.d;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class l0<A extends d<? extends h, a.b>> extends p {
    public final A b;

    public l0(int i, A a) {
        super(i);
        v.A(a, "Null methods are not runnable.");
        this.b = a;
    }

    public final void b(Status status) {
        try {
            this.b.j(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(i0.h.a.b.c.g.j.f.a<?> r6) throws android.os.DeadObjectException {
        /*
            r5 = this;
            A r0 = r5.b     // Catch:{ RuntimeException -> 0x002a }
            i0.h.a.b.c.g.a$f r6 = r6.b     // Catch:{ RuntimeException -> 0x002a }
            java.util.Objects.requireNonNull(r0)     // Catch:{ RuntimeException -> 0x002a }
            r1 = 0
            r2 = 8
            r0.i(r6)     // Catch:{ DeadObjectException -> 0x001c, RemoteException -> 0x000e }
            goto L_0x001b
        L_0x000e:
            r6 = move-exception
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x002a }
            java.lang.String r6 = r6.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x002a }
            r3.<init>(r2, r6, r1)     // Catch:{ RuntimeException -> 0x002a }
            r0.j(r3)     // Catch:{ RuntimeException -> 0x002a }
        L_0x001b:
            return
        L_0x001c:
            r6 = move-exception
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x002a }
            java.lang.String r4 = r6.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x002a }
            r3.<init>(r2, r4, r1)     // Catch:{ RuntimeException -> 0x002a }
            r0.j(r3)     // Catch:{ RuntimeException -> 0x002a }
            throw r6     // Catch:{ RuntimeException -> 0x002a }
        L_0x002a:
            r6 = move-exception
            r5.e(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.g.j.l0.c(i0.h.a.b.c.g.j.f$a):void");
    }

    public final void d(q0 q0Var, boolean z) {
        A a = this.b;
        q0Var.a.put(a, Boolean.valueOf(z));
        a.a(new s0(q0Var, a));
    }

    public final void e(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(localizedMessage).length() + simpleName.length() + 2);
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.b.j(new Status(10, sb.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }
}
