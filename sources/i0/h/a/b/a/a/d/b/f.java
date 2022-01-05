package i0.h.a.b.a.a.d.b;

import android.content.Context;
import android.os.Handler;
import i0.h.a.b.c.g.c;
import i0.h.a.b.c.j.a;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public final class f {
    public static a a = new a("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        l.b(context).a();
        Set<c> set = c.a;
        synchronized (set) {
        }
        Iterator<c> it = set.iterator();
        if (!it.hasNext()) {
            synchronized (i0.h.a.b.c.g.j.f.c) {
                i0.h.a.b.c.g.j.f fVar = i0.h.a.b.c.g.j.f.d;
                if (fVar != null) {
                    fVar.m.incrementAndGet();
                    Handler handler = fVar.q;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            }
            return;
        }
        Objects.requireNonNull(it.next());
        throw new UnsupportedOperationException();
    }
}
