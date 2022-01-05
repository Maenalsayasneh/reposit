package i0.h.a.d.a.g;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.Nullable;
import i0.h.a.d.a.e.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class c<StateT> {
    public final f a;
    public final IntentFilter b;
    public final Context c;
    public final Set<a<StateT>> d = new HashSet();
    @Nullable
    public b e = null;
    public volatile boolean f = false;

    public c(f fVar, IntentFilter intentFilter, Context context) {
        this.a = fVar;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public abstract void a(Context context, Intent intent);

    public final void b() {
        b bVar;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            b bVar2 = new b(this);
            this.e = bVar2;
            this.c.registerReceiver(bVar2, this.b);
        }
        if (!this.f && this.d.isEmpty() && (bVar = this.e) != null) {
            this.c.unregisterReceiver(bVar);
            this.e = null;
        }
    }

    public final synchronized void c(StateT statet) {
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(statet);
        }
    }
}
